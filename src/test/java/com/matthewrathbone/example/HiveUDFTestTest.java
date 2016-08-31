package com.matthewrathbone.example;

import junit.framework.Assert;
import junit.framework.TestCase;
import org.apache.hadoop.io.Text;
import org.junit.Test;

public class HiveUDFTestTest extends TestCase {

    @Test
    public void testUDF() {
        HiveUDFTest example = new HiveUDFTest();
        Assert.assertEquals("Hello Hive world", example.evaluate(new Text("world")).toString());
    }

    @Test
    public void testUDFNullCheck() {
        HiveUDFTest example = new HiveUDFTest();
        Assert.assertNull(example.evaluate(null));
    }
}