package Exception.CustomClass;

public class UserService {

	public void register(String username) throws IllegalNameException {
		if(username.length()<6) {
			//抛出一个非法用户名的异常
			
			//这里使用的throw 不是throws
			throw new IllegalNameException("用户名长度不能小于6");
		}else {
			System.out.println("执行成功");
		}
	}

}
