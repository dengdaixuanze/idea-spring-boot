package com.xup.test;

import java.nio.ByteBuffer;

public class Test {
    private String str;

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public Test() {
    }

    public Test(String str) {
        this.str = str;
    }

    public static void main(String[] args) {
        Test2 test2 = new Test2();
        test2.show();
    }

}
