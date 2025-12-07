package exam03;

public class B extends A {
	double a(double r) {
		System.out.println("B 객체의 a() 메소드 실행");
		return Math.PI * r * r;
	}
}
