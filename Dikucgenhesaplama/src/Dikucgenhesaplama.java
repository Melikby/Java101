import java.util.Scanner;

public class Dikucgenhesaplama {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);

        int a,b;
        double c;

        System.out.print("1.Kenari giriniz:");
        a= inp.nextInt();

        System.out.print("2.Kenari giriniz:");
        b= inp.nextInt();

        c = Math.sqrt((a*a)+(b*b));
        System.out.print("Hipotenus:" + c);



    }
}
