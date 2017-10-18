import java.util.Scanner;

public class Vehicle {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] choice = new int[1];
		
		char[] st = new char[3];
		Land  lv = new Land();
		Water wv = new Water();
		Air   av = new Air();
		
		System.out.println("Choose any one of the below: \n1.Land\n2.Water\n3.Air");
		
		while(true) {
			System.out.println("Enter choice: ");
			
			choice[0]  = sc.nextInt();
			
			if(choice[0]==0){
				try {
					throw new Exception();
				}catch(Exception ex) {
					System.out.println("Invalid Input: " + ex);
					break;
				}
			}			
			
			if(choice[0]==1) {
				lv.speed("Car");
				lv.isRunning("Car");
				lv.speed("Bus");
				lv.isRunning("Bus");
			}
			
			else if(choice[0]==2) {
				wv.speed("Boat");
				wv.isRunning("Boat");
				wv.speed("Ship");
				wv.isRunning("Ship");
			}
			
			else if(choice[0]==3){
				av.speed("Aeroplane");
				av.isRunning("Aeroplane");
				av.speed("Helicopter");
				av.isRunning("Helicopter");
			}			
		}
	}
}
