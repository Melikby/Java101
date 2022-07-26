import java.util.Scanner;

public class Faktoriyelhesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, r, comb;
        int total = 1, totalr = 1, totalnr = 1;
         System.out.print("C(n,r) bicimindeki n degerini giriniz: ");
        n = input.nextInt();
        System.out.print("C(n,r) bicimindeki r degerini giriniz: ");
        r = input.nextInt();
        for (int i = 1; i <= n; i++) {
            total = total * i;
        }
        for (int j = 1; j <= r; j++) {
            totalr = totalr * j;
        }
        int fark = n - r;
        for (int k = 1; k <= fark; k++) {
            totalnr = totalnr * k;
        }
        comb = total / (totalr * totalnr);
        System.out.println("C(" + n + "," + r + ") = " + comb);
    }

}
