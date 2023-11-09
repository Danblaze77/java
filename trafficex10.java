import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TrafficLightSimulator extends JFrame {
    private JLabel messageLabel;
    private JRadioButton redButton, yellowButton, greenButton;

    public TrafficLightSimulator() {
        setTitle("Traffic Light Simulator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1, 3));

        redButton = new JRadioButton("Red");
        yellowButton = new JRadioButton("Yellow");
        greenButton = new JRadioButton("Green");

        ButtonGroup group = new ButtonGroup();
        group.add(redButton);
        group.add(yellowButton);
        group.add(greenButton);

        redButton.addActionListener(new RadioButtonListener());
        yellowButton.addActionListener(new RadioButtonListener());
        greenButton.addActionListener(new RadioButtonListener());

        redButton.setFont(new Font("TimesNewRoman", Font.BOLD, 30));
        yellowButton.setFont(new Font("TimesNewRoman", Font.BOLD, 30));
        greenButton.setFont(new Font("TimesNewRoman", Font.BOLD, 30));

        buttonPanel.add(redButton);
        buttonPanel.add(yellowButton);
        buttonPanel.add(greenButton);

        messageLabel = new JLabel("Select a light", SwingConstants.CENTER);
        messageLabel.setFont(new Font("Arial", Font.BOLD, 50));

        add(buttonPanel, BorderLayout.NORTH);
        add(messageLabel, BorderLayout.CENTER);

        pack();
        setVisible(true);
    }

    class RadioButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (redButton.isSelected()) {
                messageLabel.setText("Stop");
                messageLabel.setForeground(Color.RED);
            } else if (yellowButton.isSelected()) {
                messageLabel.setText("Ready");
                messageLabel.setForeground(Color.YELLOW);
            } else if (greenButton.isSelected()) {
                messageLabel.setText("Go");
                messageLabel.setForeground(Color.GREEN);
            }
        }
    }

    public static void main(String[] args) {
        TrafficLightSimulator obj= new TrafficLightSimulator();
    }
}