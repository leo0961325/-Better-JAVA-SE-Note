package ParallelStream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PS2 {
    /**
     * ParallelStream 2
     * @param args
     */
    public static void main(String[] args) {

        //要重構的
        var numbers = List.of(1,2,3,4,5,6,78,9);
        var added10s =new ArrayList<>();

        for (Integer number : numbers){
            if(number > 5) {
                added10s.add(number+10);
                System.out.println(number);
            }
        }
        System.out.println("================方法1====================`");
        /**
         * 方法一
         */
        var biggerthan5 = numbers.stream()
                .filter(number -> number > 5)
                .collect(Collectors.toList());

        System.out.println(biggerthan5);
        var added11s = biggerthan5.stream()
                .map(number -> number+10)
                .collect(Collectors.toList());

        System.out.println(added11s);

        /**
         * 方法2 parallelStream 一次做完
         */
        System.out.println("================方法2====================`");
       numbers.parallelStream()
               .filter(number -> {
                   boolean isbiggerthan5 = number > 5;
                   if (isbiggerthan5){
                       added10s.add(number);
                   }
                   return isbiggerthan5;
               })
               .forEachOrdered(System.out::println);

        /**
         * 方法3 分兩次 一次做一個任務
         */
        System.out.println("================方法3====================`");

       var isBiggerthan52 = numbers.parallelStream()
               .filter(number -> number > 5)
               .collect(Collectors.toList());

        System.out.println(isBiggerthan52);

        var addOneList = isBiggerthan52.parallelStream()
                .map(number -> number + 10)
                .collect(Collectors.toList());
        System.out.println(addOneList);


    }


}
