import java.util.Scanner;

public class UsluSayiHesaplama {
    static int result = 1;

    static int power(int x, int y) {
        if (x == 0) {
            return 1;
        }
        result *= y;
        power(x - 1, y);
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, y;
        System.out.print("Taban sayısını giriniz: ");
        y = input.nextInt();
        System.out.print("Üs değerini giriniz : ");
        x = input.nextInt();

        System.out.println(power(x, y));


    }
}
