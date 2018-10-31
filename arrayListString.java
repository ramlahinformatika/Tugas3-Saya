import java.util.ArrayList;


public class arrayListString {

	public static void main(String[] args) {
		ArrayList<String> arls= new ArrayList<String>();
		// menambahkan
		arls.add("ISMAIL");
		arls.add("GELATIK");
		arls.add("CONEL");
		System.out.println(arls);
		//menghapus
		arls.remove("ISMAIL");
		System.out.println(arls);
		
		ArrayList<String> arlS= (ArrayList<String>)arls.clone();
		arlS.add("MARZUKI");
		System.out.println("arls" +arls);
		System.out.println("arlS" +arlS);
		
		System.out.println("kosongkah:" + arls.isEmpty());
		if (arls.contains("ISMAIL"))
			System.out.println(" ada ISMAIL");
		else{
			System.out.println("tak ada ISMAIL");
		}
		System.out.println("arl1" +arls);
		System.out.println("arl2" +arlS);
			
	}

}
