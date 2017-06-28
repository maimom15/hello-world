package ATable;

public class UserhbmFile {

}

/*

If we want to make hibernate using mapping file we can give column lenght and null value like this

<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE hibernate-mapping PUBLIC "-//Hibernate/Hibernate Mapping DTD 3.0//EN" "http://hibernate.sourceforge.net/hibernate-mapping-3.0.dtd" >

<hibernate-mapping>
 	<class name="Entityclasses.User" table="user_info">
    
        <id name="user_id" type="int">
            <column name="id" />
            <generator class="assigned"/>  
        </id>
      
        <property name="user_name" type="string">
            <column name="name" length="20" not-null="true" unique="true"/>
        </property>
        
        <property name="user_salary" type="string">
            <column name="salary" length="20" not-null="true" unique="true"/>
        </property>
        	 	
 	</class>
 	
</hibernate-mapping>



*/
