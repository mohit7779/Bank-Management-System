package Bank.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class signup2 extends JFrame implements ActionListener {

    JComboBox comboBox , comboBox2 , comboBox3 , comboBox4 , comboBox5;
    JTextField textpan , textAadhar;

    JRadioButton r1,r2,e1,e2;

    JButton next;
    String formno;
    signup2(String formno){

        super("APPLICATION FORM");




        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150,5,100,100);
        add(image);


        this.formno = formno;


        JLabel l1 = new JLabel("page 2 :-");
        l1.setFont(new Font("Rale way",Font.BOLD,14));
        l1.setBounds(300,30,600,40);
        add(l1);


        JLabel l2 = new JLabel("Additional details");
        l2.setFont(new Font("Rale way",Font.BOLD,22));
        l2.setBounds(300,60,600,40);
        add(l2);


        JLabel l3 = new JLabel("Religion :-");
        l3.setFont(new Font("Rale way",Font.BOLD,18));
        l3.setBounds(100,120,100,30);
        add(l3);


        // comboBox
        String religion[] = {"Hindu","Muslim","Christian","other"};
        comboBox = new JComboBox(religion);
        comboBox.setBackground(new Color(252,208,76));
        comboBox.setFont(new Font("Ral way",Font.BOLD,14));
        comboBox.setBounds(350,120,320,30);
        add(comboBox);


        JLabel l4 = new JLabel("Category :-");
        l4.setFont(new Font("Rale way",Font.BOLD,20));
        l4.setBounds(100,170,150,30);
        add(l4);

        String Category[] = {"General","OBC","SC","ST","Other"};
        comboBox2 = new JComboBox(Category);
        comboBox2.setFont(new Font("Rale way",Font.BOLD,14));
        comboBox2.setBackground(new Color(252,208,76));
        comboBox2.setBounds(350,170,320,30);
        add(comboBox2);

        JLabel l5 = new JLabel("Income :-");
        l5.setFont(new Font("Rale way",Font.BOLD,18));
        l5.setBounds(100,220,100,30);
        add(l5);

        String Income[] = {"Null","1,50,000","2,50,000","3,50,000","5,00,000","Upto 10,00,000","Above 10,00,000"};
        comboBox3 = new JComboBox(Income);
        comboBox3.setFont(new Font("Rale way",Font.BOLD,14));
        comboBox3.setBackground(new Color(252,208,76));
        comboBox3.setBounds(350,220,320,30);
        add(comboBox3);


        JLabel l6 = new JLabel("Educational :-");
        l6.setFont(new Font("Rale way",Font.BOLD,18));
        l6.setBounds(100,270,150,30);
        add(l6);

        String Educational[] = {"10th","12th","Under-Graduate","Non-Graduate","Post-Graduate","Other"};
        comboBox4 = new JComboBox(Educational);
        comboBox4.setFont(new Font("Rale way",Font.BOLD,14));
        comboBox4.setBackground(new Color(252,208,76));
        comboBox4.setBounds(350,270,320,30);
        add(comboBox4);


        JLabel l7 = new JLabel("Occupation :-");
        l7.setFont(new Font("Rale way",Font.BOLD,18));
        l7.setBounds(100,320,150,30);
        add(l7);

        String Occupation[] = {"self employed","business","student","retired","other"};
        comboBox5 = new JComboBox(Occupation);
        comboBox5.setFont(new Font("Rale way",Font.BOLD,14));
        comboBox5.setBackground(new Color(252,208,76));
        comboBox5.setBounds(350,320,320,30);
        add(comboBox5);


        JLabel l8 = new JLabel("PAN Number :-");
        l8.setFont(new Font("Rale way",Font.BOLD,18));
        l8.setBounds(100,390,150,30);
        add(l8);

        textpan = new JTextField();
        textpan.setFont(new Font("Rale way",Font.BOLD,18));
        textpan.setBounds(350,390,320,30);
        add(textpan);

        JLabel l9 = new JLabel("Aadhar Number :-");
        l9.setFont(new Font("Rale way",Font.BOLD,18));
        l9.setBounds(100,440,200,30);
        add(l9);

        textAadhar = new JTextField();
        textAadhar.setFont(new Font("Rale way",Font.BOLD,18));
        textAadhar.setBounds(350,440,320,30);
        add(textAadhar);


        JLabel l10 = new JLabel("Senior Citizen :-");
        l10.setFont(new Font("Rale way",Font.BOLD,18));
        l10.setBounds(100,490,180,30);
        add(l10);

        r1 = new JRadioButton("YES");
        r1.setFont(new Font("Rale way",Font.BOLD,18));
        r1.setBackground(new Color(252,208,76));
        r1.setBounds(350,490,100,30);
        add(r1);

        r2 = new JRadioButton("NO");
        r2.setFont(new Font("Rale way",Font.BOLD,18));
        r2.setBackground(new Color(252,208,76));
        r2.setBounds(450,490,100,30);
        add(r2);

//        ButtonGroup buttonGroup1 = new ButtonGroup();
//        buttonGroup1.add(r1);
//        buttonGroup1.add(r2);

        JLabel l11 = new JLabel("Existing Account :-");
        l11.setFont(new Font("Rale way",Font.BOLD,18));
        l11.setBounds(100,540,180,30);
        add(l11);

        e1 = new JRadioButton("YES");
        e1.setFont(new Font("Rale way",Font.BOLD,18));
        e1.setBackground(new Color(252,208,76));
        e1.setBounds(350,540,100,30);
        add(e1);

        e2 = new JRadioButton("NO");
        e2.setFont(new Font("Rale way",Font.BOLD,18));
        e2.setBackground(new Color(252,208,76));
        e2.setBounds(450,540,100,30);
        add(e2);

//        ButtonGroup buttonGroup2 = new ButtonGroup();
//        buttonGroup2.add(e1);
//        buttonGroup2.add(e2);



        JLabel l12 = new JLabel("Form no. :-");
        l12.setFont(new Font("Rale way",Font.BOLD,14));
        l12.setBounds(500,10,100,30);
        add(l12);

        JLabel l13 = new JLabel(formno);
        l13.setFont(new Font("Rale way",Font.BOLD,14));
        l13.setBounds(760,10,100,30);
        add(l13);

        next = new JButton("Next");
        next.setFont(new Font("Rale way",Font.BOLD,14));
        next.setBackground(Color.WHITE);
        next.setForeground(Color.BLACK);
        next.setBounds(500,580,100,30);
        next.addActionListener(this);
        add(next);


        setLayout(null);
        setSize(750,650);
        setLocation(450,80);
        getContentPane().setBackground(new Color(204, 255, 59));
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String rel = (String)comboBox.getSelectedItem();
        String cat = (String)comboBox2.getSelectedItem();
        String inc = (String)comboBox3.getSelectedItem();
        String edu = (String)comboBox4.getSelectedItem();
        String occ = (String)comboBox5.getSelectedItem();

        String pan = textpan.getText();
        String aadhar = textAadhar.getText();


        String scitizen = " ";
        if(r1.isSelected()){
            scitizen = "yes";
        } else if (r2.isSelected()) {
            scitizen = "NO";
        }
        String eAccount = " ";
        if((r1.isSelected())){
            eAccount = "yes";
        } else if (r2.isSelected()) {
            eAccount = "NO";
        }

        try{
            if(textpan.getText().equals("") || textAadhar.getText().equals("")){
                JOptionPane.showMessageDialog(null,"fill all the fields");
            }else {
                Conn c = new Conn();
                String q = "insert into signuptwo values('"+formno+"','"+rel+"','"+cat+"','"+inc+"','"+edu+"','"+occ+"','"+pan+"','"+aadhar+"','"+scitizen+"'" +
                        ",'"+eAccount+"')";
                c.statement.executeUpdate(q);
                new signup3(formno);
                setVisible(false);
            }


        }catch (Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args){

        new signup2("");
    }
}
