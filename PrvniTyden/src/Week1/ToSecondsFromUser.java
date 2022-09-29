package Week1;
import java.util.Scanner;
public class ToSecondsFromUser {
    public static void main(String[] args) {
         // VVV vstup VVV
        Scanner time = new Scanner(System.in);
        System.out.println("Zadejte prosím, kolik hodin závodník bežel");
        int h = time.nextInt();
        System.out.println("Zadejte prosím, kolik minut závodník bežel");
        int m = time.nextInt();
        System.out.println("Zadejte prosím, kolik sekund závodník bežel");
        int s = time.nextInt();
        // VVV postup i výstup VVV
        System.out.println("Celkový čas závodníka je " + (h * 3600 + m * 60 + s) + " sekund.");
        
    }
    
}
