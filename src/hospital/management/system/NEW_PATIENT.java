package hospital.management.system;

import java.text.ChoiceFormat;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.util.Date;
public class NEW_PATIENT extends JFrame {

    JComboBox combobBox;
    JTextField textFieldNumber, textName, textFieldDesease, textFliedDeposite;
    JRadioButton r1, r2;
    JLabel date;
    JButton b1, b2;
    // ChoiceFormat c1,
 

    NEW_PATIENT() {

        JPanel panel = new JPanel();
        panel.setBounds(5, 5, 840, 540);
        panel.setBackground(new Color(90, 156, 163));
        panel.setLayout(null);
        add(panel);

        ImageIcon ImageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/patient.png"));
        Image image = ImageIcon.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon ImageIcon1 = new ImageIcon(image);
        JLabel label = new JLabel(ImageIcon1);
        label.setBounds(550, 150, 200, 200);
        panel.add(label);

        JLabel labelName = new JLabel("NEW PATIENT FORM");
        labelName.setBounds(118, 11, 260, 53);
        labelName.setFont(new Font("Tahoma", Font.BOLD, 20));
        panel.add(labelName);

        JLabel labelID = new JLabel("ID");
        labelID.setBounds(35, 76, 200, 14);
        labelID.setForeground(Color.WHITE);
        labelName.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(labelID);

        combobBox = new JComboBox(new String[] { "Aadhar card", "Voter Card", "Driving Licience" });
        combobBox.setBounds(217, 73, 150, 20);
        combobBox.setBackground(new Color(3, 45, 78));
        combobBox.setFont(new Font("Tahoma", Font.BOLD, 14));
        combobBox.setForeground(Color.white);
        panel.add(combobBox);

        JLabel labelNumber = new JLabel("Number");
        labelNumber.setBounds(35, 111, 200, 14);
        labelNumber.setForeground(Color.WHITE);
        labelNumber.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(labelNumber);

        textFieldNumber = new JTextField();
        textFieldNumber.setBounds(217, 111, 150, 20);
        panel.add(textFieldNumber);

        JLabel labelName1 = new JLabel("Name:");
        labelName1.setBounds(35, 151, 200, 14);
        labelName1.setForeground(Color.WHITE);
        labelName1.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(labelName1);

        textName = new JTextField();
        textName = new JTextField();
        textName.setBounds(217, 151, 150, 20);
        panel.add(textName);



        JLabel labelGender = new JLabel("Gender:");
        labelGender.setBounds(35, 191, 200, 14);
        labelGender.setForeground(Color.WHITE);
        labelGender.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(labelGender);
        

        r1= new JRadioButton("Male");
        r1.setFont(new Font("Tahoma",Font.BOLD,14));
        r1.setForeground(Color.white);
        r1.setBackground(new Color(109,164,170));
        r1.setBounds(217,191,80,15);
        panel.add(r1);

        r2= new JRadioButton("Female");
        r2.setFont(new Font("Tahoma",Font.BOLD,14));
        r2.setForeground(Color.white);
        r2.setBackground(new Color(109,164,170));
        r2.setBounds(350,191,80,15);
        panel.add(r2);



        JLabel labelDisease = new JLabel("Disease:");
        labelDisease.setBounds(35, 231, 200, 14);
        labelDisease.setForeground(Color.WHITE);
        labelDisease.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(labelDisease);

        textFieldDesease = new JTextField();
        textFieldDesease.setBounds(217, 231, 150, 20);
        panel.add(textFieldDesease);



        JLabel labelRoom = new JLabel("Room:");
        labelRoom.setBounds(35, 274, 200, 14);
        labelRoom.setForeground(Color.WHITE);
        labelRoom.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(labelRoom);


        //Room choice


         JLabel labelDate = new JLabel("Date:");
        labelDate.setBounds(35, 316, 200, 14);
        labelDate.setForeground(Color.WHITE);
        labelDate.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(labelDate);


        Date date1 = new Date();

        date = new JLabel(""+date1);
        date.setBounds(217,316,200,14);
        date.setForeground(Color.white);
        date.setFont(new Font("Tohoma",Font.BOLD,14));
        panel.add(date);



        JLabel labelDeposit = new JLabel("Deposite");
        labelDeposit.setBounds(35, 359, 200, 14);
        labelDeposit.setForeground(Color.WHITE);
        labelDeposit.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(labelDeposit);

        textFliedDeposite = new JTextField();
        textFliedDeposite.setBounds(217, 359, 150, 20);
        panel.add(textFliedDeposite);


        b1 = new JButton("Add");
        b1.setBounds(100,430,120,30);
        b1.setForeground(Color.WHITE);
        b1.setBackground(Color.black);
        panel.add(b1);


        b2 = new JButton("back");
        b2.setBounds(260,430,120,30);
        b2.setForeground(Color.WHITE);
        b2.setBackground(Color.black);
        panel.add(b2);
        

        











        setUndecorated(true);
        setSize(850, 550);
        setLayout(null);
        setLocation(300, 250);
        setVisible(true);
    }

    public static void main(String[] args) {
        new NEW_PATIENT();

    }
}
