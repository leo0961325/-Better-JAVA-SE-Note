package Compare;

import Compare.StringOrder;

import java.util.Arrays;

public class StringOrderDemo {


    public static void main(String[] args) {

        String[] names = {"Justin", "caterpillar", "zzush"};
        Arrays.sort(names,(name1 , name2) -> StringOrder.byLength(name1,name2));

        //Arrays.sort(names,Compare.StringOrder::byLength);
        System.out.println(Arrays.toString(names));

        Arrays.sort(names,String::compareToIgnoreCase);
        System.out.println(Arrays.toString(names));


    }






}
