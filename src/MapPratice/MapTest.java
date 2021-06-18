package MapPratice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class MapTest {


    public static void main(String[] args) throws IOException {

        //Map messages = new TreeMap();
        
        //Map messages =new TreeMap<String,String>((s1,s2) -> -s1.compareTo(s2));

        Map<String,Integer> messages = new HashMap();
        messages.put("liao",1);
        messages.put("siting",2);
        messages.put("duck",3);



//       messages.keySet().forEach(key -> System.out.println(key));
//
//       messages.values().forEach(key -> System.out.println(key));

//
//        Iterator<String> iterator = messages.keySet().iterator();
//        while (iterator.hasNext()){
//            String key = iterator.next();
//            System.out.println(key + ":" + messages.get(key));
//        }
        /**
         * Map的lambda
         */
        messages.forEach((K,V) -> System.out.printf("(%s : %d)",K,V));

        /**
         * Map Entry
         */
        Iterator<Map.Entry<String, Integer>> iterator = messages.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println(entry.getKey() + "　：" + entry.getValue());
        }

        Map map = new HashMap();
        map.put("leo",5);
        map.put("kkk",10);
        map.forEach((k,v) -> System.out.println(k+":"+v));
    }




}
