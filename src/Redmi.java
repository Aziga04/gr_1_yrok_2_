public class Redmi extends Telephone{
    private  boolean miAccount;

    public Redmi(String name, ClorEnum color, boolean miAccount) {
        super(name, color);
        this.miAccount = miAccount;
    }

    public  void print() {
        System.out.println("Redmi model" + getName() +
                "\nColor:" + getColor() +
                "\nmiAccount:" + miAccount );
    }


}
