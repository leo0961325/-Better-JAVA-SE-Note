package LambdaPratice;

import java.util.*;

public class ForLoopEx {


    public static void main(String[] args) {


        List<String> company = new ArrayList<>();

        company.add("google");
        company.add("facebook");
        company.add("netflix");
        company.add("hills");
        company.add(null);
        company.add(null);

        /**
         * Iterator
         */

        Iterator<String> it = company.listIterator();

        while (it.hasNext()) {

            System.out.println(it.next());
        }
        /**
         * for loop
         */

        for (Integer i = 0; i < company.size(); i++) {

            System.out.println("------一般for loop------" + company.get(i));
        }
        /**
         * for each
         */
        for (String c : company) {
            System.out.println("foreach----::" + c);
        }

        /**
         *  Sort
         */
        //Collections.sort(company , String::compareTo);


        company.sort(Comparator.nullsLast(Comparator.reverseOrder()));
        System.out.println(company);

        /**
         * lambda
         */
        company.forEach(c -> System.out.println(c));

        /**
         * lambda + Optional
         */
        company.forEach(cc -> {
            System.out.println(Optional.ofNullable(cc));
            System.out.println("+++" + cc);
        });

        /**
         * lambda + stream
         */

        company.stream()
                .filter(Objects::nonNull)
                .forEach(cc -> System.out.println("stream-->" + cc));
    }
}










