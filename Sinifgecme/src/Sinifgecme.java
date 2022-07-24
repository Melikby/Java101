import java.util.Scanner;

public class Sinifgecme {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int mat, turkce, fizik, kimya, muzik;

        System.out.print("Matematik Notunuzu Giriniz: ");
        mat = inp.nextInt();

        System.out.print("Türkçe Notunuzu Giriniz: ");
        turkce = inp.nextInt();

        System.out.print("Fizik Notunuzu Giriniz: ");
        fizik = inp.nextInt();

        System.out.print("Kimya Notunuzu Giriniz: ");
        kimya = inp.nextInt();

        System.out.print("Müzik Notunuzu Giriniz: ");
        muzik = inp.nextInt();

        if (mat < 0 || mat > 100) mat = 0;
        if (turkce < 0 || turkce > 100) turkce = 0;
        if (fizik < 0 || fizik > 100) fizik = 0;
        if (kimya < 0 || kimya > 100) kimya = 0;
        if (muzik < 0 || muzik > 100) muzik = 0;

        double average = (mat + turkce + fizik + kimya + muzik) / 5d;
        if (average < 55) {
            System.out.print("Sınıfta Kaldınız.");

        } else {
            System.out.print("Sınıfı Geçtiniz.");
        }
        System.out.print("Ortalamanız: " + average);


    }


}
