public class LG extends Telephone {

    private  int face_id;

    public LG(String name, ClorEnum color, int face_id) {
        super(name, color);
        this.face_id = face_id;
    }


    public  void print() {
        System.out.println("LG model" + getName() +
        "\nColor:" +getColor() +
        "\nFace_id:" + face_id +
                "\n------------------------");

    }
}
