
public class Main {
	static void myStaticMethod() {
		System.out.println("my static method");
	}
	public void myPublicMethod() {
		System.out.println("My public method");
	}

	public static void main(String[] args) {
		myStaticMethod();
		Main myObj = new Main();
		myObj.myPublicMethod();
		
	}

}
