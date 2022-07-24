
import java.util.Scanner;

public class Hesapmakinesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2, select;

        System.out.print("ilk sayıyı giriniz:");
        n1 = input.nextInt();

        System.out.print("ikinci sayıyı giriniz:");
        n2 = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminz: ");
        select = input.nextInt();

        switch (select){
            case 1:
                System.out.print("Toplam : " + (n1 + n2));
                break;
            case 2:
                System.out.print("Çıkarma : " + (n1 - n2));
                break;
            case 3:
                System.out.print("Çarpma : " + (n1 * n2));
                break;
            case 4:
                if(n2!=0) {
                    System.out.print("Bölme : " + (n1 / n2));
                }
                else {
                    System.out.print("0 Bölünmez");
                }
                break;
            default :
                System.out.print("Hatalı işlem yaptınız.");

        }
    }

}
