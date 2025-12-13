package exam03;
public class Main {

	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("띱");
                    try { Thread.sleep(500); } catch (Exception e) {}
                }
            }
        });

        thread.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("띵");
            try { Thread.sleep(500); } catch (Exception e) {}
        }
	}
}
