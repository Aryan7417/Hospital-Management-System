package hospital.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;

import net.proteanit.sql.DbUtils;

public class Departnment extends JFrame {


    Departnment(){
     

        
        JPanel panel= new JPanel();
        panel.setBounds(5,5,690,490);
        panel.setLayout(null);
        panel.setBackground(new Color(90,156,163));
        add(panel);
        
        JTable table = new JTable();
        table.setBounds(0,40,700,350);
        table.setBackground(new Color(90,156,163));
        table.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(table);


        try {
            conn c =new conn();
            String q= "select * from departnment";
            ResultSet resultSet = c.statement.executeQuery(q);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));

            
        } catch (Exception e) {
            e.printStackTrace();
        }


        JLabel label1= new JLabel("Departnment");
        label1.setBounds(145,11,105,20);
        label1.setFont(new Font("Tahoma" ,Font.BOLD,14));
        panel.add(label1);


        JLabel label2= new JLabel("Phone Number");
        label2.setBounds(431,11,105,20);
        label2.setFont(new Font("Tahoma" ,Font.BOLD,14));
        panel.add(label2);


        JButton btn = new JButton("Back");
        btn.setBounds(400,410,130,30);
        btn.setBackground(Color.BLACK);
        btn.setForeground(Color.white);
        panel.add(btn);
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                setVisible(false);
            }
        });


     
     
        setSize(700,500);
        setLayout(null);
        setLocation(350,250);
        setVisible(true);

    }

    
    
    public static void main(String[] args) {

        new Departnment();
        
    }
    
}
