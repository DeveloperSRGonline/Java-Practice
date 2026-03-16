import javax.swing.*;

public class ProgressLoop {
    public static void main(String[] args) {
        JFrame f = new JFrame("Loading...");
        JProgressBar pb = new JProgressBar(0, 100);
        pb.setStringPainted(true);
        f.add(pb);
        f.setSize(300, 100);
        f.setVisible(true);
        for (int i = 0; i <= 100; i++) {
            pb.setValue(i);
            try {
                Thread.sleep(50);
            } catch (Exception e) {
            }
        }
    }
}