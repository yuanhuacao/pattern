package com.houbank.constants.new8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Administrator on 2017/2/23.
 */
public class ListMain {

    public static void main(String[] args) {
        String [] str={"b","c","d"};

        System.out.println(str.getClass().getName());
        Arrays.asList("a","b").forEach(a-> System.out.println(a));
        List<String> list=new ArrayList();
        list.add("d");
        list.add("a");
        list.add("c");
        list.add("b");
        System.out.println(list);
        list.sort(( e1, e2)->e1.compareTo(e2));


        String a=",,a,b";
        String b="a,b,,";
        System.out.println(a.split(",").length);
        System.out.println(b.split(",").length);
        for (String c:b.split(",")) {
            System.out.println("c:"+c);
        }
    }
}
