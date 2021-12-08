package work;

public class SuperCar extends Car implements Audio {
	void speedUp(int speed) {
		super.speed = super.speed + speed;
		System.out.println(speed + "加速しました");
	}
	
	@Override
	public void play() {
		System.out.println("再生します");
	}

}
