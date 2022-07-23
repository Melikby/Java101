import java.util.Scanner;

public class ManavKasaProgram {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);

        double armut=2.14, elma=3.67 , domates=1.11, muz=0.95, patlıcan=5;
        double armutkg, elmakg , domateskg, muzkg, patlıcankg;
        double a,e,d,m,p;

        System.out.print("Armut Kaç Kilo? :");
        armutkg= inp.nextDouble();
        a = armut * armutkg;

        System.out.print("Elma Kaç Kilo? :");
        elmakg = inp.nextDouble();
        e = elma * elmakg;

        System.out.print("Domates Kaç Kilo? :");
        domateskg = inp.nextDouble();
        d = domates * domateskg;

        System.out.print("Muz Kaç Kilo? :");
        muzkg = inp.nextDouble();
        m = muz * muzkg;

        System.out.print("Patlıcan Kaç Kilo? :");
        patlıcankg = inp.nextDouble();
        p = patlıcan * patlıcankg;

        System.out.print("Toplam Tutar: " +(a+e+d+m+p) + " TL");

    }
}
