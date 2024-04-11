class Demo {

	static int a;
	static int b;

	int m;
	int n;

	static {
		a = 10;
		b = 20;
		System.out.println("Control in static ");
		System.out.println();
	}

	{
		m = 100;
		n = 200;
		System.out.println("Control in non static");
		System.out.println();
	}

	static void disp1() {
		System.out.println("Value of-static var "+a);
		System.out.println("Value of·static var "+b);
		System.out.println();
	}

	void disp2() {
		System.out.println("Valueof inst var " + m);
		System.out.println("Value of inst var " + n);
		System.out.println();
	}

}

public class Main {
	public static void main(String[] args) {
		Demo.disp1();
		// Demo.disp2();disp2 is non static
		Demo d = new Demo();
		d.disp1();
		d.disp2();
	}
}

/* Priority
1) static var : when class is created
2) static block: when class created
3) static method: when when itnis called using class name directly

4) instance var: when obj is created 
5) instance block : ""      ""
6) instance method: when it is called using obj

*/