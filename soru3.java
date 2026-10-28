import java.util.Scanner;


public class soru3{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int toplam =0;
        int enyüksek = 0;

        for( int i=1;i<=5;i++){
            System.out.print(i + ". notu girin: ");
            int not = input.nextInt();
            toplam += not;
            enyüksek = Math.max(enyüksek, not);
        }
        
        double ortalama = toplam / 5.0;

        System.out.println("Ortalama: " + ortalama);
        System.out.println("En yüksek not: " + enyüksek);

        if(ortalama >= 50){
            System.out.println("Geçti");
        } else {
            System.out.println("Kaldı");
        }

        input.close();
  
      
    }
}