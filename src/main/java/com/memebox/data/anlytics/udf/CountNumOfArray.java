package com.memebox.data.anlytics.udf;

import com.memebox.data.anlytics.util.Utils;
import org.apache.hadoop.hive.ql.exec.Description;
import org.apache.hadoop.hive.ql.exec.UDF;
import org.apache.hadoop.io.Text;

import java.util.List;

/**
 * Created by kimjun on 16. 8. 31..
 */

@Description(
        name="CountNumOfArray",
        value = "returns 'number', where x is whatever you give it (STRING)",
        extended = "SELECT simpleudfexample('world') from foo limit 1;"
)
public class CountNumOfArray extends UDF {

    public Integer evaluate(Text input, Text delimiter) {

        return evaluate(input, delimiter, null);
    }

    public Integer evaluate(Text input, Text delimiter, Text exceptedCharList) {
        int ret = -1;

        List list = Utils.getArrayFromString(input, delimiter, exceptedCharList);

        if (list != null) {
            return list.size();
        }
        return ret;
    }
}
