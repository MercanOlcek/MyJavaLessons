import java.util.Scanner;
public class soru1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int N = input.nextInt();
        
        int adet = 0;     //sayaç
        int toplam = 0;   //sayaç
  
        for ( int i = 1; i <=N; i++){
            if (i %3 ==0) {
                adet++;
                toplam += i;
            }
        }
        System.out.println("Toplam: " + toplam);
        System.out.println("Adet: " + adet);
    }
}