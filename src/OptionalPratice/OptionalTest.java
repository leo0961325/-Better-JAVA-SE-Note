package OptionalPratice;

import java.util.*;
import java.util.stream.Stream;

public class OptionalTest {


    public static void main(String[] args) {

        Optional<String> nickOptional = getNickName("Duke");
        System.out.println(nickOptional.orElse("Openhome Reader"));
        System.out.println(getNickName("Monica"));

        /**
         * JDK9 Optional API增強 -> ifPresentOrElse
         */
        getNickName("Duck").ifPresentOrElse(
                nickname -> System.out.printf("Hello %s%n",nickname),
                () -> System.out.println("Hello guest")
        );
        /**
         * Stream增強 iterate
         */
        Stream.iterate(4, x -> x <10 ,x ->x +1).forEach(System.out::println);


    }

    static Optional<String> getNickName(String name) {
        Map<String, String> nickNames = new HashMap<>();
        nickNames.put("Justin", "caterpillar");
        nickNames.put("Monica", "momor");
        nickNames.put("Irene", "hamimi");

        return Optional.ofNullable(nickNames.get(name));
    }

    /**
     *
     * @param username
     * @return
     */
    public static Optional<String> getDisplayName(String username){
        return getNickName(username).or(
                () -> getDisplayName(username)
        );

    }

    /**
     * 一般
     * @param usernames
     * @return
     */
    public Stream<String> getAvailableNickName(List<String> usernames){
        return usernames.stream()
                .map(username -> getNickName(username))
                .filter(opt -> opt.isPresent())
                .map(opt -> opt.get());

    }
//
//    public Stream<String> getAvailableNickNameFlatMap(List<String> usernames){
//        return usernames.stream()
//                .map(this::getNickName)
//                .flatMap(Optional::stream);
//    }








}
