package KelasGuru;
import java.util.Scanner;
public class KelasGuruDriver {
    public static void main(String[] args) {
        //String-->int-->String-->String
        Scanner input = new Scanner(System.in);

        System.out.println("");
        System.out.println(" ~ Selamat Datang ~ ");
        System.out.println("");

        System.out.println("Name : ");
        String name = input.nextLine();

        System.out.println("Mapel : ");
        String mapel = input.nextLine();

        System.out.println("Status : ");
        String status = input.nextLine();

        System.out.println("NIP : ");
        int nip = input.nextInt();

        input.close();    

        System.out.println("");
        System.out.println("|--------------------------|");
        System.out.println("");

        KelasGuruObject baru = new KelasGuruObject(name, nip, mapel, status);
        baru.setId();
        System.out.println("--------------------------");
        //membuat Object
        //namaClass namaObject = new
        //Constructor
        KelasGuruObject BuPasha = new KelasGuruObject();
        KelasGuruObject PakThoriq = new KelasGuruObject();
        KelasGuruObject BuAul = new KelasGuruObject();
        KelasGuruObject PakFalah = new KelasGuruObject();
        KelasGuruObject BuJevi = new KelasGuruObject();

        BuPasha.setName(name="BuPasha");
        BuPasha.setNip(nip=1);
        BuPasha.setMapel(mapel="RPL");
        BuPasha.setStatus(status="Tetap");

        PakThoriq.setName(name="PakThoriq");
        PakThoriq.setNip(nip=2);
        PakThoriq.setMapel(mapel="TKJ");
        PakThoriq.setStatus(status="Tetap");

        BuAul.setName(name="BuAul");
        BuAul.setNip(nip=3);
        BuAul.setMapel(mapel="RPL");
        BuAul.setStatus(status="Tetap");

        PakFalah.setName(name="PakFalah");
        PakFalah.setNip(nip=4);
        PakFalah.setMapel(mapel="Bahasa Indonesia");
        PakFalah.setStatus(status="Tetap");

        BuJevi.setName(name="BuJevi");
        BuJevi.setNip(nip=5);
        BuJevi.setMapel(mapel="Bahasa Inggris");
        BuJevi.setStatus(status="Tetap");

        //mengakses method
        BuPasha.setId();
        System.out.println("--------------------------");

        PakThoriq.setId();
        System.out.println("--------------------------");

        BuAul.setId();
        System.out.println("--------------------------");

        PakFalah.setId();
        System.out.println("--------------------------");

        BuJevi.setId();
        System.out.println("--------------------------");

        System.out.println("");
        System.out.println(" ~ Terimakasih ~ ");   
        System.out.println("");
    }

}