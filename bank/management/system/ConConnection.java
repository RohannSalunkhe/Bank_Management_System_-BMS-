package bank.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ConConnection {
    Connection connection;
    Statement statement;
          public ConConnection(){
             try {
             connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem","root","123456789");
             statement = connection.createStatement();
             }catch (Exception e){
                 e.printStackTrace();
             }
         }
}
