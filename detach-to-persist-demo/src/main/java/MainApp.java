import org.hibernate.Session;
import org.hibernate.Transaction;

import com.detachtopersist.entity.Student;
import com.detachtopersist.utitlity.HibernateUtil;

public class MainApp {

	public static void main(String[] args) {

        Transaction transOne = null;
        Transaction transtwo = null;
        
        Session sessionOne = HibernateUtil.getSessionFactory().openSession();
        Student s1 = new Student("virat","virat@gmail.com");
        transOne = sessionOne.beginTransaction();
        
        sessionOne.persist(s1);
        transOne.commit();
        sessionOne.close(); // now s1 become detached
        
        Session sessionTwo = HibernateUtil.getSessionFactory().openSession();
        s1.setEmail("virat@ibm.com"); //trying to change the detached instance
        transtwo = sessionTwo.beginTransaction();
        
        sessionTwo.merge(s1); //now detached s1 will become persistent again
        
        transtwo.commit();
        sessionTwo.close();

	}

}
