import java.util.Scanner;

public class sayibulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int girilenSayi = 0, adet = 0, toplam = 0;
        double ortalama;
        Scanner sc = new Scanner(System.in);

        System.out.print("Lütfen Bir Sayı Giriniz : ");
        girilenSayi = sc.nextInt();

        for (int i = 0; i <= girilenSayi; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                toplam += i;
                adet++;
            }
        }
        ortalama = toplam / (adet - 1);
        System.out.print("ortalama  :" + ortalama);
        sc.close();
    }
}