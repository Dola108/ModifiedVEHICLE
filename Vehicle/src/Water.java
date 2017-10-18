
public class Water extends Vehicle {
	int x = 30;
	
	public void speed(String s) {
		if(s=="Ship")
			x = 80;
		
		System.out.println("Speed of " + s + " is " + x + "km/h");
	}
		
	public void isRunning(String s) {
		if(s=="Ship")
			x = 40;
		else
			x = 15;
		System.out.println(s + " is running at " + x + "km/h");
	}
}
