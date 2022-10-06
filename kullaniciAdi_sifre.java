import java.util.Scanner;

public class kullaniciAdi_sifre {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen kullanıcı adınızı giriniz: ");
        userName = input.nextLine();
        System.out.print("Lütfen şifrenizi giriniz: ");
        password = input.nextLine();
        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("giriş başarılı");
        } else if (userName.equals("patika") && !password.equals("java123")) {
            System.out.println("Şifre hatalı");
            int choice;
            Scanner input1 = new Scanner(System.in);
            System.out.print("Yeni şifre belirlemek için 1'e çıkış için 2'ye basın.");
            choice = input1.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("yeni parolanızı giriniz :");
                    Scanner input2 = new Scanner(System.in);
                    password = input2.nextLine();
                    if (!password.equals(password)) {
                        System.out.print("Parola başarıyla değiştirildi.");
                    } else if (password.equals("java123")) {
                        System.out.println("Şifreniz eski şifreniz ile aynı olamaz.");
                    } else if (password.equals(password)) {
                        System.out.println("Az öncekiyle aynı şifreyi girdiniz!");
                    }
                    break;
                case 2:
                    System.out.println("Çıkış yaptınız.");
                    break;
                default:
                    System.out.println("Hatalı tuşlama yaptınız");
            }
        } else {
            System.out.println("Hatalı giriş.");
        }
    }
}

