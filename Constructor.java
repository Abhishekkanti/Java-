class Student {

	private int age;
	private String name;
	
	public Student(){
	   age = 18;
	   name = "Rahul";
	   System.out.println("Default Constructor :"+name+" "+age);
	}
    
    public Student(int age){
        name = "Manan";
        this.age = age;
        System.out.println("Constructor with Single para :"+name+" "+age);
    }
    
    public Student(String name,int age){
        this.age = age;
		this.name = name;
	//	System.out.println("Constructor with Single para :"+name+" "+age);
    }
    
	void show() {
		System.out.println(name + " " + age);
	}

}

public class Main {
	public static void main(String[] args) {
		
		//Default Cont is Called..
		Student obj = new Student();
		//obj.show();
		System.out.println();
		
		//Single para Cont is Called..
		Student obj1 = new Student(19);
		//obj1.show();
		System.out.println();
		
		//Double para Cont is Called..
		Student obj2 = new Student("Varun",19);
		//obj2.show();
	}
}