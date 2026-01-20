import java.util.Scanner;

public class Main {

    static boolean ingilizceMi = false;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ===== DİL SEÇİMİ =====
        while (true) {
            System.out.println("1) Türkçe");
            System.out.println("2) English");
            System.out.print("Seçim / Choice: ");

            String dil = sc.nextLine();

            if (dil.equals("1")) {
                ingilizceMi = false;
                break;
            } else if (dil.equals("2")) {
                ingilizceMi = true;
                break;
            } else {
                System.out.println("Geçersiz seçim!");
            }
        }

        boolean calisiyorMu = true;

        // ===== ANA MENÜSÜ İÇİN =====
        while (calisiyorMu) {

            menuYazdir();

            if (ingilizceMi) {
                System.out.print("Your choice: ");
            } else {
                System.out.print("Seçimin: ");
            }

            String secim = sc.nextLine();

            switch (secim) {

                case "1":
                    oyunuBaslat();
                    break;

                case "2":
                    ayarlar();
                    break;

                case "3":
                    credits();
                    break;

                case "4":
                    calisiyorMu = false;
                    if (ingilizceMi) {
                        System.out.println("Exiting...");
                    } else {
                        System.out.println("Çıkılıyor...");
                    }
                    break;

                default:
                    if (ingilizceMi) {
                        System.out.println("Invalid choice!");
                    } else {
                        System.out.println("Geçersiz seçim!");
                    }
                    break;
            }

            if (calisiyorMu) {
                if (ingilizceMi) {
                    System.out.println("Press Enter to return to menu...");
                } else {
                    System.out.println("Menüye dönmek için Enter...");
                }
                sc.nextLine();
            }
        }

        sc.close();
    }

    // ===== MENÜ YAZDIRMA =====
    static void menuYazdir() {

        System.out.println("\n====================");

        if (ingilizceMi) {
            System.out.println("CHESS MENU");
        } else {
            System.out.println("SATRANÇ MENÜ");
        }

        System.out.println("====================");

        if (ingilizceMi) {
            System.out.println("1) New Game");
            System.out.println("2) Settings");
            System.out.println("3) Credits");
            System.out.println("4) Exit");
        } else {
            System.out.println("1) Yeni Oyun");
            System.out.println("2) Ayarlar");
            System.out.println("3) Credits");
            System.out.println("4) Çıkış");
        }
    }

    // ===== SAHTE OYUN() =====
    static void oyunuBaslat() {

        if (ingilizceMi) {
            System.out.println("Chess game started!");
            System.out.println("Demo version");
        } else {
            System.out.println("Satranç oyunu başladı!");
            System.out.println("Demo sürüm");
        }
    }

    // ===== AYARLAR =====
    static void ayarlar() {

        if (ingilizceMi) {
            System.out.println("Settings");
            System.out.println("Sound: On");
        } else {
            System.out.println("Ayarlar");
            System.out.println("Ses: Açık");
        }
    }

    // ===== CREDITS =====
    static void credits() {
        System.out.println("Credits");
        System.out.println("Developer: Nursena Karaduman");
        System.out.println("Project: Java Console Chess Menu");
    }
}
