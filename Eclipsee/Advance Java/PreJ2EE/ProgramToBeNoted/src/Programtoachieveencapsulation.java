class Student
{
	private int id;
	String name;
	private double percentage;
	Student(int id,String name,double percentage)
	{
		this.id=id;
		this.name=name;
		this.percentage=percentage;
	}
	
	
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public double getPercentage()
	{
		return percentage;
	}
	public void setPercentage(double percentage)
	{
		this.percentage=percentage;
	}
}
public class Programtoachieveencapsulation {

	public static void main(String[] args) {
		Student s1=new Student(12,"Aarya",94.60);
		System.out.println(s1.getId());
		System.out.println(s1.name);
		System.out.println(s1.getPercentage());
		Student s2=new Student(13,"Sonu",92.20);
		System.out.println(s2.getId());
		System.out.println(s2.name);
		System.out.println(s2.getPercentage());

	}

}
