import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int mesafe, yas, yolculukTipi;
        double fiyat;

        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi KM türünden giriniz: ");
        mesafe = input.nextInt();

        System.out.print("Yaşınızı giriniz: ");
        yas = input.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön, 2 => Gidiş Dönüş) :");
        yolculukTipi = input.nextInt();

        fiyat = mesafe * 0.10;

        if (mesafe <= 0 || yas <= 0 || (yolculukTipi != 1 && yolculukTipi != 2)) {
            System.out.print("Hatalı veri girdiniz!");
        } else {
            if (yas < 12) {
               fiyat *= 0.5;
            } else if (yas >= 12 && yas <= 24) {
                fiyat *= 0.9;
            } else if (yas >=65) {
                fiyat *= 0.7;
            }
        }

        if (yolculukTipi == 2) {
            fiyat *= 1.8;
        }

        System.out.print("Toplam Tutar: " +fiyat + " TL");
    }
}