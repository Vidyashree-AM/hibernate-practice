import org.hibernate.Session;
import org.hibernate.Transaction;

import com.onetomany.unidirectional.Entity.EntityA;
import com.onetomany.unidirectional.Entity.EntityB;
import com.onetomany.unidirectional.utility.HibernateUtil;

public class MainApp {

	public static void main(String[] args) {
		
		Transaction trans = null;
		Session s1 = HibernateUtil.getSessionFactory().openSession();
		EntityA inst1 = new EntityA();
		inst1.setEntityA_name("Ramesh");
		
		EntityB inst2 = new EntityB();
		inst2.setEntityB_name("Suresh");
		
		EntityB inst3 = new EntityB();
		inst3.setEntityB_name("Ganesh");
		
		inst1.getEntityBList().add(inst2);
		inst1.getEntityBList().add(inst3);
		
		try {
			trans = s1.beginTransaction();
			s1.save(inst1);
			trans.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			if(trans != null)
				trans.rollback();
		}
	}
}
