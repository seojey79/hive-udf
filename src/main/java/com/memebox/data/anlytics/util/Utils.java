package com.memebox.data.anlytics.util;

import com.google.common.collect.Lists;
import org.apache.hadoop.io.Text;
import org.datanucleus.util.StringUtils;

import java.util.List;

/**
 * Created by kimjun on 16. 8. 31..
 */
public class Utils {

    public static List<String> getArrayFromString(Text input, Text delimiter) {
        return getArrayFromString(input, delimiter, null);
    }


    public static List<String> getArrayFromString(Text input, Text delimiter, Text exceptedCharList) {

        if (input == null || input.getLength() <= 0 ) {
            throw new IllegalArgumentException("inputVal is null");
        }

        if (StringUtils.isEmpty(delimiter.toString())) {
            throw new IllegalArgumentException("delimiter is null");
        } else if (delimiter.toString().length() > 1) {
            throw new IllegalArgumentException("delimiter is over");
        }

        String inputVal = input.toString();

        if (exceptedCharList != null && exceptedCharList.getLength() > 0) {
            String exceptedCharListVal = exceptedCharList.toString();
            String [] exceptedChList = exceptedCharListVal.split(",");
            for (String ch: exceptedChList) {
                inputVal = StringUtils.replaceAll(inputVal, ch.toString(), "");
            }
        }

        return Lists.newArrayList(inputVal.split(delimiter.toString()));
    }
}
