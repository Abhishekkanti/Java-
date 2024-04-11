import java.util.*;

class Task1 extends Thread {

	public void run() {
		try {
			for (int i = 0; i <= 3; i++) {
				System.out.println("T1 Running");
				Thread.sleep(2000);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}

class Task2 extends Thread {

	public void run() {
		System.out.println("T2 Started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		sc.nextInt();
	}

}

public class Main {
	public static void main(String[] args) {
		System.out.println("Main Thread.");
		Task1 a1 = new  Task1();
		Task2 a2 = new Task2();

Thread t1 = new Thread(a1);
Thread t2 = new Thread(a2);
		t1.start();
		t2.start();
	}
}
	
/* By Implements Runnable Interface: In this method you need to create a class which implements Runnable Interface and write your code in run() method (here you define run method because it is from a interface)
and to execute create an obj of that class and also create obj of Thread class and pass the reference of that obj to thread class obj as constructor and run start() method.

*/