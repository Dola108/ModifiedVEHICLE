
public class Land extends Vehicle{
	int x = 180;
	
	public void speed(String s) {
		if(s=="Car")
			x = 120;
		
		System.out.println("Speed of " + s + " is " + x + "km/h");
	}
		
	public void isRunning(String s) {
		if(s=="Car")
			x = 80;
		else
			x = 120;
		System.out.println(s + " is running at " + x + "km/h");
	}
}
