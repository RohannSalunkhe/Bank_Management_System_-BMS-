package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pin extends JFrame implements ActionListener {

    String pin;

    JButton b1,b2;

    JPasswordField p1,p2;

    Pin(String pin){

        this.pin = pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,830, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1550,830);
        add(l3);


        JLabel label1 = new JLabel("CHANGE YOUR PIN");
        label1.setFont(new Font("System",Font.BOLD,16));
        label1.setBounds(430,180,400,35);
        label1.setForeground(Color.WHITE);
        l3.add(label1);

        JLabel label2 = new JLabel("New PIN :");
        label2.setFont(new Font("System",Font.BOLD,16));
        label2.setBounds(430,220,400,35);
        label2.setForeground(Color.WHITE);
        l3.add(label2);

        p1 = new JPasswordField();
        p1.setBounds(430,250,200,35);
        p1.setBackground(new Color(65,125,128));
        p1.setForeground(Color.WHITE);
        p1.setFont(new Font("System",Font.BOLD,22));
        l3.add(p1);

        JLabel label3 = new JLabel("Re-enter New PIN :");
        label3.setFont(new Font("System",Font.BOLD,16));
        label3.setBounds(430,280,400,35);
        label3.setForeground(Color.WHITE);
        l3.add(label3);

        p2 = new JPasswordField();
        p2.setBounds(430,310,200,35);
        p2.setBackground(new Color(65,125,128));
        p2.setForeground(Color.WHITE);
        p2.setFont(new Font("System",Font.BOLD,22));
        l3.add(p2);



        b1 = new JButton("CHANGE");
        b1.setBounds(700,362,150,35);
        b1.setBackground(new Color(65,125,128));
        b1.setFont(new Font("Arial",Font.BOLD,14));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        l3.add(b1);

        b2 = new JButton("BACK");
        b2.setBounds(700,406,150,35);
        b2.setBackground(new Color(65,125,128));
        b2.setFont(new Font("Arial",Font.BOLD,14));
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        l3.add(b2);


        setSize(1550,1080);
        setLayout(null);
        setUndecorated(true);
        setLocation(0,0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

          if(e.getSource() == b2){
                setVisible(false);
                new main_Class(pin);
          }

        try {

            String  pin1 = p1.getText();
            String  pin2 = p2.getText();

            if(Integer.parseInt(pin1) != Integer.parseInt(pin2)){
                JOptionPane.showMessageDialog(null,"Entered PIN Does Not Match!!");
                return;
            }
            if (e.getSource() == b1){
                if(p1.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Enter New PIN");
                    return;

                }
                if(p2.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Re-enter New PIN");
                    return;
                }

                ConConnection c = new ConConnection();
                String q1 = "update bank set pin = '"+pin1+"' where pin = '"+pin+"'";
                String q2 = "update login set pin = '"+pin1+"' where pin = '"+pin+"'";
                String q3 = "update signupthree set pin = '"+pin1+"' where pin = '"+pin+"'";


                c.statement.executeUpdate(q1);
                c.statement.executeUpdate(q2);
                c.statement.executeUpdate(q3);

                JOptionPane.showMessageDialog(null,"PIN Changed Successfully!! ");
                setVisible(false);
                new main_Class(pin);



            }
        }catch (Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Pin("");
    }
}
