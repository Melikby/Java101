import java.util.Scanner;

public class Ebobekokbulma {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n1, n2;
        boolean a = false;

        do {
            System.out.print("n1 Sayısını Giriniz: ");
            n1 = inp.nextInt();
            System.out.print("n2 Sayısını Griniz: ");
            n2 = inp.nextInt();
            if (n1 <= 0 || n2 <= 0) {
                System.out.println("Pozitif sayılar giriniz.");
            } else {
                a = true;
            }

        } while (!a);
        if (n2 < n1) {
            int tempN2 = n2;
            n2 = n1;
            n1 = tempN2;
        }
        int i = n1;
        while (i >= 1) {
            if ((n1 % i == 0) && (n2 % i == 0)) {
                System.out.println("Ebob: " + i);
                break;
            } else {
                i--;
            }
        }
        int j = n2;
        while (j <= (n1 * n2)) {
            if ((j % n1 == 0) && (j % n2 == 0)) {
                System.out.print("Ekok: " + j);
                break;
            } else {
                j++;
            }
        }
    }
}
