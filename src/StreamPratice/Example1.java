package StreamPratice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Example1 {


    public static void main(String[] args) {

        //method1
        List<String> list = Arrays.asList("Hello" , "world");
        Stream<String> stream = list.stream();

        //method2
        String [] names = {"miko" , "duck" , "habbit"};
        Stream<String> arrStream = Arrays.stream(names);

        //method3
        Stream<String> streamOf = Stream.of("Just" , "Do" , "it");

        //Stream iterate( 初始 ; 條件式 ; 每次遞增)
        Stream.iterate(0,x -> x < 12 ,x -> x+2)
                .limit(5)
                .forEach(System.out::println);


    }









}
