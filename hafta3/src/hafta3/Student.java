package hafta3;

public class Student extends User {
	
	String aldigiKurslar;
	String egitmeni;
	
	public Student()
	{
		
	}
	
	public Student(String aldigiKurslar,String egitmeni)
	{
		this.aldigiKurslar = aldigiKurslar;
		this.egitmeni = egitmeni;
	}

	public String getAldigiKurslar() {
		return aldigiKurslar;
	}

	public void setAldigiKurslar(String aldigiKurslar) {
		this.aldigiKurslar = aldigiKurslar;
	}

	public String getEgitmeni() {
		return egitmeni;
	}

	public void setEgitmeni(String egitmeni) {
		this.egitmeni = egitmeni;
	}
}
