package hafta3;

public class StudentManager extends UserManager{

	public void ogrBilgi(Student student)
	{
		System.out.println("Id: " + student.getId());
		System.out.println("Adý: " + student.getFirsName());
		System.out.println("Soyadý: " + student.getLastName());
		System.out.println("Eðitmeni: " + student.getEgitmeni());
		System.out.println("Kurslarý: " + student.getAldigiKurslar());
		System.out.println();
	}
	
}
