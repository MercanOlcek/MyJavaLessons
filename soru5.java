import java.util.Scanner; 

public class soru5 { 

    public static void main(String[] args) { 

        Scanner input = new Scanner(System.in); 

        System.out.print("Taban değerini girin: "); 
        int taban = input.nextInt(); 
        System.out.print("Üs değerini girin: ");
        int us = input.nextInt();
        int carpim=1;
        for ( int i = 1; i <= us; i++) { 
            carpim *= taban;


        }

        if (carpim > 100) { 
            System.out.println("Büyük"); 
        }
        else if (carpim == 100) {
            System.out.println("Eşit"); 
        }
        else {
            System.out.println("Küçük"); 
        }


        }
        
}