package Key.This;

public class MyDate {
	private int years;
	private int months;
	private int days;
	
	public MyDate() {
		//MyDate(1910,01,01);无法通过无参构造方法调用有参构造方法
		this(1910, 01, 01);
		//调用系统的构造方法用this（）；
		
	}
	public MyDate(int years,int months,int days) {
		this.years=years;
		this.months=months;
		this.days=days;
		System.out.println(this.years+"-"+this.months+"-"+this.days);
	};
	
	public void setYears(int years) {
		this.years=years;
	}
	public int getYears() {
		return this.years;
	}
	public void setMonths(int months) {
		this.months=months;
	}
	public int getMonth() {
		return this.months;
	}
	public void setDays(int days) {
		this.days=days;
	}
	public int getDays() {
		return days;
	}
}
