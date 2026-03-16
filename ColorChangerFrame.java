import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ColorChangerFrame {
    private final JFrame frame;
    private final JButton colorButton;
    private final Color[] colors = {Color.RED, Color.GREEN, Color.BLUE, Color.YELLOW, Color.ORANGE, Color.PINK};
    private int currentColorIndex = 0;
    
    public ColorChangerFrame() {
        // Create the frame
        frame = new JFrame("Color Changer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new FlowLayout());
        
        // Create the button
        colorButton = new JButton("Change Color");
        colorButton.setFont(new Font("Arial", Font.BOLD, 16));
        
        // Add ActionListener to the button
        colorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                changeFrameColor();
            }
        });
        
        // Add button to frame
        frame.add(colorButton);
        
        // Center the frame on screen
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    
    private void changeFrameColor() {
        // Cycle through colors
        currentColorIndex = (currentColorIndex + 1) % colors.length;
        frame.getContentPane().setBackground(colors[currentColorIndex]);
        
        // Update button text to show current color
        String colorName = getColorName(colors[currentColorIndex]);
        colorButton.setText("Color: " + colorName);
    }
    
    private String getColorName(Color color) {
        if (color.equals(Color.RED)) return "Red";
        if (color.equals(Color.GREEN)) return "Green";
        if (color.equals(Color.BLUE)) return "Blue";
        if (color.equals(Color.YELLOW)) return "Yellow";
        if (color.equals(Color.ORANGE)) return "Orange";
        if (color.equals(Color.PINK)) return "Pink";
        return "Unknown";
    }
    
    public static void main(String[] args) {
        // Run the GUI on the Event Dispatch Thread
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ColorChangerFrame();
            }
        });
    }
}
