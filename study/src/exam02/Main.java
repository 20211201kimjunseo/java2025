package exam02;

public class Main {

	public static void main(String[] args) {
        Test test1 = new Test();
        Test test2 = new Test();
        Object obj = test1;

        if (test1.equals(test2))
            System.out.println("Equal!!");
        else
            System.out.println("Not equal!!");
        System.out.println(test1.equals(obj));
	}

}
