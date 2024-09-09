package bank.management.system;

import  com.toedter.calendar.JDateChooser;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup extends JFrame implements ActionListener {

    JButton next;

    JRadioButton r1,r2,m1,m2,m3;

    TextField textName,textFname,textEmail,textMS,textAdd,textCity,textPin,textState;

    JDateChooser dateChooser;

    Random ran = new Random();

    long first4 = ((ran.nextLong() % 9000L) + 1000L);

    String first = " " + Math.abs(first4);

    Signup(){

        super("APPLICATION FORM");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25,10,100,100);
        add(image);

        JLabel label1 = new JLabel("APPLICATION FORM NO.:"+first);
        label1.setBounds(150,20,600,40);
        label1.setFont(new Font("Raleway",Font.BOLD,38));
        add(label1);

        JLabel label2 = new JLabel("PAGE 1");
        label2.setFont(new Font("Raleway",Font.BOLD,22));
        label2.setBounds(360,70,600,30);
        add(label2);

        JLabel label3 = new JLabel("PERSONAL DETAILS");
        label3.setFont(new Font("Raleway",Font.BOLD,22));
        label3.setBounds(290,110,600,30);
        add(label3);


        JLabel labelName = new JLabel("Name :");
        labelName.setFont(new Font("Raleway",Font.BOLD,20));
        labelName.setBounds(100,190,100,30);
        add(labelName);

        textName = new TextField();
        textName.setFont(new Font("Arial",Font.BOLD,14));
        textName.setBounds(300,190,400,30);
        textName.setForeground(Color.BLACK);
        add(textName);


        JLabel labelFName = new JLabel("Father's Name :");
        labelFName.setFont(new Font("Raleway",Font.BOLD,20));
        labelFName.setBounds(100,240,200,30);
        add(labelFName);

        textFname = new TextField();
        textFname.setFont(new Font("Arial",Font.BOLD,14));
        textFname.setForeground(Color.BLACK);
        textFname.setBounds(300,240,400,30);
        add(textFname);


        JLabel DOB = new JLabel("Date of Birth :");
        DOB.setFont(new Font("Raleway",Font.BOLD,20));
        DOB.setBounds(100,290,200,30);
        add(DOB);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(300,290,400,30);
        add(dateChooser);


        JLabel labelG = new JLabel("Gender :");
        labelG.setFont(new Font("Arial",Font.BOLD,20));
        labelG.setBounds(100,340,200,30);
        add(labelG);

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Raleway",Font.BOLD,14));
        r1.setBounds(300,340,60,30);
        r1.setBackground(new Color(	175, 239, 204));
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Raleway",Font.BOLD,14));
        r2.setBounds(450,340,90,30);
        r2.setBackground(new Color(	175, 239, 204));
        add(r2);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(r1);
        buttonGroup1.add(r2);


        JLabel labelEmail = new JLabel("Email Address :");
        labelEmail.setFont(new Font("Raleway",Font.BOLD,20));
        labelEmail.setBounds(100,390,200,30);
        add(labelEmail);

        textEmail = new TextField();
        textEmail.setFont(new Font("Arial",Font.BOLD,14));
        textEmail.setBounds(300,390,400,30);
        textEmail.setForeground(Color.BLACK);
        add(textEmail);


        JLabel labelMS = new JLabel("Marital Status :");
        labelMS.setFont(new Font("Raleway",Font.BOLD,20));
        labelMS.setBounds(100,440,200,30);
        add(labelMS);

        m1 = new JRadioButton("Married");
        m1.setFont(new Font("Raleway",Font.BOLD,14));
        m1.setBounds(300,440,150,30);
        m1.setBackground(new Color(	175, 239, 204));
        add(m1);

        m2 = new JRadioButton("Unmarried");
        m2.setFont(new Font("Raleway",Font.BOLD,14));
        m2.setBounds(450,440,150,30);
        m2.setBackground(new Color(	175, 239, 204));
        add(m2);

        m3 = new JRadioButton("Other");
        m3.setFont(new Font("Raleway",Font.BOLD,14));
        m3.setBounds(600,440,200,30);
        m3.setBackground(new Color(	175, 239, 204));
        add(m3);

        ButtonGroup buttonGroup2 = new ButtonGroup();
        buttonGroup2.add(m1);
        buttonGroup2.add(m2);
        buttonGroup2.add(m3);


        JLabel labelAdd = new JLabel("Address :");
        labelAdd.setFont(new Font("Raleway",Font.BOLD,20));
        labelAdd.setBounds(100,490,200,30);
        add(labelAdd);

        textAdd = new TextField();
        textAdd.setFont(new Font("Arial",Font.BOLD,14));
        textAdd.setBounds(300,490,400,30);
        textAdd.setForeground(Color.BLACK);
        add(textAdd);


        JLabel labelCity = new JLabel("City :");
        labelCity.setFont(new Font("Raleway",Font.BOLD,20));
        labelCity.setBounds(100,540,200,30);
        add(labelCity);

        textCity = new TextField();
        textCity.setFont(new Font("Arial",Font.BOLD,14));
        textCity.setBounds(300,540,400,30);
        textCity.setForeground(Color.BLACK);
        add(textCity);


        JLabel labelPin = new JLabel("Pin Code :");
        labelPin.setFont(new Font("Raleway",Font.BOLD,20));
        labelPin.setBounds(100,590,200,30);
        add(labelPin);

        textPin = new TextField();
        textPin.setFont(new Font("Arial",Font.BOLD,14));
        textPin.setBounds(300,590,400,30);
        textPin.setForeground(Color.BLACK);
        add(textPin);


        JLabel labelState = new JLabel("State :");
        labelState.setFont(new Font("Raleway",Font.BOLD,20));
        labelState.setBounds(100,640,200,30);
        add(labelState);

        textState = new TextField();
        textState.setFont(new Font("Arial",Font.BOLD,14));
        textState.setBounds(300,640,400,30);
        textState.setForeground(Color.BLACK);
        add(textState);

        next = new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(615,710,80,30);
        next.addActionListener(this);
        add(next);


        getContentPane().setBackground(new Color(175, 239, 204));
        setLayout(null);
        setUndecorated(true);
        setSize(850,800);
        setLocation(360,10);
        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
         String formno = first;
         String name = textName.getText();
         String fname = textFname.getText();
         String dob = ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
         String gender = "";
         if(r1.isSelected()){
             gender = "Male";
         } else if (r2.isSelected()) {
             gender = "Female";
         }
         String email = textEmail.getText();
         String marital = "";
         if(m1.isSelected()){
             marital = "Married";
         } else if (m2.isSelected()) {
             marital = "Unmarried";
         } else if (m3.isSelected()) {
             marital = "Other";
         }
         String address = textAdd.getText();
         String city = textCity.getText();
         String pincode = textPin.getText();
         String state = textState.getText();


         try{
             if(textName.getText().equals("")){
                 JOptionPane.showMessageDialog(null,"Fill all the fields");
             } else {
                 ConConnection con1 = new ConConnection();
                 String q = "insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pincode+"','"+state+"')";
                 con1.statement.executeUpdate(q);
                 JOptionPane.showMessageDialog(null,"Given Page Field Successfully");
                 new Signup2(first);
                 setVisible(false);
             }

         }catch (Exception E){
             E.printStackTrace();
         }
    }

    public static void main(String[] args) {
      new Signup();
    }
}
