import java.util.Scanner;

public class Vucutkitleindeksi {
    public static void main(String[] args) {
       Scanner inp= new Scanner(System.in);

       System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz :");
       double m;
       m = inp.nextDouble();

       System.out.print("Lütfen kilonuzu giriniz:");
       int kg;
       kg = inp.nextInt();

       double sonuc=(kg/(m*m));
       System.out.println("Vücut Kitle İndeksiniz :" + sonuc);



    }
}
