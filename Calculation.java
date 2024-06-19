import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculation extends JFrame {
    private JTextField multiplicated;
    private JTextArea resultArea;

    public Calculation() {
        //  Window
        setTitle("Multi Gen: Multiplication generator");
        setSize(480, 400); // Ajuste de tamaño para acomodar el JTextArea
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        //  Components
        JLabel multiply = new JLabel("Number: ");
        multiply.setBounds(10, 10, 80, 25);
        add(multiply);

        multiplicated = new JTextField();
        multiplicated.setBounds(100, 10, 165, 25);
        add(multiplicated);

        JButton calculateButton = new JButton("Calculate");
        calculateButton.setBounds(10, 80, 100, 25);
        add(calculateButton);

        resultArea = new JTextArea();
        resultArea.setBounds(10, 110, 450, 300);
        resultArea.setEditable(false);
        add(resultArea);

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculate();
            }
        });
    }

    private void calculate() {
        try {
            double number = Double.parseDouble(multiplicated.getText());

            StringBuilder sb = new StringBuilder();
            for (int i = 1; i <= 12; i++) {
                double resulter = number * i;
                sb.append(String.format("%.2f multiplied by %d is: %.2f\n", number, i, resulter));
            }

            resultArea.setText(sb.toString());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please, input correct number values");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Calculation calc = new Calculation();
            calc.setVisible(true);
        });
    }
}