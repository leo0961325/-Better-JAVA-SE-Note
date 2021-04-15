package StreamPratice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMap {


    public static void main(String[] args) {

        List<String> words = Arrays.asList("Java8" , "Lambda" , "Stream" , "Test");

        words.stream()
                .map(word -> {
                    System.out.println(word.length());
                    return word.length();
                })
                .collect(Collectors.toList())
                .forEach(w -> System.out.println(w));
    }










}
