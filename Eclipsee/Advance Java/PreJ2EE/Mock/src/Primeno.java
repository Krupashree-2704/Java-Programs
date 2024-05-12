
public class Primeno {

	 public static void main(String[] args) {
	        
	        for (int i = 1; i <=10; i++) {
	           
	            if (primeCount(i)) {
	                System.out.println(i);
	                
	            }
	            
	        }
	        
	    }
	    public static boolean primeCount(int a)
	    {
	        if ((a==0)||(a==1)) {
	            return false;

	        }
	        for(int i=2;i<a;i++)
	        {
	            if (a%i==0) {
	                return false;
	            }
	        }
	        return true;
	    }
}
