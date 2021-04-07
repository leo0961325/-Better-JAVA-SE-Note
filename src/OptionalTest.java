import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class OptionalTest {


    public static void main(String[] args) {

        Optional<String> nickOptional = getNickName("Duke");
        System.out.println(nickOptional.orElse("Openhome Reader"));

        System.out.println(getNickName("Monica"));;
    }

    static Optional<String> getNickName(String name) {
        Map<String, String> nickNames = new HashMap<>();
        nickNames.put("Justin", "caterpillar");
        nickNames.put("Monica", "momor");
        nickNames.put("Irene", "hamimi");

        return Optional.ofNullable(nickNames.get(name));
    }





}
