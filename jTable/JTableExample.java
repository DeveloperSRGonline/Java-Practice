import javax.swing.*;

public class JTableExample {
    public static void main(String[] args) {
        JFrame f = new JFrame("JTable Example");
        String column[] = { "ID", "Name", "Course" };
        String data[][] = {
                { "1", "Sarika", "MCA" }, { "2", "Manthan", "B.Tech" }, { "3", "Kartik", "M.Tech" }

        };
        JTable table = new JTable(data, column);
        JScrollPane sp = new JScrollPane(table);
        f.add(sp);
        f.setSize(400, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}