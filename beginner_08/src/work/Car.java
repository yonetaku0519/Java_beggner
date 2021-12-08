package work;

public class Car {
	int speed;
	
	public void accele(int speed) {
		this.speed = speed;
		System.out.println("時速" + speed + "m");
	}
	
	public void brake() {
		this.speed = 0;
		System.out.println("停止しました");
	}
	
	public int getSpeed() {
		return speed;
	}

}
