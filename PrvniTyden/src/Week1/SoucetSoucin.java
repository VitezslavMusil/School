package Week1;
import java.util.Scanner;
public class SoucetSoucin {
    public static void main(String[] args) {
         // VVV vstup VVV
        Scanner number = new Scanner(System.in);
        System.out.println("Zadejte prosím první číslo");
        int a = number.nextInt();
        System.out.println("Zadejte prosím druhé číslo");
        int b = number.nextInt();
        // VVV postup VVV
        int c = a + b;
        int d = a * b;
        // VVV výstup VVV
        System.out.println("Součet čísel " + a + " a " + b + " se rovná " + c + " a jejich součin je " + d + ".");
        
    }
}