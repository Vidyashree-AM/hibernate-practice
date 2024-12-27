import org.hibernate.Session;
import org.hibernate.Transaction;

import com.sessionevict.entity.Student;
import com.sessionevict.util.HibernateUtil;

public class MainDemo {
	
	public static void main(String[] args) {
		
		Transaction trans = null;
		
		try (Session session = HibernateUtil.getSessionFactory().openSession()){
			trans = session.beginTransaction();
			
			Student s1 = session.load(Student.class, 2);
			System.out.println(s1.getName()+"first time");
			Student s2 = session.load(Student.class, 2);
			System.out.println(s2.getName()+"sec time");
			session.evict(s2);
			
			Student s3=session.load(Student.class, 2);
			System.out.println(s3.getName()+"third time");
			
			trans.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if(trans != null)
				trans.rollback();
		}
	}

}
