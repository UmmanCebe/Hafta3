package hafta3;

public class InstructorManager extends UserManager {
	
	public void egitBilgi(Instructor instructor)
	{
		System.out.println("Id: " + instructor.getId());
		System.out.println("Ad�: " + instructor.getFirsName());
		System.out.println("Soyad�: " + instructor.getLastName());
		System.out.println("��rencileri: " + instructor.getOgrencileri());
		System.out.println("Verdi�i Kurslar: " + instructor.getVerdigiKurslar());
	}

}
