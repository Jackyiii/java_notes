package Array.ManagerExercises;

import java.util.Scanner;

public class TestHotel {

	public static void main(String[] args) {
		//酒店管理系统，可以预定房间，退房的功能，酒店一共5层，每层10个房间
		//1，2层是标准间
		//3，4层是双人间
		//5层是豪华间
		String services;
		int id;
//		for(int i=0;i<info.getStatut().length;i++) {
//			for(int j=0;j<info.getStatut()[i].length;j++) {
//				System.out.print(info.getStatut()[i][j]+" ");
//			}
//			System.out.println();
//		}
		RoomInfo info=new RoomInfo();
		System.out.println("请问您需要什么服务");
		Scanner sc= new Scanner(System.in);
		services=sc.nextLine();
		if(services.equals("预定")) {
			
			System.out.println("请问您想预定房间的类型");
			Scanner uInput=new Scanner(System.in);
			info.CheckIn(uInput.next());
		}else if(services.equals("退房")) {
			
			System.out.println("请输入您的房间编号");
			Scanner usrInput= new Scanner(System.in);
			info.CheckOut(usrInput.nextInt());
			
		}
	}
	
}
