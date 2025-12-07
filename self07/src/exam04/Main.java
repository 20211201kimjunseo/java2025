package exam04;

public class Main {

	public static void main(String[] args) {
		
		SuperAir A = new SuperAir();
		
		A.takeOff();
		A.fly();
		A.flyMode = A.SUPERSONIC;
		A.fly();
		A.flyMode = A.NORMAL;
		A.fly();
		A.land();
	}

}
