package com.memebox.data.anlytics.udf;


import junit.framework.Assert;
import junit.framework.TestCase;
import org.apache.hadoop.io.Text;
import org.junit.Test;

public class CountNumOfArrayTest extends TestCase {

    @Test
    public void testUDFParamTwo() {
        CountNumOfArray example = new CountNumOfArray();
        Assert.assertEquals(new Integer(3), example.evaluate(new Text("[111,222,333]"), new Text(",")));
    }

    @Test
    public void testUDFParamThree() {
        CountNumOfArray example = new CountNumOfArray();
        Assert.assertEquals(new Integer(3), example.evaluate(new Text("[111,222,333]"), new Text(","), new Text("[,]")));
    }

//    @Test
//    public void testUDFNullCheck() {
//        CountNumOfArray example = new CountNumOfArray();
//        Assert.assertNull(example.evaluate(null, null));
//    }

}