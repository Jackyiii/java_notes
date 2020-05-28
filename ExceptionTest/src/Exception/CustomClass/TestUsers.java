package Exception.CustomClass;

public class TestUsers {

	public static void main(String[] args) {
		UserService u=new UserService();
		try {
			u.register("sss");
		} catch (IllegalNameException e) {
			
			e.printStackTrace();
		}
	}

}
