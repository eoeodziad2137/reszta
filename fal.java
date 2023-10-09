import javax.swing.JOptionPane;

public class fal {
    public static void main(String[] args) {
        String[] options = { "Java", "Python", "C++", "JavaScript" };

        // Wyświetl okno dialogowe z listą rozwijaną
        String selectedOption = (String) JOptionPane.showInputDialog(null, "Wybierz język programowania:",
                "Wybór języka", JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

        // Sprawdź, czy użytkownik coś wybrał
        if (selectedOption != null) {
            JOptionPane.showMessageDialog(null, "Wybrałeś: " + selectedOption);
        } else {
            JOptionPane.showMessageDialog(null, "Nie dokonałeś wyboru.");
        }
    }
}