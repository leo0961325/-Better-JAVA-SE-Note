package SE14.AbstractAndPoly;

public class Set {

    public static void main(String[] args) {

        Role role = new Sword();
        role.setBlood(200);
        role.setName("leo");
        role.setLevel(10);

        drawFight(role);

    }
    static void drawFight(Role role){
        System.out.println(role.getName() + "--->");
        role.atk(role);
    }

}
