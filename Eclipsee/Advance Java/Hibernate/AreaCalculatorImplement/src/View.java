import java.util.Scanner;



public class View {
	static Scanner myScanner=new Scanner(System.in);
	public static void main(String[] args) {
		boolean flag=true;
		do {
			System.out.println("1.Area of Circle\n2.Area of Rectangle\n3.Area of Traingle\n4.Exit");
			int userChoice=myScanner.nextInt();
			myScanner.nextLine();
			switch (userChoice) {
			case 1:
				System.out.println("Enter Radius of Circle:");
				int radius=myScanner.nextInt();
				myScanner.nextLine();
				double pi=3.14;
				AreaCircle areaCircle = new AreaCircle();
				double areaofCircle = areaCircle.area(pi,radius);
				System.out.println("Area of Circle :"+areaofCircle);
				break;
			case 2:
				System.out.println("Enter Length of Rectangle:");
				int length_rectangle=myScanner.nextInt();
				myScanner.nextLine();
				System.out.println("Enter Breadth of Rectangle:");
				int breadth_rectangle=myScanner.nextInt();
				myScanner.nextLine();
				AreaRectangle areaRectangle = new AreaRectangle();
//				Shape rectShape=new AreaRectangle();
				double areaofRectangle = areaRectangle.area(length_rectangle, breadth_rectangle);
				System.out.println("Area of Rectangle :"+areaofRectangle);
				break;
			case 3:
				System.out.println("Enter base of Triangle:");
				double base_of_rectangle=myScanner.nextDouble();
				myScanner.nextLine();
				System.out.println("Enter heigth of Triangle:");
				double height_of_rectangle=myScanner.nextDouble();
				myScanner.nextLine();
				AreaTriangle areaTriangle = new AreaTriangle();
				double areaofTriangle = areaTriangle.area(base_of_rectangle, height_of_rectangle);
				System.out.println(areaofTriangle);
				break;
			case 4:
				flag=false;
				System.out.println("Exited");
				break;
			default:
				break;
			}
			
		} while (flag);

	}

}
