package ATable;



import java.sql.*;  


public class Create
{

    public static void main(String args[]) 
    {
        try 
        {
        	Class.forName("com.mysql.jdbc.Driver");

            
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/springmvc", "root", "root");

            
            Statement stmt = con.createStatement();
            
            //step4 Excecute the query
            stmt.executeUpdate("create table users(id  int(5)  primary key, role varchar(20), user_name varchar(20), user_password varchar(20))");
                    
            System.out.println("Success");

            //step5 close the connection object  
            con.close();

        } 
        catch (Exception e) 
        {
            System.out.println(e.toString());
            
        }

    }
}



//C:\oraclexe\app\oracle\product\10.2.0\server\jdbc\lib   --location of jdbc jar file 


/*

3 statement objects are available

1- Statement
2- prepared statement 
3- callable statement


prepared statement is much faster than other statements and secure too.

*/
