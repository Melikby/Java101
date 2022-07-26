import java.util.Scanner;

public class CinZodyagi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int dg;
        double bölüm;
        System.out.print("Doğum Tarihinizi Giriniz: ");
        dg = input.nextInt();
        bölüm = dg % 12;

        if (bölüm==0){
            System.out.println("Çin zodyağı burcunuz : Maymun");
        }
        if (bölüm==1){
            System.out.println("Çin zodyağı burcunuz : Horoz");
        }
        if (bölüm==2){
            System.out.println("Çin zodyağı burcunuz : Köpek");
        }
        if (bölüm==3){
            System.out.println("Çin zodyağı burcunuz : Domuz");
        }
        if (bölüm==4){
            System.out.println("Çin zodyağı burcunuz : Fare");
        }
        if (bölüm==5){
            System.out.println("Çin zodyağı burcunuz : Öküz");
        }
        if (bölüm==6){
            System.out.println("Çin zodyağı burcunuz : Kaplan");
        }
        if (bölüm==7){
            System.out.println("Çin zodyağı burcunuz : Tavşan");
        }
        if (bölüm==8){
            System.out.println("Çin zodyağı burcunuz : Ejderha");
        }
        if (bölüm==9){
            System.out.println("Çin zodyağı burcunuz : Yılan");
        }
        if (bölüm==10){
            System.out.println("Çin zodyağı burcunuz : At");
        }
        if (bölüm==11){
            System.out.println("Çin zodyağı burcunuz : Koyun");
        }
    }

}
