
public class HandleNullPointerException {

	public static void main(String[] args) {
		String str=null;
		try
		{
			if (str.equalsIgnoreCase("ABC")) {
				System.out.println("Match");
			} else {
				System.out.println("Not Match");
			}
		}
		
		catch (Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("In Finally Block");
		}

	}

}
