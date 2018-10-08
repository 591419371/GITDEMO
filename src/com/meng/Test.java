package com.meng;

import java.util.ArrayList;
import java.util.List;

public class Test {

    private String name;

    private String age;

    private String as;

    private String ww;

    public static final String asd = "ss";

    /**
     * ss
     */
    private String aa;

    /**
     * aa
     */
    private int aaa;

    private int lalal;

    private String aaaa;

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(111);
        }
        int a = 22;
        f1(a);
    }

    private static void f1(int a) {
        lalal();

        ya(a);
    }

    private static void ya(int a) {
        String name = "asdasd";
        int age = 23;
        String a1 = String.format("name: %s, age: %d", name, age);

        System.out.println(a1 + a);
    }

    private static void lalal() {
        List<String> list = new ArrayList<>();

        for (String item : list) {
            System.out.println(item);
        }
    }

}
