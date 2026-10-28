import java.util.Random;
import java.util.Scanner;

public class soru2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Bir sayı girin: ");
        int N = input.nextInt();
        int toplam = 0;
    
        for (int i = 0; i < N; i++) {
            int sayi =random.nextInt(10) +1;            
            System.out.println(sayi);
            if (sayi>5) {
                toplam += sayi;
            }
            }

        System.out.println("Toplam: " + toplam);

    }
}