package Exception.CustomClass;

public class IllegalNameException extends Exception {

	//自定义的异常
	private static final long serialVersionUID = 1520531972828809449L;
	public IllegalNameException() {
		super();
	}
	public IllegalNameException(String msg) {
		super(msg);
	}
	
}
