public class Main {
    public static void main(String[] args) {
       creatObject("Redmi");
       creatObject("LG");
       creatObject("Motorola");
    }

    public static String creatObject(String Telephone){
        Redmi redmi = new Redmi("11 lite",ClorEnum.Black,true);
        LG lg = new LG("W 11", ClorEnum.red,4);
        Motorola motorola = new Motorola("E 30", ClorEnum.White, 68);
        switch (Telephone){
            case "Redmi":
                Redmi.print();
                break;
            case "Lg":
                lg.print();
                break;
            case  "Motorola":
                Motorola.print();
                break;
            default:

        }
        return Telephone;
    }
}