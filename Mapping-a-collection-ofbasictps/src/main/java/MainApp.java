import org.hibernate.Session;
import org.hibernate.Transaction;

import com.collectionmap.Entity.Bank;
import com.collectionmap.Utility.HibernateUtil;

public class MainApp {

	public static void main(String[] args) {
		
		Bank b1 = new Bank("Canara");
		b1.getContacts().add("Contact1");
		b1.getContacts().add("Contact2");
		
		Transaction t1 = null;
		Session s1 = HibernateUtil.getSessionFactory().openSession();
		
		try {
			t1 = s1.beginTransaction();
			s1.save(b1);
			t1.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if(t1 != null)
				t1.rollback();
		}
		
				
	}
}
