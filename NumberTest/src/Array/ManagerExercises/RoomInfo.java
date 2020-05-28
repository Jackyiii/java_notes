package Array.ManagerExercises;

public class RoomInfo {
	
	private String [][] id=new String[5][10];
	private boolean[][] statut=new boolean[5][10];
	public RoomInfo() {
		for(int i=0;i<5;i++) {
			for(int j=0;j<10;j++) {
				if(i==0||i==1) {
					id[i][j]="标准间";
				}else if(i==2||i==3) {
					id[i][j]="双人间";
				}else if(i==4) {
					id[i][j]="豪华间";
				}
			}
		}
		for(int i=0;i<5;i++) {
			for(int j=0;j<10;j++) {
				statut[i][j]=true;
			}
		}
		for(int i=0;i<5;i++) {
			for(int j=0;j<10;j++) {
				System.out.print(id[i][j]+"  ");
			}
			System.out.println();
		}
	}
	public String[][] getId() {
		return id;
	}
	public void setId(String[][] id) {
		this.id = id;
	}
	public boolean[][] getStatut() {
		return statut;
	}
	public void setStatut(boolean[][] statut) {
		this.statut = statut;
	}
	public void CheckOut(int check) {
		int i=check/10;
		int j=check%10;
		statut[i][j]=true;
	}
	public void CheckIn(String room) {
		if(room.equals("标准间")) {
			for(int i=0;i<=1;i++) {
				for(int j=0;j<id[i].length;j++) {
					System.out.print(id[i][j]+" ");
				}
				System.out.println();
			}
		}else if(room.equals("双人间")) {
			for(int i=2;i<=3;i++) {
				for(int j=0;j<id[i].length;j++) {
					System.out.print(id[i][j]+" ");
				}
				System.out.println();
			}			
		}else if(room.equals("豪华间")) {
			for(int j=0;j<id[4].length;j++) {
				System.out.print(id[4][j]+" ");
			}
			System.out.println();				
		}
		
	}
}
