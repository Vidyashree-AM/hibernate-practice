import java.util.List;

import com.hibernate.crud.Dao.StudentDao;
import com.hibernate.crud.model.Student;

public class MainApp {

	public static void main(String[] args) {
		
	    StudentDao dao =  new StudentDao();
	    
	    Student s1 = new Student("manjla","manjla@gmail.com");
	    dao.saveStudent(s1);
	    
	    s1.setName("mahesh");
	    dao.UpdateStudent(s1);
	    
	    Student s2 = dao.getStudentById(s1.getId());
	    System.out.println("id"+ s2.getId()+"name"+s2.getName()+"email"+s2.getEmail());
	    
	    List<Student> Students= dao.getAllStudent();
	    for (Student s3 : Students) {
			System.out.println(s3.getId());
		}
	    
	    dao.deleteStudent(s1.getId());

	}

}
