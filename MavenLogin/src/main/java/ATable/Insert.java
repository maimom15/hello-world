package ATable;


import java.sql.*;  


public class Insert 
{

    public static void main(String args[]) 
    {
        try 
        {
           
            Class.forName("com.mysql.jdbc.Driver");

             
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/springmvc", "root", "root");

            
            Statement stmt = con.createStatement();
            
            
            stmt.executeUpdate("insert into users values(20,'teacher','Leo','123')");
            
            stmt.executeUpdate("insert into users values(21,'student','Kimhak','123')");
            
    
            System.out.println("Success");

            //step5 close the connection object  
            con.close();

        } catch (Exception e) 
        {
            System.out.println(e.toString());
            
        }

    }
}



//C:\oraclexe\app\oracle\product\10.2.0\server\jdbc\lib


/*

3 statement objects are available

1- Statement
2- prepared statement 
3- callable statement


prepared statement is much faster than other statements and secure too.

*/

