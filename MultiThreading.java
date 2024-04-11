import java.util.*;

class Mythread1 extends Thread {

	public void run() {
		System.out.println("T1 Started.");
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

class Mythread2 extends Thread {

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
		Mythread1 t1 = new  Mythread1();
		Mythread2 t2 = new Mythread2();

		t1.start();
		t2.start();
	}
/* You can create Threads my 2 methods:
1) Extending Thread Class: In this method you need to extend Thread class with a class and write your code in run() method which is overrided from thread class. and after to start the executing thread you need to create obj of that class and run start() method.
 
2) Implements Runnable Interface: In this method you need to create a class which implements Runnable Interface and write your code in run() method (here you define run method because it is from a interface)
and to execute create an obj of that class and also create obj of Thread class and pass the reference of that obj to thread class obj as constructor and run start() method.

All threads are managed by thread scheduler which is present in jvm. 
as Threads class are created in background threads are created and after calling start method they are registered to thread Scheduler and Executed alternatively according priority or if thread is ideal.
*/
}