public class Main {
    public static void main(String[] args) {
        Printable[] print={createObject("Redni"),createObject("lg"),createObject("Motorola")};
        for (Printable printable:print) {
            printable.print();

        }

    }

    public static Printable createObject(String Telephone){
        switch (Telephone){
            case "Redni":
                Redmi redmi = new Redmi("X",ClorEnum.Black,true);
                return  redmi;
            case "Samsung" :
                LG lg = new LG("S21",ClorEnum.White,true);
                return lg ;
            case "<Motorola>":
                Motorola motorola = new Motorola("Poco X3",ClorEnum.red,69);
                return  motorola;
        }

        return null;

    }
}

