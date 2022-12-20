public class Car1 {
	private int speed, maxSpeed;
	private String plate;
	
	public Car1(int a, String b, int c) {
		speed = a;
		plate = b;
        maxSpeed = c;
    }
	
	public void speedUp(){
		if(speed<=maxSpeed) {
			speed=speed+1;
		}	
	}
	
	public void slowDown() {
		if(speed>=0) {
			speed=speed - 1;
		}
	}
	
	public void speedUp(int a) {
		if(a>=0) {
			int max = speed + a;
			if(max<=maxSpeed) {
				speed = max;
			}
		}
	}
	
	public void slowDown(int a) {
		if(a>=0) {
			int min = speed - a;
			if(min>=0) {
				speed = min;

			}
		}
	}
	
	public int getSpeed() {
		return speed;	
	}
	
	public void stop() {
		speed=speed*0;
	}
	
	public void show() {
		System.out.println("License plate: "+plate+" Current car speed is: "+speed+" The max speed is: "+maxSpeed);
    }

}
