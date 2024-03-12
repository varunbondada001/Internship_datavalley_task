
public class Program1 {
	public void sorting_array(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
	
	public int count_occurence(int arr[],int numberToFind){
        int count = 0;
        for (int i=0;i<arr.length;i++) {
            if (arr[i] == numberToFind) {
                count++;
            }
        }
        return count;
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[]{2,14,32,7,8,14,5,3,32};
        Program1 p1 = new Program1();
        p1.sorting_array(arr);
        int c = p1.count_occurence(arr,32);
        System.out.println("No of occurence of 32 is"+c);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

	}

}
