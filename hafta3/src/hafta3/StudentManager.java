package hafta3;

public class StudentManager extends UserManager{

	public void ogrBilgi(Student student)
	{
		System.out.println("Id: " + student.getId());
		System.out.println("Ad�: " + student.getFirsName());
		System.out.println("Soyad�: " + student.getLastName());
		System.out.println("E�itmeni: " + student.getEgitmeni());
		System.out.println("Kurslar�: " + student.getAldigiKurslar());
		System.out.println();
	}
	
}
