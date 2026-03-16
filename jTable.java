import javax.swing.*;

public class jTable {
    public static void main(String args[]) {

        // create frame object
        JFrame f = new JFrame();

        // create columns as an array
        String column[] = {"Emp No", "Employee Name", "Designation"};

        // create data as an array of arrays
        String data[][] = {
                {"1", "Sarika", "MCA"},
                {"2", "Mahi", "B.Tech"},
                {"3", "Kritika", "M.Tech"}
        };

        // add data and columns in table
        JTable jt = new JTable(data, column);

        // add table to scroll pane
        JScrollPane sp = new JScrollPane(jt);

        // finally add scroll pane to frame
        f.add(sp);
        f.setSize(300, 200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}