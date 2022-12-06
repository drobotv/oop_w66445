import javax.swing.*;

public class defaultForm extends JFrame {
    private JPanel panel1;
    private JTextField aTextField;
    private JTextField bTextField;
    private JButton sumaButton;
    private JButton roznicaButton;
    private JRadioButton javaRad;
    private JRadioButton csRad;
    private JButton wyczyscButton;
    private JButton wyjscieButton;
    private JButton iloczynButton;
    private JTextPane wynik;
    private JButton wyswietlWyborButton;
    private JCheckBox poniedzialekCheckBox;
    private JCheckBox wtorekCheckBox;

    public static void main(String[] args) {
        defaultForm form = new defaultForm();
        form.setVisible(true);
    }

    public defaultForm() {
        super();
        this.setContentPane(this.panel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setSize(500,350);

        sumaButton.addActionListener(e -> {
            int a = Integer.parseInt(aTextField.getText());
            int b = Integer.parseInt(bTextField.getText());
            int c = a + b;
            JOptionPane.showMessageDialog(null, "Wynik dodawania: " + c);
        });

        roznicaButton.addActionListener(e -> {
            int a = Integer.parseInt(aTextField.getText());
            int b = Integer.parseInt(bTextField.getText());
            int c = a - b;
            JOptionPane.showMessageDialog(null, "Wynik odejmowania: " + c);
        });

        iloczynButton.addActionListener(e -> {
            int a = Integer.parseInt(aTextField.getText());
            int b = Integer.parseInt(bTextField.getText());
            int c = a * b;
            wynik.setText("Wynik mnozenia : " + c);
        });

        wyswietlWyborButton.addActionListener(e -> {
            String wynik = "";
            if (javaRad.isSelected()) wynik = "Java";
            if (csRad.isSelected()) wynik = "C#";
            if (poniedzialekCheckBox.isSelected()) wynik += " - Poniedzialek";
            if (wtorekCheckBox.isSelected()) wynik += " - Wtorek";

            JOptionPane.showMessageDialog(null, wynik);
        });

        wyjscieButton.addActionListener(e -> System.exit(0));

        wyczyscButton.addActionListener(e -> {
            aTextField.setText("");
            bTextField.setText("");
            wynik.setText("");
            javaRad.setSelected(true);
            poniedzialekCheckBox.setSelected(false);
            wtorekCheckBox.setSelected(false);
        });
    }
}
