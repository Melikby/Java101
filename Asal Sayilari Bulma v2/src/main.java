import java.util.Scanner;

public class main {


    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int a = inp.nextInt();
        asal(a, 2);
    }

    static void asal(int a, int i) {
        if (i == a) {
            System.out.print(a + " asal sayıdır.");
            return;
        } else if (a % i == 0) {
            System.out.print(a + " asal sayı değildir.");
            return;
        }

        asal(a, i + 1);

    }
}
