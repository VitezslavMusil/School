package Week1;
public class ToSecondsFromArgv {
    public static void main(String[] args) {
        // VVV vstup VVV
        int h = 3;
        int m = 28;
        int s = 42;
        // VVV postup i výstup VVV
        System.out.println("Celkový čas závodníka je " + (h * 3600 + m * 60 + s) + " sekund.");
    }
}
