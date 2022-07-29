import java.util.Scanner;

public class HarmonikSayilariBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sayıyı Giriniz: ");
        int sayi = input.nextInt();
        double resault = 0.0;
        for (double i = 1; i <= sayi; i++) {
            resault += (1 / i);
        }
        System.out.println(resault);

    }

}
