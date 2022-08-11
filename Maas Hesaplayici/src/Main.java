import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen adinizi ve soyadinizi giriniz : ");
        String name = scanner.nextLine();
        System.out.print("Lutfen maasinizi giriniz : ");
        double salary = scanner.nextDouble();
        System.out.print("Lutfen calisma saatinizi giriniz : ");
        int workHours = scanner.nextInt();
        System.out.print("Lutfen baslangic yilinizi giriniz : ");
        int hireYear = scanner.nextInt();
        Employee employee = new Employee(name, salary, workHours, hireYear);

        employee.tax();
        employee.bonus();
        employee.raiseSalary();
        employee.bilgiYazdir();
    }

}








