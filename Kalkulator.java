import javax.swing.JOptionPane;

public class Kalkulator {
    public static void main(String[] args) {
        String a = JOptionPane.showInputDialog("Podaj pierwsza liczbe: ");
        double A = Double.parseDouble(a);

        String b = JOptionPane.showInputDialog("Podaj druga liczbe: ");
        double B = Double.parseDouble(b);

        String[] options = { "Dodawanie", "Odejmowanie", "Mnozenie", "Dzielenie" };

        String selectedOption = (String) JOptionPane.showInputDialog(null, "Wybierz operacje:", "Operacja",
                JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

        double C = 0;

        if (selectedOption == "Dodawanie:") {
            C = A + B;
            JOptionPane.showMessageDialog(null, "Wynik: " + C);

        } else if (selectedOption == "Odjemowanie") {
            C = A - B;
            JOptionPane.showMessageDialog(null, "Wynik: " + C);

        } else if (selectedOption == "Mnozenie") {

            C = A * B;
            JOptionPane.showMessageDialog(null, "Wynik: " + C);

        } else if (selectedOption == "Dzielenie") {

            C = A / B;
            JOptionPane.showMessageDialog(null, "Wynik: " + C);
        }

    }
}