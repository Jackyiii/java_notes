package Exception.CustomClass.Excesise;

public class NullNameException extends Exception {
	private static final long serialVersionUID = -6535879983775480173L;
	public NullNameException() {
		super();
	}
	public NullNameException(String name) {
		super(name);
	}

}
