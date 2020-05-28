package Exception.CustomClass.Excesise;

public class UserName {
	public void m1(String name) throws NullNameException {
		
		if(name!="fei") {
			System.out.println("user is not right");
			throw new NullNameException();
		}
		else {
			System.out.println("user is right");
		}
	}

}
