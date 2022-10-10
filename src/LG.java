public class LG extends Telephone implements Printable {

    private boolean face_id;

    public LG(String name, ClorEnum color, boolean face_id) {
        super(name, color);
        this.face_id = face_id;
    }

    public  void print() {
        System.out.println("LG model" + face_id);

    }
}
