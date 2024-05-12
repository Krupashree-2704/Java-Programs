
public class CompareDatofanObject {

	int a,b;
	public static void main(String[] args) {
		CompareDatofanObject ref1=new CompareDatofanObject(10,20);
		CompareDatofanObject ref2=new CompareDatofanObject(10,20);
		System.out.println(ref1.equals(ref2));
	}
	public boolean equals(Object obj)
	{
		CompareDatofanObject ref=(CompareDatofanObject)obj;
		ref.a=10;
		ref.b=20;
		return this.a==ref.a&&this.b==ref.b;
	}
	CompareDatofanObject(int a,int b)
	{
		this.a=a;
		this.b=b;
	}

}
