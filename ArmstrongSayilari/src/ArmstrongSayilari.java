import java.util.Scanner;

public class ArmstrongSayilari {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz :");
        int number = input.nextInt();
        int adet=0,toplam=0;
        while(number !=0) {
        toplam+=(number%10);
        number/=10;
        ++adet;
        }
        System.out.println("Basamak Sayısı : "+ adet);
        System.out.println("Basamak Toplamı : "+ toplam);


    }
}
