import java.util.*;

class Student{
    private String name;
    private int age;
    
    public Student(String name,int age){
        this.name = name;
        this.age = age;
        }
    }

class Employee{
    private String name;
    private int id;
    
    public Employee(String name, int id){
        this.name = name;
        this.id = id;
        }
    }
    
public class Main {
	public static void main(String[] args) {
		
		Student s1 = new Student("Govind",20);
		Student s2 = new Student("Yash",21);
		
		Employee e = new Employee("Bob",27);
		
		//<Student> this ensure that only student type of data is allowed(type safety).
		ArrayList<Student> al = new ArrayList<Student>();
		
		al.add(s1);
		al.add(s2);
		//al.add(e);
	
		System.out.println(al);
		
		
	}
}