package assignment6;
import java.util.*;

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner myobj = new Scanner(System.in);
		
		System.out.println("Enter the joined year");
		int jy = myobj.nextInt();
		myobj.nextLine();
		
		System.out.println("Enter the present year");
		int py = myobj.nextInt();
		
		if(py-jy>5) {
			System.out.println("An bonus of Rs5000/ is given");
		}
		else if(py-jy>=3 && py-jy<=5) {
			System.out.println("An bonus of Rs3000/ is given");
		}
		else {
			System.out.println("No bonus is given");
		}
	}

}
