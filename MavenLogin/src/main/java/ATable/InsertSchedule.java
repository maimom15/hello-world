package ATable;


import java.sql.*;  


public class InsertSchedule 
{

    public static void main(String args[]) 
    {
        try 
        {
           
            Class.forName("com.mysql.jdbc.Driver");

             
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/springmvc", "root", "root");

            
            Statement stmt = con.createStatement();
            
            /*
             * CREATE TABLE BusSchedule (
				schedule_id int not null,
			    drivername varchar(20),
			    bus_id varchar(20),
			    passenger_name varchar(20),
			    destination_id varchar(50),
			    id int,
			    PRIMARY KEY (schedule_id),
			    FOREIGN KEY (id) REFERENCES users(id)
			);
             * */
             
            stmt.executeUpdate("insert into BusSchedule values(1,'heng','B001','mom','K-P',2)");
        
            
    
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

