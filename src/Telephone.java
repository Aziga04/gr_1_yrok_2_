public  abstract class Telephone implements Printable{
    private static String Name;
    private  ClorEnum color;



    public Telephone(String name, ClorEnum color) {
        this.Name = name;
        this.color = color;
    }

    public static String getName() {
        return Name;
    }

    public  ClorEnum getColor() {
        return color;
    }


}
