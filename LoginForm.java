
import java.awt.event.*;
import javax.swing.*;

class LoginForm implements ActionListener {

    JTextField t1;
    JPasswordField t2;
    JButton b;

    LoginForm() {
        JFrame f = new JFrame();
        JLabel l1 = new JLabel("Username");
        JLabel l2 = new JLabel("Password");
        t1 = new JTextField();
        t2 = new JPasswordField();
        b = new JButton("Login");
        l1.setBounds(50, 50, 100, 30);
        t1.setBounds(150, 50, 100, 30);
        l2.setBounds(50, 100, 100, 30);
        t2.setBounds(150, 100, 100, 30);
        b.setBounds(100, 150, 100, 30);
        b.addActionListener(this);
        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(b);
        f.setSize(300, 250);
        f.setLayout(null);
        f.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (t1.getText().equals("admin") && t2.getText().equals("1234")) {
            JOptionPane.showMessageDialog(null, "Login Successful"); 
        }else {
            JOptionPane.showMessageDialog(null, "Login Failed");
        }
    }

    public static void main(String args[]) {
        new LoginForm();
    }
}
