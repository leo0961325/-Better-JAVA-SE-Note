package StreamPratice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

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


        /**
         *  練習根據索引值找value
         *  map轉int
         *  int再轉obj
         */
        String [] strToInt= {"0","1","2","3","4"};;
        String [] strTxt = {"蛋糕","鳳梨" ,"香蕉","蘋果","牛奶"};

        Stream.of(strToInt).mapToInt(v -> Integer.parseInt(v)) //先將strToInt轉成Int索引模式
                      .mapToObj(inx -> strTxt[inx])  //再根據轉換成的int 丟到mapToObj找索引值
                      .forEach(s -> System.out.println(s));

    }












}
