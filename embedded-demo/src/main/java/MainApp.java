import org.hibernate.Session;
import org.hibernate.*;

import com.embedded.entity.Address;
import com.embedded.entity.Name;
import com.embedded.entity.User;
import com.embedded.util.HibernateUtil;

public class MainApp {

	public static void main(String[] args) {
		
		Address a1 = new Address("123", "sri rama", "Tarikere", "karntaka", "India");
		Name n1=new Name("kava","shree");
		User inst1=new User(n1,"kav@gmail.com",a1);
		
		Transaction trans= null;
		
		try(Session session=HibernateUtil.getSessionFactory().openSession()) {
			
			 trans=session.beginTransaction();
			 session.save(inst1);
			 trans.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if(trans != null)
				trans.rollback();
		}
	}

}
