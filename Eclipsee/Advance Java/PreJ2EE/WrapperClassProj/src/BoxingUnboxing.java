
public class BoxingUnboxing {

	public static void main(String[] args) {
		int a=10;
		Integer c=20;
		//Boxing	(explicit way):Integer.valueOF(var_of_primitive_datatype);	
		Integer b= Integer.valueOf(a);
		//Boxing 	(implicity way:just assign the value  of primitive datatype to non-primitive datatype)			
		Integer e=a;
		System.out.println("E:"+e);
		System.out.println("After conversion of Primitive Datatype into Non-Primitive Datatype:"+b);
		//Unboxing	(explicit way):var_of_non_pritive_datatype.no_primitivedatatypeValue();			
		int d = c.intValue();
		//UnBoxing 	(implicit way:just assign the value of non-primitive datatype to primitive datatype)		
		int f=c;
		System.out.println("After conversion of Non- Primitive Datatype into Primitive Datatype:"+d);
		System.out.println("F:"+f);
	}

}
