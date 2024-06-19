import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculation extends JFrame {
    private JTextField multiplicated;
    private JTextField times;
    private JLabel result;

    public Calculation() {
        //  Window
        setTitle("Multi Gen: Multiplication generator");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        //  Components
        JLabel multiply = new JLabel("First number: ");
        multiply.setBounds(10, 10, 80, 25);
        add(multiply);

        multiplicated = new JTextField();
        multiplicated.setBounds(100, 10, 165, 25);
        add(multiplicated);

        JLabel multiplied = new JLabel("Times: ");
        multiplied.setBounds(10, 40, 80, 25);
        add(multiplied);

        times = new JTextField();
        times.setBounds(100, 40, 165, 25);
        add(times);

        JButton calculateButton = new JButton("Calculate");
        calculateButton.setBounds(10, 80, 100, 25);
        add(calculateButton);

        result = new JLabel("Result: ");
        result.setBounds(10, 110, 200, 25);
        add(result);

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculate();
            }
        });
    }

    private void calculate() {
        try {
            double first = Double.parseDouble(multiplicated.getText());
            double second = Double.parseDouble(multiplicated.getText());
            double multiResult = first * second;
            result.setText(String.format("Result: %s", multiResult));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please, input correct number values");
        }
    }

}
