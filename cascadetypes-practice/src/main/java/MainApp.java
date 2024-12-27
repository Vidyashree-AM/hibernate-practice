import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.cascadetpes.Util.HibernateUtil;
import com.cascadetpes.entity.Person;
import com.cascadetpes.entity.Phone;

public class MainApp {

	public static void main(String[] args) {
		
		//Cascade persist example
		/*Person p1 = new Person();
		p1.setId(123);
		p1.setName("vida");

		Phone phone = new Phone();
		phone.setId(111);
		phone.setNumber("9886409243");
		
		p1.addPhone(phone);
		
		Transaction trans =  null;
		
		try (Session session=HibernateUtil.getSessionFactory().openSession()){
			
			trans =  session.beginTransaction();
			session.persist(p1);
			trans.commit();
			
		} catch (Exception e) {
			
			e.printStackTrace();
			if(trans != null)
				trans.rollback();
		}*/
		
        //cacscade Merge
		
		/*Transaction trans =  null;
		
		try (Session session=HibernateUtil.getSessionFactory().openSession()){
			
			trans =  session.beginTransaction();
			
			Phone ph1=session.find(Phone.class,111L);
			Person p2 = ph1.getOwner();
			
			p2.setName("Kav");
			ph1.setNumber("920900250");
			
			session.merge(p2);
			trans.commit();
			
		}catch(Exception e) {
			e.printStackTrace();
			if(trans != null)
				trans.rollback();
		}*/
		
		//Cascade Remove
		Transaction trans =  null;
		
		try (Session session=HibernateUtil.getSessionFactory().openSession()){
			
			trans =  session.beginTransaction();
			
			Person p3 = session.find(Person.class, 123);
			
			session.remove(p3);
			
			trans.commit();
			
		}catch(Exception e) {
			e.printStackTrace();
			if(trans != null)
				trans.rollback();
		}
			
	
	}

}
