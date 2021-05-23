public class Driver {
    public static void main (String[] args){

        System.out.println("\t\t\t +----------------------------------------+");
        System.out.println("\t\t\t |  KLASIFIKASI BINATANG SESUAI JENISNYA  |");
        System.out.println("\t\t\t +----------------------------------------+\n");

        Kucing k = new Kucing("Kucing",4,"Meong-meong", "Hitam");
        k.displayData();
        System.out.println();
        Gajah g = new Gajah("Gajah",4,"Toreet-toreet", "Abu-abu");
        g.displayData();
        System.out.println();
        Beruang b = new Beruang("Beruang",4,"Groooa-groooa", "Coklat");
        b.displayData();
        System.out.println();
    }
}
