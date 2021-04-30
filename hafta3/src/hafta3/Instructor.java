package hafta3;

public class Instructor extends User{
	
	String verdigiKurslar;
	String ogrencileri;
	
	public Instructor()
	{
		
	}
	
	public Instructor(String verdigiKurslar,String ogrencileri)
	{
		this.verdigiKurslar = verdigiKurslar;
		this.ogrencileri = ogrencileri;
	}

	public String getVerdigiKurslar() {
		return verdigiKurslar;
	}

	public void setVerdigiKurslar(String verdigiKurslar) {
		this.verdigiKurslar = verdigiKurslar;
	}

	public String getOgrencileri() {
		return ogrencileri;
	}

	public void setOgrencileri(String ogrencileri) {
		this.ogrencileri = ogrencileri;
	}
}
