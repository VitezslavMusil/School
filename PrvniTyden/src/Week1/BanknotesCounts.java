package Week1;
public class BanknotesCounts {
    public static void main(String[] args) {
        // VVV vstup VVV
        int a = 673 / 100;
        // VVV postup VVV
        int kilo = a * 100;
        a = 673 - kilo;
        int pajcka = a / 50;
        a = a - pajcka * 50;
        int dvacka = a / 20;
        a = a - dvacka * 20;
        int petka = a / 10;
        a = a - petka*10;
        int bura = a / 5;
        a = a - bura * 5;
        int dve = a / 2;
        a = a - dve * 2;
        int kacka = a / 1;
        // VVV výstup VVV
        System.out.println("Daná suma se dá rozdělit na " + kilo + "x 100 Kč, " + pajcka + "x 50 Kč, " + dvacka + "x 20 Kč, " + petka + "x 10 Kč, " + bura + "x 5 Kč, " + dve + "x 2 Kč a " + kacka + "x 1 Kč");
    }
    
}
