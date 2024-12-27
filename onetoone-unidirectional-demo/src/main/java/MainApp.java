import com.onetone.uniderection.entity.Instructer;
import com.onetone.uniderection.entity.Instructer_Detail;
import com.onetoone.unidirectional.Dao.InstructerDao;

public class MainApp {

	public static void main(String[] args) {
		
		Instructer inst1 = new Instructer();
		inst1.setName("Jone");
		
		Instructer_Detail det1 = new Instructer_Detail();
		det1.sethobby("Drawing");
		
		inst1.setInst_detail(det1);
		
		InstructerDao dao = new InstructerDao();
		dao.SaveInstructer(inst1);
	}

}
