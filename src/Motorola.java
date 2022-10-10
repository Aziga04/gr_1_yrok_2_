public class Motorola extends Telephone implements Printable{

    private   int cameraMp;

    public Motorola(String name, ClorEnum color, int cameraMp) {
        super(name, color);
        this.cameraMp = cameraMp;
    }

    public  void print() {
        System.out.println("Motorola model" + cameraMp);
    }
}
