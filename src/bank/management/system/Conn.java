
package bank.management.system;
import java.sql.*;

//jdbc connection
public class Conn {
    Connection c;
    Statement s;
    public Conn(){
        try{
            
            //driver
         //   Class.forName(com.mysql.cj.jdbc.Driver);
            //create connection
            c= DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","505050");
            //create statement
            s=c.createStatement();
        }
        catch(Exception e){
           System.out.println(e); 
           
        }
    }
}
