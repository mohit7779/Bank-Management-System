
package Bank.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {

    JLabel label1 , label2 , label3;  // globally declared

    JTextField textField2;

    JPasswordField jPasswordField3;

    JButton button1 , button2 , button3;


    Login(){
        super("Bank Management System");  // title appear on frame.


        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350,10,100,100);
        add(image);



        ImageIcon ii1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm card.jpg"));
        Image ii2 = ii1.getImage().getScaledInstance(110,110, Image.SCALE_DEFAULT);
        ImageIcon ii3 = new ImageIcon(ii2);
        JLabel iimage = new JLabel(ii3);
        iimage.setBounds(630,350,100,100);
        add(iimage);


        label1 = new JLabel("WELCOME TO ATM");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("AvantGrade",Font.BOLD,30));
        label1.setBounds(220,110,450,40);
        add(label1);


        label2 = new JLabel("CARD NO.");
        label2.setFont(new Font("Ralway",Font.BOLD,28));
        label2.setForeground(Color.BLACK);
        label2.setBounds(150,190,375,30);
        add(label2);

        // for text:
        textField2 = new JTextField(15);
        textField2.setBounds(325,190,230,30);
        textField2.setFont(new Font("Arial",Font.BOLD,14));
        add(textField2);

        label3 = new JLabel("PIN NO.");
        label3.setFont(new Font("Ralway",Font.BOLD,28));
        label3.setForeground(Color.BLACK);
        label3.setBounds(150,250,375,30);
        add(label3);

        // for password:
        jPasswordField3 = new JPasswordField("15");
        jPasswordField3.setBounds(325,250,230,30);
        jPasswordField3.setFont(new Font("Arial",Font.BOLD,14));
        add(jPasswordField3);

        // for buttons
        button1 = new JButton("SIGN IN");
        button1.setFont(new Font("Arial",Font.BOLD,14));
        button1.setForeground(Color.WHITE);
        button1.setBackground(Color.BLACK);
        button1.setBounds(300,300,100,30);
        button1.addActionListener(this);
        add(button1);

        button2 = new JButton("CLEAR");
        button2.setFont(new Font("Arial",Font.BOLD,14));
        button2.setForeground(Color.WHITE);
        button2.setBackground(Color.BLACK);
        button2.setBounds(430,300,100,30);
        button2.addActionListener(this);
        add(button2);

        button3 = new JButton("SIGN UP");
        button3.setFont(new Font("Arial",Font.BOLD,14));
        button3.setForeground(Color.WHITE);
        button3.setBackground(Color.BLACK);
        button3.setBounds(300,350,230,30);
        button3.addActionListener(this);
        add(button3);


        ImageIcon iii1 = new ImageIcon(ClassLoader.getSystemResource("icons/provider.png"));
        Image iii2 = iii1.getImage().getScaledInstance(850,480, Image.SCALE_DEFAULT);
        ImageIcon iii3 = new ImageIcon(iii2);
        JLabel iiimage = new JLabel(iii3);
        iiimage.setBounds(0,0,850,450);
        add(iiimage);


        setLayout(null);
        setSize(850,480); // size of frame
        setLocation(400,200);  // location that from where it will open
        setVisible(true); // visibility of login page
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{

            if(e.getSource() == button1){

                Conn c = new Conn();
                String cardno = textField2.getText();
                String pin = jPasswordField3.getText();
                String q = "select * from login Where card_number = '"+cardno+"'and pin'"+pin+"'";
                ResultSet resultSet = c.statement.executeQuery(q);
                if(resultSet.next()){
                    setVisible(false);
                    new main_class(pin);
                }else {
                    JOptionPane.showMessageDialog(null,"Incorrect card Number or pin");
                }


            }else if(e.getSource() == button2){
                textField2.setText("");
                jPasswordField3.setText("");
            }else if(e.getSource() == button3){
                 new signup();
                 setVisible(false);
            }


        }catch (Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args){

        new Login();
    }
}
