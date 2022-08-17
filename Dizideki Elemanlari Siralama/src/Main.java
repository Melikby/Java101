import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Dizinin Boyutu :");
        int n = inp.nextInt();
        int liste[] = new int[n];
        System.out.println("Dizinin elemanlarını giriniz : ");
        for (int i = 0; i < liste.length; i++) {

            System.out.print((i + 1) + ". Eleman:");
            liste[i] = inp.nextInt();
        }
        Arrays.sort(liste);
        System.out.println("Sıralama : "+Arrays.toString(liste));
    }
}
