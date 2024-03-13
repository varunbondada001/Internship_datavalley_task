import java.util.Arrays;
class Sum {
    public static void main(String[] args)
    {
        int []values={3,5,739,41,55,66};
        Arrays.sort(values);
        int length=values.length;
        int sum=values[length-2]+values[length-3];
        System.out.println(sum);

    }
}
