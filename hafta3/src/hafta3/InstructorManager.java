package hafta3;

public class InstructorManager extends UserManager {
	
	public void egitBilgi(Instructor instructor)
	{
		System.out.println("Id: " + instructor.getId());
		System.out.println("Adý: " + instructor.getFirsName());
		System.out.println("Soyadý: " + instructor.getLastName());
		System.out.println("Öðrencileri: " + instructor.getOgrencileri());
		System.out.println("Verdiði Kurslar: " + instructor.getVerdigiKurslar());
	}

}
