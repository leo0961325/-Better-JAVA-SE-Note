package LambdaPratice;

import java.util.*;

public class LambdaTest {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Justin", "Monica", "Irene");

        Comparator<String> comparator = String::compareTo;


        String [] namesArray = {"Justin", "Monica", "Irene"};


        Arrays.sort(namesArray,comparator);

        System.out.println(Arrays.toString(namesArray));

        Arrays.sort(namesArray,String::compareToIgnoreCase);

        System.out.println(Arrays.toString(namesArray));


    }
}


