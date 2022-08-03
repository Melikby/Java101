import java.util.Scanner;

public class MinveMaxDegerleriBulma {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int n, number, min = 1, max = 1;

        System.out.print("Kac tane sayi gireceksiniz: ");
        n = inp.nextInt();
        for (int i = 1; i <= n; i++){
            System.out.print(i + ".sayiyi giriniz: ");
            number = inp.nextInt();

            if (i == 1){
                max = number;
                min = number;
            }

            if (number > max){
                max = number;
            }

            if (number < min){
                min = number;
            }
        }

        System.out.println("En buyuk sayi: " + max);
        System.out.println("En kucuk sayi: " + min);
    }
}
