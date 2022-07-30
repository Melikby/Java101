import java.util.Scanner;

public class ATMprojesi {
    public static void main(String[] args) {
        String username, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;
        while (right > 0) {
            System.out.print("Kullanıcı adı giriniz: ");
            username = input.nextLine();
            System.out.print("Şifre giriniz: ");
            password = input.nextLine();
            if (username.equals("patika") && password.equals("dev123")) {
                System.out.print("Türkiye bankasına hoşgeldiniz.\nYapmak istediğiniz işlem seçiniz\n");
                do {
                    System.out.println("1- Para yatırma\n" + "2-Para çekme\n" + "3-Bakiye Sorgula\n" + "4-Çıkış yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz :");
                    select = input.nextInt();

                    switch (select) {
                        case 1:
                            System.out.println("Para miktarı: ");
                            int price = input.nextInt();
                            balance += price;
                            System.out.print("Bakiyeniz " + balance);
                            break;
                        case 2:
                            System.out.println("Çekme istediğiniz tutar: ");
                            int price2 = input.nextInt();
                            if (price2 > balance) {
                                System.out.println("Yetersiz bakiye");
                                break;
                            } else {
                                balance -= price2;
                                System.out.println("Bakiyeniz: " + balance);
                            }
                            break;
                        case 3:
                            System.out.println("Mevcut Bakiyeniz: " + balance);
                            break;
                    }
                } while (select != 4);
                System.out.println("Tekrar görüşmek üzere :)");
                break;
            } else {
                right--;
                System.out.println("Hatalı kullanıcı veya şifre girdiniz tekrar deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabınız bloke oldu. Bankayla iletişime geçiniz.");
                } else {
                    System.out.println("Kalan Hakkınız : " + right);
                }
            }
        }
    }
}

