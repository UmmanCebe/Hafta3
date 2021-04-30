package hafta3;


public class Main {

	public static void main(String[] args) {
		
		Student student1 = new Student();
		Student student2 = new Student();
		
		student1.setId(1);
		student1.setFirsName("Ali");
		student1.setLastName("Keskin");
		student1.setAldigiKurslar("Java + React");
		student1.setEgitmeni("Engin Demiroğ");
		
		student2.setId(2);
		student2.setFirsName("Veli");
		student2.setLastName("Yanbasan");
		student2.setAldigiKurslar("Programlamaya Giriş");
		student2.setEgitmeni("Engin Demiroğ");
		
		Instructor instructor1 = new Instructor();
		
		instructor1.setId(1);
		instructor1.setFirsName("Engin");
		instructor1.setLastName("Demiroğ");
		instructor1.setOgrencileri("Ali "+"Veli");
		instructor1.setVerdigiKurslar("C# + Angular,"+" Java + React," +" Proglamlamaya Giriş");
		
		UserManager usermanager = new UserManager();
		User[] users = {student1,student2,instructor1};
		
		usermanager.addMultiple(users);

		System.out.println("-------------------------------------------------------------------------");
		
		
		StudentManager studentManager = new StudentManager();
		studentManager.ogrBilgi(student1);
		studentManager.ogrBilgi(student2);
		
		System.out.println("-------------------------------------------------------------------------");
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.egitBilgi(instructor1);
		
		

	}

}
