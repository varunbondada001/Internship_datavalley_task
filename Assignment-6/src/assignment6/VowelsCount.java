package assignment6;
import java.util.*;

public class VowelsCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any name or any string");
		String sample = sc.nextLine();
		
		int c = 0;
		List<Character> vowels = new ArrayList<>();
		
		for(int i=0;i<sample.length();i++) {
			if("aeiouAEIOU".indexOf(sample.charAt(i)) != -1) {
				c+=1;
				vowels.add(sample.charAt(i));
			}
		}
		
		if(c==0) {
			System.out.println("No vowels present in the given string");
		}else {
			System.out.println("Number of vowels are : "+c);
			System.out.println(vowels);
		}

	}

}
