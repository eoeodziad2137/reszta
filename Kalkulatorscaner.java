import java.util.*;

public class Kalkulatorscaner {
    public static void main(String[] args) {
        double a, b, c;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Podaj pierwsza liczbe: ");
        a = keyboard.nextInt();

        System.out.println("Podaj druga liczbe: ");
        b = keyboard.nextInt();

        System.out.println("Jaką operacje chesz wykonać: ");
        System.out.println("1.Dodawanie ");
        System.out.println("2.Odejmowanie ");
        System.out.println("3.Mnozenie ");
        System.out.println("4.Dzielenie ");

        c = keyboard.nextInt();

        keyboard.close();

        double v;

        if (c == 1) {
            v = a + b;
            System.out.println("Wynik: " + v);
        } else if (c == 2) {
            v = a - b;
            System.out.println("Wynik: " + v);
        } else if (c == 3) {
            v = a * b;
            System.out.println("Wynik: " + v);
        } else if (c == 4) {
            v = a / b;
            System.out.println("Wynik: " + v);
        }
    }
}