
public class Car {
	private int fuel;
	private double distance;
	private double fuelEconomy;
	
	public Car(int fuel, double fuelEconomy) {
		super();
		this.fuel = fuel;
		this.fuelEconomy = fuelEconomy;
	}

	public int getFuel() {
		return fuel;
	}

	public void setFuel(int fuel) {
		this.fuel = fuel;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public double getFuekEconomy() {
		return fuelEconomy;
	}

	public void setFuekEconomy(int fuelEconomy) {
		this.fuelEconomy = fuelEconomy;
	}
	
	public void customize(double rate) {
		fuelEconomy = fuelEconomy + (1 + rate);
	}
	
	public double calcDistance() {
		distance = fuel * fuelEconomy;
		return distance;
	}
	
	public void message() {
		calcDistance();
		System.out.println("車は" + distance + "進んだ");
	}
	

}
