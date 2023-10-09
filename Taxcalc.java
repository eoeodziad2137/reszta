import javax.swing.JOptionPane;

public class Taxcalc {
    public static void main(String[] args) {
        String a = JOptionPane.showInputDialog("Podaj swój dochód(bez przecinkach po tysiacach): ")
        double A = Double.parseDouble(a);

        double C = A;
        double B = 0;

        if (A <= 20000) {
            B = A - (A * 0.10);
            C = C - B;
            
            JOptionPane.showMessageDialog(null,
                    "Stawka procentowa od twoejgo dochodu wynosi 10%, musisz odprowadzic: " + C + " zł podatku");
        } else if (A >= 20001 && A <= 40000) {
            B = A - (A * 0.15);
            C = C - B;
            JOptionPane.showMessageDialog(null,
                    "Stawka procentowa od twoejgo dochodu wynosi 15%, musisz odprowadzic: " + C + " zł podatku");
        } else if (A >= 40001 && A <= 60000) {
            B = A - (A * 0.20);
            C = C - B;
            JOptionPane.showMessageDialog(null,
                    "Stawka procentowa od twoejgo dochodu wynosi 20%, musisz odprowadzic: " + C + " zł podatku");
        } else if (A >= 60001) {
            B = A - (A * 0.25);
            C = C - B;
            JOptionPane.showMessageDialog(null,
                    "Stawka procentowa od twoejgo dochodu wynosi 25%, musisz odprowadzic: " + C + " zł podatku");
        }
    }
}