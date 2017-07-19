package com.houbank.io.xml;

import com.sun.org.apache.xml.internal.resolver.readers.SAXParserHandler;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import java.util.*;

public class Sax {

    public void create() throws Exception {

        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser=factory.newSAXParser();

        SAXParserHandler handler = new SAXParserHandler();
        parser.parse("user.xml", handler);



    }



    public void parser() {

    }

    public static void main(String[] args) {
//        Set<Integer> set=new LinkedHashSet<>();
//        set.add(1);
//        set.add(2);
//        System.out.println(set.add(3));




        Map<String,String> map=new HashMap();
        map.put("A","a");
        map.get("A");
//        map.put(1,2);
//        for(Map.Entry entry:map.entrySet()){
//            System.out.println(entry.getKey());
//
//        }
////        System.out.println("map.size:"+map.size());
//
//
//        String key="A";
//        int h;
//        int hash=(key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
//        System.out.println(hash);
////        System.out.println(2&5);
////        System.out.println("A".hashCode());
////        System.out.println(1+'A');
//        System.out.println( 4096 >>> 16);
//        int x=5;
//        x |= 2;
//        System.out.println(x);
//
//        System.out.println( 1 << 4);


        System.out.println();



    }

}
