import javax.swing.*;

public class Zadanie1Form extends JFrame {
    private JPanel panel;
    private JTextField textField1;
    private JTextField textField2;

    public static void main(String[] args) {
        Zadanie1Form form = new Zadanie1Form();
        form.setVisible(true);
    }

    public Zadanie1Form() {
        super();
        this.setContentPane(this.panel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setSize(500,350);

        textField1.addActionListener(e -> {
            double c = Double.parseDouble(textField1.getText());
            double f = (c * 9/5) + 32;
            textField2.setText(""+f);
        });

        textField2.addActionListener(e -> {
            double f = Double.parseDouble(textField2.getText());
            double c = (f - 32) * 5/9;
            textField1.setText(""+c);
        });


    }
}
