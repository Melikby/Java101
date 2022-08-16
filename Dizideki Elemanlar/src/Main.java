import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        double total;
        float result = 0;
        for (int i : numbers) {
            result += 1f / i;
        }
        total = numbers.length / result;

        System.out.println(total);
    }
}

