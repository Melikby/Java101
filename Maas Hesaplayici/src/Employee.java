public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;
    double vergi;
    double bonus;
    double zam;
    double toplam_maas;

    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public void tax() {
        if (salary <= 1000) {

        } else if (salary > 1000) {
            vergi = (salary * 3) / 100;


        }
    }

    public void bonus() {
        if (workHours < 40) {
            bonus = 0;

        } else if (workHours > 40) {

            bonus = (workHours - 40) * 30;

        }
    }

    public void raiseSalary() {
        if ((2022 - hireYear) < 10) {
            zam = (salary * 5) / 100;


        } else if ((2022 - hireYear) > 9 && (2022 - hireYear) < 20) {
            zam = (salary * 10) / 100;


        } else if ((2022 - hireYear) > 19) {
            zam = (salary * 15) / 100;


        }
    }

    public void bilgiYazdir() {
        toplam_maas = (zam + salary + bonus) - vergi;
        System.out.println("Calisanin adi soyadi : " + name);
        System.out.println("Maasi : " + salary);
        System.out.println("Calisma saati : " + workHours);
        System.out.println("Baslangic yili : " + hireYear);
        System.out.println("vergi : " + vergi);
        System.out.println("bonus : " + bonus);
        System.out.println("zam : " + zam);
        System.out.println("vergi ve bonuslar ile birlikte maas : " + toplam_maas);

    }

}