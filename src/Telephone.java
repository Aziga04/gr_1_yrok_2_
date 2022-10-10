public abstract   class Telephone implements Printable{
    private  String Name;
    private  ClorEnum color;

    public Telephone(ClorEnum color) {
        this.color = color;
    }

    public Telephone(String name) {
        Name = name;
    }

    public Telephone(String name, ClorEnum color) {
        this.Name = name;
        this.color = color;
    }
    public String info(){
        return Name+color;
    }

    @Override
    public void print() {

    }
}
