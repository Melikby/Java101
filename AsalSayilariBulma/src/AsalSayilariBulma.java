import java.util.Scanner;

public class AsalSayilariBulma {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz: ");
        int n = inp.nextInt();

        System.out.println("\nAsal Sayılar: ");

        for (int i = 2; i <= n; i++) {
            int sayac = 0;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    sayac++;
                }
            }

            if (sayac == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
