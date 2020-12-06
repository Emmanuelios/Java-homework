import java.util.ArrayList;
import java.util.List;

public class Teststudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1 = new Student("Charles Long", "39612080072", 2016 ,"Togo","Akadeemia tee 7", "EE5758964852", "+37253913048");
		Student s2 = new Student("Knight Henry", "49612585679", 2015 ,"Estonia" ,"Mustamae tee 100", "EE5896374851", "+37268524875");
		Student s3 = new Student("Alex Osa", "57567892023", 2017,"Nigeria" , "Ulemistee tee 76",  "EE5693214789", "+37256398452");
		Student s4 = new Student("Nancy Log", "15289756320", 2020 ,"Cyprus" , "Kadaka tee 85",  "EE6984236584", "+37269358629");
		Student s5 = new Student("Trae Young", "87952486358", 2014,"England" ,"Akadeemia tee 11",  "EE2548965381", "+37265821479");
		Student s6 = new Student("Alexis Caruso", "79812534879", 2018 ,"Brazil" , "Nomae tee 27",  "EE5693547836", "+37262589741");
		Student s7 = new Student("Pope Kate", "25963874121", 2020,"Costarica", "Estonia tee 52",  "EE6698745235", "+37256987412");
		//create a list of products
		List<Student> StudentList = new ArrayList();
		
		StudentList .add(s1);
		StudentList .add(s2);
		StudentList .add(s3);
		StudentList .add(s4);
		StudentList .add(s5);
		StudentList .add(s6);
		StudentList .add(s7);

		//for (Student s : StudentList) {
		//	System.out.println(s);
		//}
		for (Student s : StudentList) {
			System.out.println(s.getName() + " " + s.getAdyear());
	}
		System.out.println();
		int frommycountry= 0;
		for (Student s : StudentList) { if (s.getCountryoforigin().contains("Togo"))
			frommycountry++;
	}
	System.out.println("I decovered " + frommycountry + " student from my country" ); 

	System.out.println();
	
	int NotEstoniancitizens = 0;
	for (Student s : StudentList) {
	if (!s.getCountryoforigin().contains("Estonia")) 
	NotEstoniancitizens ++;
	}
	System.out.println("I decovered " + NotEstoniancitizens + " students are not Estonia Citizens" ); 
	
	System.out.println();
	
	for (Student s : StudentList) {
	if (s.getAdyear() != 2020)
	System.out.println(s.getName() + " " + s.getAdyear());
	}
	System.out.println();
	
	for (Student s : StudentList) {
	if (s.getAdyear() == 2020)
	 System.out.println(s.getName() + " " + s.getAdyear());
	}
	
	 }

}