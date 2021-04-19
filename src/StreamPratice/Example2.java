package StreamPratice;

import java.util.stream.Stream;

public class Example2 {


    public static void main(String[] args) {


        Stream<Integer> numberList = Stream.of(1,2,3,4,4,5,5,7,100,100);

        //distinct 列出不重複元素
//        numberList.distinct()
//                  .forEach(d -> System.out.println(d));

        //limit 取出前幾個

        numberList.limit(3)
                .forEach(l -> System.out.println(l));

        //skip 跳過幾個元素
        System.out.println("=====================");
        Stream.of(1,2,3,4,4,5,5,7,100,100).skip(3)
                .forEach(s -> System.out.println(s));


    }
}
