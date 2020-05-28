package Oop.FinalizeGc;

public class TestFinalize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p=new Person();
		p=null;
		System.gc(); //建议垃圾回收器回收，这里只是建议，而不是命令
	}

}
class Person{
	//重写finalize方法，这个方法不是给程序元调用的，垃圾回收期再回收前会自动调用
	@Override
	
	protected void finalize() throws Throwable{
		//建议回收李冷靓
		System.out.println("回收");
	}
}
