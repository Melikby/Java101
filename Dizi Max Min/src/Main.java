import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] list = {15,12,788,1,-1,-778,2,0};
        int min = list[0];
        int max = list[0];
        System.out.println("Dizi : " + Arrays.toString(list));
        System.out.print("Girilen sayı : ");
        int number = input.nextInt();
        Arrays.sort(list);
        for (int i : list) {
            if (i < number) {
                min = i;
            }
            if (i > number) {
                max = i;
                break;
            }
        }
        System.out.println("Girilen sayıdan en küçük yakın sayı : " + min);
        System.out.println("Girilen sayıdan en büyük yakın sayı :" + max);
    }
}
