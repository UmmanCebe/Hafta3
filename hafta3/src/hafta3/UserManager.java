package hafta3;

public class UserManager {
	
	
	public void add(User user)
	{
		System.out.println(user.getFirsName()+" isimli ki�i kaydedildi.");
	}
	
	public void addMultiple(User[] users)
	{
		for(User user :users)
		{
			add(user);
		}

	}
	
	
}
	
	
