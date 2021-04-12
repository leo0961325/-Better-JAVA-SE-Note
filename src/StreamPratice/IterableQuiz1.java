package StreamPratice;

import java.util.stream.Stream;

public class IterableQuiz1 {


    static class Tuple{

        Integer first;
        Integer second;

        public Tuple(Integer first, Integer second) {
            this.first = first;
            this.second = second;
        }
    }

    /**
     * 無限流
     * 費波納契數為例子
     * @param args
     */
    public static void main(String[] args) {

        //tuple (0,1)
        //next [0] = prev tuple [1]
        //next [1] = prev {tuple[0] + tuple[1]}
        // 0 ,1 ,1,2,3,5,8,13,21,34,55,89
                        //初始值           //第一個數是就是上一個元組 第2個數 ， 第二個數是上一個元組的加總
        Stream.iterate(new Tuple(0,1) , tuple -> new Tuple(tuple.second , tuple.first+ tuple.second))
                .limit(20)
                .forEach(tuple -> System.out.println( "(" +tuple.first + "," + tuple.second + ")"));



    }






}
