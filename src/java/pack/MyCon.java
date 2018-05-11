
package pack;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyCon {
static Connection con;
static{
try{
Class.forName("com.mysql.jdbc.Driver");
con=DriverManager.getConnection("jdbc:mysql://localhost:3306/feemanagement","root","riyaz");
if(con !=null){
    System.out.println("Connection is established");}

else{
        System.out.println("Connection is not established");}
}
catch(Exception e){
    System.out.println("there is some error in connection"+e.getMessage());}
}
public static Connection getCon(){
return con;
}
}

