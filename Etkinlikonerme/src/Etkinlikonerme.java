import java.util.Scanner;

public class Etkinlikonerme {
    public static void main(String[] args) {
        int heat;
        Scanner input = new Scanner(System.in);

        System.out.print("Hava sıcaklığı giriniz: ");
        heat = input.nextInt();

        if (heat < 5) {
            System.out.println("Bu havada Kayak yapabilirsiniz.");
        } else if (heat >= 5 && heat <= 25) {
            if (heat <= 15) {
                System.out.println("Bu havada Sinemaya gidebilirsiniz.");
            }
            if (heat >= 10) {
                System.out.println("Bu havada Pikniğe gidebilirsiniz.");
            }
        }
        else if (heat >= 25) {
            System.out.print("Bu havada Yüzmeye gidebilirsiniz.");
        }

    }
}

