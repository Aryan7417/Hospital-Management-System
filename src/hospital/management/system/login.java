package hospital.management.system;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
// import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class login extends JFrame implements ActionListener {

    JTextField textField;
    JPasswordField JPasswordField;
    JButton b1, b2;

    login() {

        JLabel namelabel = new JLabel("Username");
        namelabel.setBounds(40, 20, 100, 30);
        namelabel.setFont(new Font("tahoma", Font.BOLD, 16));
        namelabel.setForeground(Color.BLACK);
        add(namelabel);

        JLabel Password = new JLabel("Password");
        Password.setBounds(40, 70, 100, 30);
        Password.setFont(new Font("tahoma", Font.BOLD, 16));
        Password.setForeground(Color.BLACK);
        add(Password);

        textField = new JTextField();
        textField.setBounds(150, 20, 150, 30);
        textField.setFont(new Font("Tahoma", Font.BOLD, 15));
        textField.setBackground(new Color(255, 179, 0));
        add(textField);

        JPasswordField = new JPasswordField();
        JPasswordField.setBounds(150, 70, 150, 30);
        JPasswordField.setFont(new Font("Tohoma", Font.PLAIN, 15));
        JPasswordField.setBackground(new Color(255, 179, 0));
        add(JPasswordField);

        ImageIcon imageicon = new ImageIcon(ClassLoader.getSystemResource("icon/login.png"));
        Image i1 = imageicon.getImage().getScaledInstance(500, 500, Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(i1);
        JLabel label = new JLabel(imageIcon1);
        label.setBounds(320, -30, 400, 300);
        add(label);

        // ----------------button----------------------

        b1 = new JButton("Login");
        b1.setBounds(40, 140, 120, 30);
        b1.setFont(new Font("sarif", Font.BOLD, 15));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("Cancel");
        b2.setBounds(180, 140, 120, 30);
        b2.setFont(new Font("sarif", Font.BOLD, 15));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);

        getContentPane().setBackground(new Color(109, 164, 170));
        setSize(750, 300);
        setLocation(450, 270);
        setLayout(null);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            try {
                conn c = new conn();
                String user = textField.getText();
                String pass = JPasswordField.getText();

                String q = "SELECT * FROM login WHERE ID = '" + user + "' AND PW = '" + pass + "'";
                ResultSet resultSet = c.statement.executeQuery(q);

                if (resultSet.next()) {
                    new test();
                    setVisible(false);

                } else {
                    JOptionPane.showMessageDialog(null, "Invalid");
                }

            } catch (Exception E) {
                E.printStackTrace();
            }

        } else {
            System.exit(100);

        }

    }

    public static void main(String[] args) {
        new login();
    }

}
