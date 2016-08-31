package com.memebox.data.anlytics.util;

import com.google.common.collect.Lists;
import com.memebox.data.anlytics.udf.CountNumOfArray;
import junit.framework.Assert;
import junit.framework.TestCase;
import org.apache.hadoop.io.Text;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class UtilsTest extends TestCase {

    @Rule
    public final ExpectedException exception = ExpectedException.none();


    @Test
    public void testGetArrayFromStringParamTwo() {
        Assert.assertEquals(Lists.newArrayList("[111", "222", "333]"),
                Utils.getArrayFromString(new Text("[111,222,333]"),
                        new Text(",")));
    }

    @Test
    public void testGetArrayFromStringParamThree() {
        Assert.assertEquals(Lists.newArrayList("111", "222", "333"),
                Utils.getArrayFromString(new Text("[111,222,333]"),
                        new Text(","),
                        new Text("[,]")));
    }

//    @Test
//    public void testUDFNullCheck() {
//        CountNumOfArray example = new CountNumOfArray();
//        exception.expect(IllegalArgumentException.class);
//        example.evaluate(null, null);
//    }

}