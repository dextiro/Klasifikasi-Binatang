public class Driver {
    public static void main (String[] args){
        Kucing k = new Kucing("Gembrong",4,"Meong-meong", "Hitam");
        k.displayData();
        System.out.println();
        Gajah g = new Gajah("Bobo",4,"Toreet-toreet", "Abu-abu");
        g.displayData();
        System.out.println();
        Beruang b = new Beruang("Grizzly",4,"Groooa-groooa", "Coklat");
        b.displayData();
        System.out.println();
    }
}
