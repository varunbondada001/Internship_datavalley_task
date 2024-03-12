package CompileTimePolymorphism;
public class MathOperations {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b, double c) {
        return a + b + c;
    }

    public String add(String str1, String str2) {
        return str1 + str2;
    }

    public static void main(String[] args) {
		// TODO Auto-generated method stub

        MathOperations math = new MathOperations();

        int sum1 = math.add(5, 3);
        System.out.println("Sum of integers: " + sum1);

        double sum2 = math.add(2.5, 3.7, 1.8);
        System.out.println("Sum of doubles: " + sum2);

        String concat = math.add("Hello,this ", "a sample example!");
        System.out.println("Concatenated strings: " + concat);
    }
}
