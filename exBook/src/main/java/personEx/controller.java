package personEx;

import java.util.ArrayList;
import java.util.List;

public class controller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		person man1 = new person();
		person man2 = new person();
		person man3 = new person();
		
		man1.setAge(22);
		man1.setJob("software engineer");
		man1.setName("arbab");
		
		man2.setAge(21);
		man2.setJob("senior developer");
		man2.setName("abdullah");
		
		man3.setAge(21);
		man3.setJob("senior software engineer");
		man3.setName("zain");
		

		List<Object> listPerson = new ArrayList<Object>();
		listPerson.add(man1);
		listPerson.add(man2);
		listPerson.add(man3);
//		System.out.println(listPerson);
//		System.out.println(man2.toString());
//		System.out.println(man3.toString());
		
		listPerson.forEach(p -> System.out.println(p)); 
		
		


	}

}
