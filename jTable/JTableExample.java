
import javax.swing.*;

class JTableExample {

    public static void main(String args[]) {
        JFrame f = new JFrame();
        String data[][] = {
            {"1", "Amit", "25000"},
            {"2", "Ravi", "30000"},
            {"3", "Neha", "28000"},
            {"4", "Kiran", "32000"},
            {"5", "Pooja", "29000"}
        };
        String column[] = {"Emp No", "Name", "Salary"};
        JTable jt = new JTable(data, column);
        JScrollPane sp = new JScrollPane(jt);
        f.add(sp);
        f.setSize(300, 200);
        f.setVisible(true);
    }
}
