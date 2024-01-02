package Bank.Management.System;
import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;





public class signup extends JFrame implements ActionListener {

        JRadioButton r1 , r2 , m1 , m2 , m3;

        JButton next;

        JTextField textName ,textFname , textEmail  , textADD , textcity , textpincode , textstate;

        JDateChooser dateChoser;
        Random ran = new Random();

        long first4 = (ran.nextLong() % 9000L) +1000L;

        String first = " " + Math.abs(first4);
    signup(){
        super("APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25,10,100,100);
        add(image);


        JLabel label1 = new JLabel("APPLICATION FORM NO."+ first);
        label1.setBounds(160,20,600,40);
        label1.setFont(new Font("Raleway",Font.BOLD,38));
        add(label1);


        JLabel label2 = new JLabel("page 1");
        label2.setFont(new Font("Raleway",Font.BOLD,22));
        label2.setBounds(330,70,600,30);
        add(label2);

        JLabel label3 = new JLabel("personal details");
        label3.setFont(new Font("Raleway",Font.BOLD,22));
        label3.setBounds(290,90,600,30);
        add(label3);

        // FOR NAME :

        JLabel labelName = new JLabel("NAME :");
        labelName.setFont(new Font("Raleway",Font.BOLD,20));
        labelName.setBounds(100,190,100,30);
        add(labelName);


        textName = new JTextField();
        textName.setFont(new Font("Raleway",Font.BOLD,14));
        textName.setBounds(300,190,400,30);
        add(textName);

        // FOR FATHERS NAME:
        JLabel labelFname = new JLabel("FATHER'S NAME :");
        labelFname.setFont(new Font("Raleway",Font.BOLD,20));
        labelFname.setBounds(100,240,200,30);
        add(labelFname);

        textFname = new JTextField();
        textFname.setFont(new Font("Raleway",Font.BOLD,14));
        textFname.setBounds(300,240,400,30);
        add(textFname);



        // D.O.B
        JLabel DOB = new JLabel("Date of birth :");
        DOB.setFont(new Font("Rale way",Font.BOLD,20));
        DOB.setBounds(100,340,200,30);
        add(DOB);

        // CALENDER
        dateChoser = new JDateChooser();
        dateChoser.setForeground(new Color(105,105,105));
        dateChoser.setBounds(300,340,400,30);
        add(dateChoser);


        JLabel labelG = new JLabel("Gender :");
        labelG.setFont(new Font("Rale way",Font.BOLD,20));
        labelG.setBounds(100,290,200,30);
        add(labelG);

            // GENDER:
            r1 = new JRadioButton("MALE");
            r1.setFont(new Font("Rale way",Font.BOLD,20));
            r1.setBackground(new Color(222,255,228));
            r1.setBounds(300,290,80,30);
            add(r1);

            r2 = new JRadioButton("FEMALE");
            r2.setFont(new Font("Rale way",Font.BOLD,20));
            r2.setBackground(new Color(222,255,228));
            r2.setBounds(450,290,110,30);
            add(r2);


            ButtonGroup buttonGroup = new ButtonGroup();
            buttonGroup.add(r1);
            buttonGroup.add(r2);

            // email
        JLabel labelEmail = new JLabel("email address :");
        labelEmail.setFont(new Font("Rale way",Font.BOLD,20));
        labelEmail.setBounds(100,390,200,30);
        add(labelEmail);

        textEmail = new JTextField();
        textEmail.setFont(new Font("Rale way",Font.BOLD,20));
        textEmail.setBounds(300,390,400,30);
        add(textEmail);


        //MARRIED STATUS:
        JLabel labelMS = new JLabel("Marital status :");
        labelMS.setFont(new Font("Rale way",Font.BOLD,20));
        labelMS.setBounds(100,440,200,30);
        add(labelMS);

        m1 = new JRadioButton("MARRIED");
        m1.setFont(new Font("Rale way",Font.BOLD,20));
        m1.setBackground(new Color(222,255,228));
        m1.setBounds(300,440,150,30);
        add(m1);


        m2 = new JRadioButton("Unmarried");
        m2.setFont(new Font("Rale way",Font.BOLD,20));
        m2.setBackground(new Color(222,255,228));
        m2.setBounds(450,440,140,30);
        add(m2);


        m3 = new JRadioButton("OTHER");
        m3.setFont(new Font("Rale way",Font.BOLD,20));
        m3.setBackground(new Color(222,255,228));
        m3.setBounds(635,440,100,30);
        add(m3);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(m1);
        buttonGroup1.add(m2);
        buttonGroup1.add(m3);

        //Address:
        JLabel labelADD = new JLabel("ADDRESS :");
        labelADD.setFont(new Font("Rale way",Font.BOLD,20));
        labelADD.setBounds(100,490,200,30);
        add(labelADD);


        textADD = new JTextField();
        textADD.setFont(new Font("Rale way",Font.BOLD,20));
        textADD.setBounds(300,490,400,30);
        add(textADD);



        // city

        JLabel labelcity = new JLabel("CITY :");
        labelcity.setFont(new Font("Rale way",Font.BOLD,20));
        labelcity.setBounds(100,540,200,30);
        add(labelcity);


        textcity = new JTextField();
        textcity.setFont(new Font("Rale way",Font.BOLD,20));
        textcity.setBounds(300,540,400,30);
        add(textcity);


        // pin code:


        JLabel labelpincode = new JLabel("PIN CODE :");
        labelpincode.setFont(new Font("Rale way",Font.BOLD,20));
        labelpincode.setBounds(100,590,200,30);
        add(labelpincode);


        textpincode = new JTextField();
        textpincode.setFont(new Font("Rale way",Font.BOLD,20));
        textpincode.setBounds(300,590,400,30);
        add(textpincode);


        // STATE:

        JLabel labelstate = new JLabel("STATE :");
        labelstate.setFont(new Font("Rale way",Font.BOLD,20));
        labelstate.setBounds(100,640,200,30);
        add(labelstate);


        textstate = new JTextField();
        textstate.setFont(new Font("Rale way",Font.BOLD,20));
        textstate.setBounds(300,640,400,30);
        add(textstate);


        // NEXT button
        next = new JButton("NEXT");
        next.setFont(new Font("Rale way",Font.BOLD,14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(620,680,80,30);
        next.addActionListener(this);
        add(next);


        getContentPane().setBackground(new Color(222,255,228));
        setLayout(null);
        setSize(850,800);
        setLocation(360,40);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String formno = first;
        String name = textName.getText();
        String fname = textFname.getText();
        String DOB = ((JTextField) dateChoser.getDateEditor().getUiComponent()).getText();
        String Gender = null;
        if(r1.isSelected()){
            Gender = "Male";
        } else if (r2.isSelected()) {
            Gender = "female";
        }
        String email = textEmail.getText();
        String marital = null;

        if(m1.isSelected()){
            marital = "Married";
        } else if (m2.isSelected()) {
            marital = "Unmarried";
        } else if (m3.isSelected()) {
            marital = "other";
        }

        String address = textADD.getText();
        String pincode = textpincode.getText();
        String city = textcity.getText();
        String state = textstate.getText();

        try{

            if(textName.getText().equals("")){
                JOptionPane.showMessageDialog(null,"fill all the fields");
            }else {
                Conn c1 = new Conn();
                String q = "insert into signup values('"+formno+"','"+name+"','"+fname+"','"+DOB+"','"+Gender+"','"+email+"'" +
                        ",'"+marital+"','"+address+"','"+city+"','"+pincode+"','"+state+"')";
                c1.statement.executeUpdate(q);
                new signup2(formno);
                setVisible(false);
            }

        }catch (Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new signup();
    }
}

