package com.muks;

import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class MyMojoTests {
    @Test
    public void TestMojo() throws Exception {
        MyMojo mojo = new MyMojo();
        mojo.setMsg("RedRock");
        mojo.execute();
        //mojo.execute();
    }
}
