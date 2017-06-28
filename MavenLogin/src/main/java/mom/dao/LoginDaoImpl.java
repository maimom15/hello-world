package mom.dao;

import java.util.ArrayList;
import java.util.List;

import mom.entity.BusSchedule;
import mom.entity.User;
import mom.model.Login;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;






import HibernateUtil.HibernateUtil;


public class LoginDaoImpl{
	
	Transaction tra =null;
	User user=null;

    public Login checkLogin(Login login){
    	
    	  String name=login.getName();
	      String password=login.getPassword();	
	      login.setCheckLogin(false);
    	
			System.out.println("In Check login");
			Session session = HibernateUtil.getSessionFactory().openSession();
			tra= session.beginTransaction();
			//Query using Hibernate Query Language
			String SQL_QUERY ="from User as o where o.name=? and o.password=? ";
			Query query = session.createQuery(SQL_QUERY);
			query.setParameter(0,name);
			query.setParameter(1,password);
			List <User>list = query.list();
			
			System.out.println();
			if ((list != null) && (list.size() > 0)) {
				String role = null;
				for(User us:list){
					role= us.getRole();
					break;
				}
				login.setRole(role);
				login.setCheckLogin(true);
			}
			
			session.close();
			
			return login;              
    }
    public List<BusSchedule> getSchedule() {
        List<BusSchedule> bus = new ArrayList<BusSchedule>();
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            tra = session.beginTransaction();
            bus = session.createQuery("from BusSchedule").list();
        } 
        catch (RuntimeException e) {
            e.printStackTrace();
            return bus;
        } 
        finally {
            session.flush();
            session.close();
        }
        return bus;
    }

}
