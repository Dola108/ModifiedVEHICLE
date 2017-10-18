
public class Air {
	int x = 500;
	
	public void speed(String s) {
		if(s=="Helicopter")
			x = 700;
		
		System.out.println("Speed of " + s + " is " + x + "km/h");
	}
		
	public void isRunning(String s) {
		if(s=="Helicopter")
			x = 600;
		else
			x = 300;
		System.out.println(s + " is running at " + x + "km/h");
	}
}
