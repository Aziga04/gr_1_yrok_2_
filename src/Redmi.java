public class Redmi extends Telephone implements Printable{
    private  boolean miAccount;

    public Redmi(String name, ClorEnum color, boolean miAccount) {
        super(name, color);
        this.miAccount = miAccount;
    }

    @Override
    public void print() {
        System.out.println("Redmi" + miAccount);
    }
}
