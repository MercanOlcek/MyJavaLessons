
import java.util.Scanner;

public class soru6 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        final double fiyat = 150;
        double toplam = 0.0;

        while (true) {

            System.out.print("Yaşınızı girin (bitirmek için 0): ");
            int yas = input.nextInt();

            if (yas == 0) {
                break;
            }

            System.out.print("Bu yaştan kaç bilet alınacak: ");
            int adet = input.nextInt();

            if (adet == 0) {
                break;
            }

            double indirimliFiyat = fiyat;

            if (yas < 12) {
                indirimliFiyat = fiyat * 0.50;
                System.out.println("Çocuk indirimi uygulandı.");
            } else if (yas >= 65) {
                indirimliFiyat = fiyat * 0.70;
                System.out.println("Yaşlı indirimi uygulandı.");
            }

            double grupTutari = indirimliFiyat * adet;
            toplam += grupTutari;

            System.out.println("Bu grubun toplamı: " + grupTutari + " TL");
            System.out.println("Şu ana kadarki genel toplam: " + toplam + " TL");
            System.out.println();
        }

        System.out.println("Toplam sinema masrafı: " + toplam + " TL");

        input.close();
    }
}
