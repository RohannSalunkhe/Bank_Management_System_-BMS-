package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.EventListener;

public class Login extends JFrame implements ActionListener {

    JLabel labl1,labl2,labl3;

    JTextField textField2;

    JPasswordField passwordField3;

    JButton  button1,button2,button3;

    Login(){

        super("Bank Management System ");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350,10,100,100);
        add(image);

        ImageIcon ii1 = new ImageIcon(ClassLoader.getSystemResource("icons/card.png"));
        Image ii2 = ii1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon ii3 = new ImageIcon(ii2);
        JLabel iimage = new JLabel(ii3);
        iimage.setBounds(630,350,100,100);
        add(iimage);


        labl1 = new JLabel("WELCOME TO ATM");
        labl1.setForeground(Color.WHITE);
        labl1.setFont(new Font("AvantGarde",Font.BOLD,38));
        labl1.setBounds(230,125,450,40);
        add(labl1);

        labl2 = new JLabel("Card No:");
        labl2.setFont(new Font("Raleway",Font.BOLD,28));
        labl2.setForeground(Color.WHITE);
        labl2.setBounds(150,190,375,30);
        add(labl2);


        textField2 = new JTextField(15);
        textField2.setBounds(325,190,230,30);
        textField2.setFont(new Font("Arial",Font.BOLD,14));
        add(textField2);


        labl3 = new JLabel("PIN:");
        labl3.setFont(new Font("Raleway",Font.BOLD,28));
        labl3.setForeground(Color.WHITE);
        labl3.setBounds(150,250,375,30);
        add(labl3);

        passwordField3 = new JPasswordField(15);
        passwordField3.setBounds(325,250,230,30);
        passwordField3.setFont(new Font("Arial",Font.BOLD,14));
        add(passwordField3);


        button1 = new JButton("SIGN IN");
        button1.setForeground(Color.WHITE);
        button1.setBackground(Color.BLACK);
        button1.setFont(new Font("Arial",Font.BOLD,14));
        button1.setBounds(300,330,100,30);
        button1.addActionListener(this);
        add(button1);


        button2 = new JButton("CLEAR");
        button2.setForeground(Color.WHITE);
        button2.setBackground(Color.BLACK);
        button2.setFont(new Font("Arial",Font.BOLD,14));
        button2.setBounds(430,330,100,30);
        button2.addActionListener(this);
        add(button2);


        button3 = new JButton("SIGN UP");
        button3.setFont(new Font("Arial",Font.BOLD,14));
        button3.setForeground(Color.WHITE);
        button3.setBackground(Color.BLACK);
        button3.setBounds(300,380,230,30);
        button3.addActionListener(this);
        add(button3);


        ImageIcon iii1 = new ImageIcon(ClassLoader.getSystemResource("icons/backbg.png"));
        Image iii2 = iii1.getImage().getScaledInstance(850,480,Image.SCALE_DEFAULT);
        ImageIcon iii3 = new ImageIcon(iii2);
        JLabel iiimage = new JLabel(iii3);
        iiimage.setBounds(0,0,850,480);
        add(iiimage);

        setLayout(null);
        setSize(850,480);
        setLocation(350,200);
        setUndecorated(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
             if(e.getSource() == button1){

                 ConConnection c = new ConConnection();
                 String cardno = textField2.getText();
                 String pin = passwordField3.getText();
                 String q = "select * from login where card_number = '"+cardno+"' and pin = '"+pin+"'";
                 ResultSet resultSet = c.statement.executeQuery(q);
                 if(resultSet.next()){
                     setVisible(false);
                     new main_Class(pin);
                 }else{
                     JOptionPane.showMessageDialog(null,"Incorrect Card Number and PIN");
                 }

             }
             else if(e.getSource() == button2){
                  textField2.setText("");
                  passwordField3.setText("");
             }
             else if(e.getSource() == button3){
                  new Signup();
                  setVisible(false);

             }
           }catch (Exception E){
               E.printStackTrace();
           }
    }

    public static void main(String[] args) {
    Login login = new Login();
  }
}