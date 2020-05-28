package Exception.CustomClass.Excesise;

public class TestUsrs {

	public static void main(String[] args) {
		UserName u=new UserName();
		try {
			u.m1("fei");
		} catch (NullNameException e) {
			
			e.printStackTrace();
		}
	}

}
