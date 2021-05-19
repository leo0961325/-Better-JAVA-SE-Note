package StreamPratice;

import java.util.Arrays;
import java.util.List;

public class ReduceStream {

    public static void main(String[] args) {

        List<Integer> numbers  = Arrays.asList(2,4,6,8,10);
        /**
         *  一般for Each
         */
        int sum = 0;
        for (int x : numbers){
            sum += x ;
        }
        System.out.println(sum);

        /**
         *  0是初始化數值
         * 必須接受2個引數 (X,Y)
         * Stream Reduce (x,y) x是上一個走訪結果 y是目前的
         */

        Integer reduceSum = numbers.stream()
                .reduce(0 , (x,y) -> {
                    System.out.println(x+y);
                    return x+y;
                });
        System.out.println(reduceSum);
    }












}
