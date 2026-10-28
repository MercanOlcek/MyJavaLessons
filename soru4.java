import java.util.Scanner;
import java.util.Random;

public class soru4 {  
 public static void main(String[] args) {  
 Scanner input = new Scanner(System.in);  
 Random rnd = new Random();  
 System.out.print("Kaç sayı üretilecek: ");  

 int n = input.nextInt();  
 int toplam = 0;  
 int enKucukTek = 21;  

 for (int i = 0; i < n; i++) {  
    int sayi = rnd.nextInt(20) + 1;  
    System.out.println(sayi);  

 if (sayi % 2 == 0) { toplam += sayi; } 
 
 System.out.println("Çift sayıların toplamı: " + toplam);  
 if (enKucukTek == 21) { System.out.println("Tek sayı üretilmedi."); }   
 
 else { System.out.println("En küçük tek sayı: " + enKucukTek); }   }  
} 
    }
