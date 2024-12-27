import org.hibernate.Session;
import org.hibernate.Transaction;

import com.sessionclear.entity.Student;
import com.sessionclear.util.HibernateUtil;

public class MainApp {

	public static void main(String[] args) {
		
		Transaction trans = null;
		Session session = HibernateUtil.getSessionFactory().openSession();
		try{
			session.beginTransaction();
			
			Student s1 = session.load(Student.class, 2);
			System.out.println(s1.getName()+""+s1.getEmail()+" "+s1.getId());
			
			Student s2 = session.load(Student.class, 2);
			System.out.println(s2.getName()+""+s2.getEmail()+" "+s2.getId());
			
			session.clear();
			
			Student s3 = session.load(Student.class, 2);
			System.out.println(s3.getName()+""+s3.getEmail()+" "+s3.getId());
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
