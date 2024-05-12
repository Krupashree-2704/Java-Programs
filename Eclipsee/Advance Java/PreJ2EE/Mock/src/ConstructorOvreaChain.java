class Student
{
	int id;
	String name;
	public Student() {
		System.out.println("Printing students Details");
	}
	public Student(int id) {
		this();
		this.id = id;
	}
	public Student(int id, String name) {
		this(id);
		this.name = name;
	}
	
}
public class ConstructorOvreaChain {

	public static void main(String[] args) {
		Student s1=new Student(1);
		System.out.println("ID:"+s1.id);
		Student s2=new Student(2,"Jack");
		System.out.println("ID:"+s2.id);
		System.out.println("Name:"+s2.name);

	}

}
