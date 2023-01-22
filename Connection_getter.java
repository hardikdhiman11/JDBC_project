package co.student.manage;

import java.sql.Connection;
import java.sql.DriverManager;


public class Connection_getter
{
    //Creating a variable of connection type
    static Connection con;
    public static Connection  create_Connection()  //Method with a return type connection
    {



        try{
            Class.forName("com.Mysql.jdbc.Driver"); //Load the driver

            String username="root";
            String password="itsmehardik.com";
            String url="jdbc:mysql::/localhost:3306/mydog";
            con= DriverManager.getConnection(url,username,password);
        }
        catch(Exception e)
        {
                e.printStackTrace();    //For printing the exception
        }
        return con;
    }
}
