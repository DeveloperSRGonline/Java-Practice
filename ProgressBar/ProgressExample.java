import javax.swing.*;

public class ProgressExample {
    public static void main(String[] args) {
        JFrame f = new JFrame("Progress Bar Example");
        JProgressBar pb = new JProgressBar(0, 100);
        pb.setValue(60); // Set progress
        pb.setStringPainted(true); // Show %
        f.add(pb);
        f.setSize(300, 100);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}

/*
JFrame
  |
  |---- JProgressBar
            |
            |---- Minimum Value
            |---- Maximum Value
            |---- Current Value
*/