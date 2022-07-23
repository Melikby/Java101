import java.util.Scanner;

public class KDVtutarihesaplama {
    public static void main(String[] args) {
        double tutar, kdvorani=0.18;
        Scanner inp= new Scanner(System.in);

        double ucret;
        System.out.print("Ucret Tutarini Giriniz: ");
        ucret = inp.nextDouble();

        double KDVtutarı= (ucret * kdvorani);
        System.out.print("Kdv Tutari: ");
        System.out.println(KDVtutarı);


        System.out.print("Toplam Tutar: ");
        System.out.println(KDVtutarı+ucret);

    }
}
