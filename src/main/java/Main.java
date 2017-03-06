import com.houbank.constants.WeekEnum;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Main  {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println(WeekEnum.existsDay(3));
        System.out.println(WeekEnum.WENDESDAY.getDay());
        if (1 == 2) {
        } else {
        }
        StringBuffer sb = new StringBuffer();
        Main.sayHi("小明", "我来自农村，喜欢游泳，捉迷藏等游戏");

        ConcurrentHashMap<String,String> map=new ConcurrentHashMap<String,String>();
        map.put("小明","游泳");
        map.put("大王","捉迷藏");
        map.put("小猴","跳皮筋");
        map.put("大力","掷铁饼");
        Iterator interator= (Iterator) map.entrySet().iterator();
        while (interator.hasNext()){
            Map.Entry entry= (Map.Entry) interator.next();
            System.out.println("key:{}"+entry.getKey());
            System.out.println("value:{}"+entry.getValue());
        }
        Arrays.asList("a","b","d").forEach((e)-> {
            System.out.println(e);
            System.out.println(e);
        });
    }

    public static void sayHi(String man, String content) {
        System.out.println(man + "说:" + content);
    }

    public  void mapForReach(){
        Map<String,String> map =new HashMap<>();



    }

}
