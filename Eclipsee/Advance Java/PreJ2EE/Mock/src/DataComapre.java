class CompareData
{
	int a=20;
	int b=30;
	public CompareData(int a, int b) {
		this.a=a;
		this.b=b;
	}
	public boolean equals(Object obj)
	{
		CompareData ref=(CompareData)obj;
		
		return this.a==ref.a &&this.b==ref.b;
	}
}
public class DataComapre {

	public static void main(String[] args) {
		CompareData a=new CompareData(20,30);
		System.out.println();

	}
	

}
