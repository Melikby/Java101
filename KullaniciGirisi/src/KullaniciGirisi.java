import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        String userName, passWord, yenileme, newPassword;

        Scanner in = new Scanner(System.in);

        System.out.print("Kullanıcı Adınızı Giriniz: ");
        userName = in.nextLine();

        System.out.print("Şifrenizi Giriniz: ");
        passWord = in.nextLine();

        if (userName.equals("patika") && passWord.equals("123")) {
            System.out.print("Giriş Yaptınız.");
        } else {
            System.out.println("  Hatali sifre girdiniz yeni sifre belirtmek isterseniz \"yes\"  istemezseniz \" no\"  secin  ");
            yenileme = in.nextLine();

            if (yenileme.equals("no")) {
                System.out.println(" giris sonlandirildi ");
            } else if (yenileme.equals("yes")) {
                System.out.println(" yeni sifrenizi yazin ");
                newPassword = in.nextLine();

                if (newPassword.equals("java") || newPassword.equals(passWord)) {
                    System.out.println(" Hatali giris tekrar dene ");
                } else {
                    System.out.println(" sifrenizi basariyla yenilendi ");

                }

            } else {
                System.out.println(" hatali secim sectiniz ");

            }


        }

    }
}


