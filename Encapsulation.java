class Student {

	private int age;
	private String name;
    
    void setData(int age,String name){
        this.age = age;
		this.name = name;
    }
	void show() {
		System.out.println(name + " " + age);
	}

}

public class Main {
	public static void main(String[] args) {
		Student obj = new Student();
		//obj.age = 20;
		//obj.name = "Varun";
		obj.setData(20,"Varun");
		obj.show();
	}
}