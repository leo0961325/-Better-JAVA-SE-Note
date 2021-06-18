import java.util.*;

public class MapKeySet {


    public static void main(String[] args) {

        /**
         * 虽然使用keyset及entryset来进行遍历能取得相同的结果
         * 但两者的遍历速度是有差别的
         *
         * keySet():迭代后只能通过get()取key 
         * entrySet()：迭代后可以e.getKey()，e.getValue()取key和value。返回的是Entry接口 
         *
         * 说明：keySet()的速度比entrySet()慢了很多，也就是keySet方式遍历Map的性能不如entrySet性能好
         * 为了提高性能，以后多考虑用entrySet()方式来进行遍历
         */
        Map<String,String> map = new HashMap<String,String>();

        map.put("01", "aaa");
        map.put("02","bbb");
        map.put("03", "wangwu");
        map.put("04","leo");

        System.out.println("<=====================map.keySet();====================================>");

        //第一種  keySet()
        Set<String> keySet = map.keySet();

        Iterator<String> mapIterator = keySet.iterator();

        while (mapIterator.hasNext()){

            String key = mapIterator.next();
            String value = map.get(key);

            System.out.println("key : " + key + "->>>>>>"+ "value : " +value );

        }

        System.out.println("<=====================map.entrySet() <Iterator>====================================>");


        //第二種  map.entrySet() <Iterator>
        Set<Map.Entry<String,String>> map2 = map.entrySet();

        Iterator<Map.Entry<String, String>> it2 = map2.iterator();

        while (it2.hasNext()){
            Map.Entry<String, String> next = it2.next();

            String key = next.getKey();
            String value = next.getValue();

            System.out.println(key + " : " + value );

        }
        System.out.println("<======================map.entrySet() 直接用for===================================>");


        //第三種 map.entrySet() 直接用for
        for (Map.Entry<String,String> entry : map.entrySet()){

            System.out.println(entry.getKey() + ":: " + entry.getValue());

        }

        System.out.println("<=====================lambda====================================>");
        //第四種 lambda
        map.forEach((K , V) -> System.out.println( "lambda :" + K + "-> " + V));


        //第五種 iterator
        System.out.println("<=========================iterator================================>");
        Set set = map.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){

            Map.Entry entry = (Map.Entry) iterator.next();

            System.out.println(entry.getKey() + ":" + entry.getValue());
        }


    }








}
