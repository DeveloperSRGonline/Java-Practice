import java.awt.*;
import javax.swing.*;

public class GridLayoutExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Grid Layout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2, 10, 10));

        panel.add(new JButton("Button 1"));
        panel.add(new JTextField(10));
        panel.add(new JRadioButton("Radio Button 1"));
        panel.add(new JCheckBox("Check Box 1"));
        panel.add(new JLabel("Label 1"));
        panel.add(new JTextField(10));

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
