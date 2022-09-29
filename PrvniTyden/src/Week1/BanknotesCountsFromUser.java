package Week1;
import java.util.Scanner;
public class BanknotesCountsFromUser {
    public static void main(String[] args) {
        Scanner suma = new Scanner(System.in);
         // VVV vstup VVV
        System.out.println("Zadejte prosím částku, jenž chcete rozměnit");
        int x = suma.nextInt();
        // VVV postup VVV
        int e = 0;
        int f = 0;
        int g = 0;
        int h = 0;
        int i = 0;
        int j = 0;
        int k = 0;
        while (x >= 100) {
        x = x - 100;
        e = e + 1;
        }
        while (x >= 50) {
        x = x - 50;
        f = f + 1;
        }
        while (x >= 20) {
        x = x - 20;
        g = g + 1;
        }
        while (x >= 10) {
        x = x - 10;
        h = h + 1;
        }
        while (x >= 5) {
        x = x - 5;
        i = i + 1;
        }
        while (x >= 2){
        x = x - 2;
        j = j + 1;
        }
        while (x >= 1){
        x = x - 1;
        k = k + 1;
        }
        // VVV výstup VVV
        System.out.println("Zadaná suma se dá rozměnit na " + e + "x 100 Kč, " + f + "x 50 Kč, " + g + "x 20 Kč, " + h + "x 10 Kč, " + i + "x 5 Kč, " + j + "x 2 Kč a " + k + "x 1 Kč");
    }
    
}
