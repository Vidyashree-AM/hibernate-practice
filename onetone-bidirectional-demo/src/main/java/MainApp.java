import com.onetoone.bidirectional.Dao.InstructerDao;
import com.onetoone.bidirectional.Dao.InstructerDetailDao;
import com.onetoone.bidirectional.entity.Instructer;
import com.onetoone.bidirectional.entity.Instructer_detail;

public class MainApp {

	public static void main(String[] args) {

           Instructer ins1 = new Instructer();
           ins1.setName("Sita");

           Instructer_detail det1 = new Instructer_detail();
           det1.setHobby("drama");
           
           ins1.setInst_dtl(det1);
           det1.setInstructer(ins1);
           
           InstructerDao dao = new InstructerDao();
           dao.SaveInstructer(ins1);
           
	}

}
