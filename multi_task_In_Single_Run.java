import java.util.*;

class Task extends Thread {

	public void run() {
		String tName = Thread.currentThread().getName();
		if (tName.equals("p1")) {
			p1();
		} else {
			p2();
		}

	}

	public void p1() {
		try {
			for (int i = 0; i <= 4; i++) {
				System.out.println("P1 executing");
				Thread.sleep(2000);
			}
		}catch(Exception e){
		    System.out.println(e.getMessage());
		}
	}

	public void p2() {
		System.out.println("P2 executing");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		sc.nextInt();
	}

}

public class Main {
	public static void main(String[] args) {

		Task t1 = new Task();
		Task t2 = new Task();

		t1.setName("p1");
		t2.setName("p2");

		t1.start();
		t2.start();
	}
}