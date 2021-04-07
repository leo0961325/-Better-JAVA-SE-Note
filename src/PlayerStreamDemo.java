import java.util.List;
import java.util.stream.Collectors;

public class PlayerStreamDemo {


    public static void main(String[] args) {

        List<Player> players = List.of(
                new Player("Justin", 38),
                new Player("Monica", 20),
                new Player("Irene", 5),
                new Player("Fucker", 99)
        );


        players.stream()
                .filter(player -> player.getAge() > 15)
                .map(Player::getName)
                .map(String::toUpperCase)
                .collect(Collectors.toList())
                .forEach(System.out::println);


    }














}
