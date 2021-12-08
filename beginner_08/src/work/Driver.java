package work;

public class Driver {

	public static void main(String[] args) {
		SuperCar car = new SuperCar();
		int speed = car.getSpeed();
		System.out.println("現在の速度は" + speed);
		
		car.accele(50);
		speed = car.getSpeed();
		System.out.println("現在の速度は" + speed);
		
		car.speedUp(100);
		speed = car.getSpeed();
		System.out.println("現在の速度は" + speed);
		
		car.play();
		
		car.brake();
		speed = car.getSpeed();
		System.out.println("現在の速度は" + speed);
		

	}

}
