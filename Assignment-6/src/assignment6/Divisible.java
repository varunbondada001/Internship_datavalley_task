package assignment6;

import java.util.Scanner;

public class Divisible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int number = sc.nextInt();
		sc.nextLine();
		
		int s1 = number%7;
		int s2 = number%13;
		
		if((s1==0) && (s2==0)){
			System.out.println("The quotients when divided by 7 and 13 are :"+number/7+" "+number/13);
			System.out.println("The remainder when divided by 7 and 13 are :"+number%7+" "+number%13);
			System.out.println("The number is divisible by  both the numbers");
		}else if(s1==0){
			System.out.println("The number is divisible by 7");
		}else if(s2==0) {
			System.out.println("The number is divisible by 13");
		}else {
			System.out.println("Not divisble");
		}
	}

}
