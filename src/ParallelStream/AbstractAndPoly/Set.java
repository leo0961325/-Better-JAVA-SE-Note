package ParallelStream.AbstractAndPoly;

public class Set {

    public static void main(String[] args) {

        Role role = new Sword();
        role.setBlood(200);
        role.setName("leo");
        role.setLevel(10);

        drawFight(role);
        //靜態方法直接透過 "." 去獲取
        Set.drawFight(role);
    }
    static void drawFight(Role role){
        System.out.println(role.getName() + "--->");
        role.atk(role);
    }

}
