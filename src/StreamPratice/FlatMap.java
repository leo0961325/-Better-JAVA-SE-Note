package StreamPratice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {

    /**
     * FlatMap 扁平化Stream 合併起來，扁平化成一個流
     *
     * 此時將一個大流包含一個個小流，須將小流合併成一個流
     * 將小流合併成一個大流 : 用flatMap
     * @param args
     */
    public static void main(String[] args) {

        List<String> list = Arrays.asList("I am boy " , "She is a girl" , "But the Girl loves another Girl");

        list.stream()
                .map(m -> m.split("")) //分成三個流 但都還是Stream<String[]>(如下) 還是一個集合，所以打印會是亂數(沒有toString)
                .flatMap(Arrays::stream)    //合併成一個流
                .collect(Collectors.toList())
                .forEach(s -> System.out.println(s));


        list.stream()
                .map(m -> m.split(""))
                .map(s -> s.length)
                .collect(Collectors.toList())
                .forEach(strings -> System.out.println(strings));
    }








}
