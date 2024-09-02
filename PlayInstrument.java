package penilaian;
import java.util.Scanner;
//Buat Objek Class dari Driver Class berikut
public class PlayInstrument {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Instrumentnya a = new Instrumentnya();
        Instrumentnya b = new Instrumentnya("Piano", 200.0);
        Instrumentnya c = new Instrumentnya("Violin", 150.9);

        a.setType("Gitar");
        a.setPrice(101.5);
        a.print();
        b.print();
        c.print();
    }
}
