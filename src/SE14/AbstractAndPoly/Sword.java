package SE14.AbstractAndPoly;

public class Sword extends Role {

    String cat;

    public String getCat() {
        return cat;
    }

    public void setCat(String cat) {
        this.cat = cat;
    }

    @Override
    public void atk(Role role){
        System.out.println("atk!!");
    }







}
