package hospital.management.system;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Recaption extends JFrame {

    Recaption() {

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(5, 160, 2000, 1070);
        panel.setBackground(new Color(109, 164, 170));
        add(panel);

        JPanel panel1 = new JPanel();
        panel1.setLayout(null);
        panel1.setBounds(5, 5, 2000, 150);
        panel1.setBackground(new Color(109, 164, 170));
        add(panel1);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/dr.png"));
        Image image = i1.getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(image);
        JLabel label = new JLabel(i2);
        label.setBounds(1300, 0, 250, 250);
        panel1.add(label);

        ImageIcon i11 = new ImageIcon(ClassLoader.getSystemResource("icon/amb.png"));
        Image image1 = i11.getImage().getScaledInstance(300, 100, Image.SCALE_DEFAULT);
        ImageIcon i22 = new ImageIcon(image1);
        JLabel label1 = new JLabel(i22);
        label1.setBounds(1000, 50, 300, 100);
        panel1.add(label1);



        //button

        JButton btn1= new JButton("Add new Patient");
        btn1.setBounds(30,15,200,30);
        btn1.setBackground(new Color(246,215,118));
        panel1.add(btn1);
        // bt1.addActionListener(new ActionListener() {
        //     @Override
        //     public void actionPerformed(ActionListener e){


        //     }
            
        // });
        
        JButton btn2= new JButton("Room");
        btn2.setBounds(30,58,200,30);
        btn2.setBackground(new Color(246,215,118));
        panel1.add(btn2);
        // bt2.addActionListener(new ActionListener() {
        //     @Override
        //     public void actionPerformed(ActionListener e){


        //     }
            
        // });




        
        JButton btn3= new JButton("Departnmenet");
        btn3.setBounds(30,100,200,30);
        btn3.setBackground(new Color(246,215,118));
        panel1.add(btn3);
        // bt1.addActionListener(new ActionListener() {
        //     @Override
        //     public void actionPerformed(ActionListener e){


        //     }
            
        // });


         
        JButton btn4= new JButton("Departnmenet");
        btn4.setBounds(270,15,200,30);
        btn4.setBackground(new Color(246,215,118));
        panel1.add(btn4);
        // bt1.addActionListener(new ActionListener() {
        //     @Override
        //     public void actionPerformed(ActionListener e){


        //     }
            
        // });


            JButton btn5= new JButton("Patient Info");
        btn5.setBounds(270,58,200,30);
        btn5.setBackground(new Color(246,215,118));
        panel1.add(btn5);
        // bt1.addActionListener(new ActionListener() {
        //     @Override
        //     public void actionPerformed(ActionListener e){


        //     }
            
        // });



        JButton btn6= new JButton("Patient Discharge");
        btn6.setBounds(270,100,200,30);
        btn6.setBackground(new Color(246,215,118));
        panel1.add(btn6);
        // bt1.addActionListener(new ActionListener() {
        //     @Override
        //     public void actionPerformed(ActionListener e){


        //     }
            
        // });


        JButton btn7= new JButton("Update Patient Details");
        btn7.setBounds(510,15,200,30);
        btn7.setBackground(new Color(246,215,118));
        panel1.add(btn7);
        // bt1.addActionListener(new ActionListener() {
        //     @Override
        //     public void actionPerformed(ActionListener e){


        //     }
            
        // });


        JButton btn8= new JButton("Hospital Ambulance");
        btn8.setBounds(270,15,200,30);
        btn8.setBackground(new Color(246,215,118));
        panel1.add(btn8);
        // bt1.addActionListener(new ActionListener() {
        //     @Override
        //     public void actionPerformed(ActionListener e){


        //     }
            
        // });



        

        JButton btn9= new JButton("Search Room");
        btn9.setBounds(510,100,200,30);
        btn9.setBackground(new Color(246,215,118));
        panel1.add(btn9);
        // bt1.addActionListener(new ActionListener() {
        //     @Override
        //     public void actionPerformed(ActionListener e){


        //     }
            
        // });




         JButton btn10= new JButton("Logout");
        btn10.setBounds(750,15,200,30);
        btn10.setBackground(new Color(246,215,118));
        panel1.add(btn10);
        // bt1.addActionListener(new ActionListener() {
        //     @Override
        //     public void actionPerformed(ActionListener e){


        //     }
            
        // });

















        setSize(1950, 1090);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Recaption();
    }

}
