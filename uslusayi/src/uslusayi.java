import java.util.Scanner;

public class uslusayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, k;

        System.out.print("Üssü alınacak sayı : ");
        n = input.nextInt();
        System.out.print("Üs olacak sayı : ");
        k = input.nextInt();
        int total = 1;
        for (int i = 1; i <= k; i++) {
            total *= n;
        }
        System.out.print(total);

    }
}
