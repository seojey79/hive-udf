package com.matthewrathbone.example;

import org.apache.hadoop.hive.ql.exec.Description;
import org.apache.hadoop.hive.ql.exec.UDF;
import org.apache.hadoop.io.Text;

/**
 * Created by kimjun on 16. 8. 30..
 */

@Description(
        name="HiveUDFTest",
        value="returns 'hello x', where x is whatever you give it (STRING)",
        extended="SELECT simpleudfexample('world') from foo limit 1;"
)
public class HiveUDFTest extends UDF {

    public Text evaluate(Text input) {
        if(input == null) return null;
        return new Text("Hello Hive " + input.toString());
    }
}
