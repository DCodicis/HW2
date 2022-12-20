public class Program {

	public static void main(String[] args) {
		Car1 car1=new Car1(0, "12345", 120);
		Car1 car2=new Car1(0, "123456", 100);
		int rnd = (int)(Math.random() * 150 + 50);
        int speed = car2.getSpeed();

		car1.speedUp(5);
		car2.speedUp(1);
		car1.show();
		car2.show();
		car2.speedUp(rnd);
        

        if(speed>30){
            speed = speed - 30;
            car2.slowDown(speed);

        }
        if(speed<30){
            speed = 30 - speed;
            car2.speedUp(speed);
        }

        car2.show();
    
    }
}

