import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingCalculator extends JFrame implements ActionListener {

    private JTextField firstNumberField;
    private JTextField secondNumberField;
    private JTextField resultField;
    private JButton[] numberButtons;
    private JButton[] operatorButtons;
    private JButton clearButton;

    public SwingCalculator() {
        super("Swing Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create the text fields.
        firstNumberField = new JTextField(10);
        secondNumberField = new JTextField(10);
        resultField = new JTextField(10);
        resultField.setEditable(false);

        // Create the number buttons.
        numberButtons = new JButton[10];
        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
        }

        // Create the operator buttons.
        operatorButtons = new JButton[] {
            new JButton("+"),
            new JButton("-"),
            new JButton("*"),
            new JButton("/")
        };
        for (JButton button : operatorButtons) {
            button.addActionListener(this);
        }

        // Create the clear button.
        clearButton = new JButton("Clear");
        clearButton.addActionListener(this);

        // Create the layout.
        JPanel panel = new JPanel(new BorderLayout());
        panel.add(firstNumberField, BorderLayout.NORTH);
        panel.add(secondNumberField, BorderLayout.CENTER);
        panel.add(resultField, BorderLayout.SOUTH);

        JPanel buttonPanel = new JPanel(new GridLayout(4, 3));
        for (JButton button : numberButtons) {
            buttonPanel.add(button);
        }
        for (JButton button : operatorButtons) {
            buttonPanel.add(button);
        }
        buttonPanel.add(clearButton);

        panel.add(buttonPanel, BorderLayout.EAST);

        add(panel);
        pack();
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if (source instanceof JButton) {
            JButton button = (JButton) source;

            if (button.getText().equals("Clear")) {
                firstNumberField.setText("");
                secondNumberField.setText("");
                resultField.setText("");
            } else if (button.getText().equals("+")) {
                int firstNumber = Integer.parseInt(firstNumberField.getText());
                int secondNumber = Integer.parseInt(secondNumberField.getText());
                int result = firstNumber + secondNumber;
                resultField.setText(String.valueOf(result));
            } else if (button.getText().equals("-")) {
                int firstNumber = Integer.parseInt(firstNumberField.getText());
                int secondNumber = Integer.parseInt(secondNumberField.getText());
                int result = firstNumber - secondNumber;
                resultField.setText(String.valueOf(result));
            } else if (button.getText().equals("*")) {
                int firstNumber = Integer.parseInt(firstNumberField.getText());
                int secondNumber = Integer.parseInt(secondNumberField.getText());
                int result = firstNumber * secondNumber;
                resultField.setText(String.valueOf(result));
            } else if (button.getText().equals("/")) {
                int firstNumber = Integer.parseInt(firstNumberField.getText());
                int secondNumber = Integer.parseInt(secondNumberField.getText());
                int result = firstNumber / secondNumber;
                resultField.setText(String.valueOf(result));
            } else {
                // Add the number to the current number.
                String currentNumber = resultField.getText();
                currentNumber += button.getText();
                resultField.setText(currentNumber);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new SwingCalculator();
        });
    }
}