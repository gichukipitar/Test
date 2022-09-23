
public class Construct {
	int modelYear;
	String carName;
	public Construct(int year, String name) {
		modelYear = year;
		carName = name;
	}

	public static void main(String[] args) {
		Construct car = new Construct(2010, "volvo");
		System.out.println(car.modelYear  + " "+ car.carName);		

	}

}
