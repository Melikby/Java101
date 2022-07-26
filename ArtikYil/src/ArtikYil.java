import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int yıl,a;
        double artık;
        System.out.print("Yılı Giriniz : ");
        yıl = input.nextInt();
        artık = yıl % 404;
        a=0;

        if (artık==a){
            System.out.print("Artık Yıldır.");

        }else{
            System.out.print("Artık Yıl Değildir.");
        }


    }


}