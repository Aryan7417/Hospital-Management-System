package hospital.management.system;

import java.awt.ActiveEvent;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.Label;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.event.ActionEvent;

public class Discharge extends JFrame {
    Discharge() {
        JPanel panel = new JPanel();
        panel.setBounds(5, 5, 590, 390);
        panel.setBackground(new Color(90, 156, 163));
        panel.setLayout(null);
        add(panel);

        JLabel label = new JLabel("Check-Out");
        label.setBounds(100, 20, 150, 20);
        label.setFont(new Font("Tahoma", Font.BOLD, 14));
        label.setForeground(Color.WHITE);
        panel.add(label);

        JLabel labe2 = new JLabel("Customer ID");
        labe2.setBounds(30, 80, 150, 20);
        labe2.setFont(new Font("Tahoma", Font.BOLD, 14));
        labe2.setForeground(Color.WHITE);
        panel.add(labe2);

        Choice choice = new Choice();
        choice.setBounds(200, 80, 150, 14);
        panel.add(choice);

        try {
            conn c = new conn();
            ResultSet resultSet = c.statement.executeQuery("select * from patient_info");

            while (resultSet.next()) {
                choice.add(resultSet.getString("number"));

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        JLabel labe3 = new JLabel("Room Number");
        labe3.setBounds(30, 130, 150, 20);
        labe3.setFont(new Font("Tahoma", Font.BOLD, 14));
        labe3.setForeground(Color.WHITE);
        panel.add(labe3);

        JLabel RN = new JLabel();
        RN.setBounds(200, 130, 150, 20);
        RN.setFont(new Font("Tahoma", Font.BOLD, 14));
        RN.setForeground(Color.WHITE);
        panel.add(RN);

        JLabel label4 = new JLabel("In-Time");
        label4.setBounds(30, 180, 150, 20);
        label4.setFont(new Font("Tahoma", Font.BOLD, 14));
        label4.setForeground(Color.WHITE);
        panel.add(label4);

        JLabel INTime = new JLabel();
        INTime.setBounds(200, 180, 250, 20);
        INTime.setFont(new Font("Tahoma", Font.BOLD, 14));
        INTime.setForeground(Color.WHITE);
        panel.add(INTime);

        JLabel label5 = new JLabel("Out-Time");
        label5.setBounds(30, 230, 150, 20);
        label5.setFont(new Font("Tahoma", Font.BOLD, 14));
        label5.setForeground(Color.WHITE);
        panel.add(label5);

        Date date = new Date();

        JLabel OutTime = new JLabel("" + date);
        OutTime.setBounds(200, 230, 250, 20);
        OutTime.setFont(new Font("Tahoma", Font.BOLD, 14));
        OutTime.setForeground(Color.WHITE);
        panel.add(OutTime);

        JButton discharge = new JButton("Discharge");
        discharge.setBounds(30, 300, 120, 30);
        discharge.setBackground(Color.BLACK);
        discharge.setForeground(Color.white);
        panel.add(discharge);
        discharge.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                try {
                    
                    conn c = new conn();
                    c.statement.executeUpdate("delete from patient_info where number = '" +choice.getSelectedItem()+  "'  ");
                    c.statement.executeUpdate("update room set Availability ='Available' where room_no='"+RN.getText()+"'  ");
                    JOptionPane.showMessageDialog(null,"Done");
                    // setVisible(false);
                } catch (Exception E) {
                    E.printStackTrace();
                }
            }
        });






        JButton check = new JButton("Check");
        check.setBounds(170, 300, 120, 30);
        check.setBackground(Color.BLACK);
        check.setForeground(Color.white);
        panel.add(check);
        check.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                conn c = new conn();

                try {
                    ResultSet resultSet = c.statement.executeQuery(
                            "select * from patient_info where number = '" + choice.getSelectedItem() + "'   ");
                    while (resultSet.next()) {
                        RN.setText(resultSet.getString("Room_Number"));
                        INTime.setText(resultSet.getString("Time"));

                    }

                } catch (Exception E) {
                    E.printStackTrace();
                }
            }
        });

        JButton Back = new JButton("Back");
        Back.setBounds(300, 300, 120, 30);
        Back.setBackground(Color.BLACK);
        Back.setForeground(Color.white);
        panel.add(Back);

        Back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });

        setSize(800, 400);
        setVisible(true);
        setLayout(null);
        setLocation(400, 250);
        setVisible(true);

    }

    public static void main(String[] args) {
        new Discharge();
    }
}
