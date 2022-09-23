
public class Cars {
	public void fullThrottle() {
		System.out.println("The car is driving as fast as possible");
	}
	public void speed(int maxSpeed) {
		System.out.println("max speed is:" + maxSpeed);
				
	}

	public static void main(String[] args) {
		Cars myCar = new Cars();
		myCar.fullThrottle();
		myCar.speed(200);

	}

}
