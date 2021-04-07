public enum TestEnum {

    RED("紅色" , 1),
    GREEN("綠色",2),
    BLUE("藍色",3);

    TestEnum(String color , Integer code) {
        this.color = color;
    }


    String color ;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}



