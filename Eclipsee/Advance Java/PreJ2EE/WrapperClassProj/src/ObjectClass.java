
public class ObjectClass {
	int id;
	String name;
	public ObjectClass(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public String toString() {
		System.out.println("ID:"+this.id);
		System.out.println("Name:"+this.name);
		return "";
	}
	public static void main(String[] args) {
		ObjectClass objectClass1 = new ObjectClass(1, "AARYA");
		ObjectClass objectClass2 = new ObjectClass(2, "SONU");
		System.out.println(objectClass1);
		System.out.println(objectClass2);

	}

}
