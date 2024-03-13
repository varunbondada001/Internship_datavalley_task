import java.io.*;
public class swap_nums {
    public static void main(String[] args) {
        int a = 250;
        int b = 350;
  
        System.out.println("Before swapping the numbers:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        //For swapping
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        //Swapped values
        System.out.println("\nAfter swapping the numbers:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
