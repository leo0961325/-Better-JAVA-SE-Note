package ParallelStream;

import java.util.List;

public class ParallelStream {

    /**
     * ParallelStream 平行化處理
     * @param args
     */

    public static void main(String[] args) {

        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9);

        numbers.stream()
                .forEach(System.out::println);

        System.out.println("==========parallelStream=========");

        //forEachOrdered 使平行處理順序跟Stream一樣
        numbers.parallelStream()
                .forEachOrdered(System.out::println);


    }






}
