import java.util.Scanner;

public class Mukemmelsayibulma {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Sayı Giriniz :");
        int number = inp.nextInt();
        int total=0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                total += i;
            }
        }
        if (total == number) {
            System.out.println(number + " Mukemmel Bir Sayidir.");

        } else System.out.println(number + " Mukemmel Bir Sayi Degildir.");
    }
}