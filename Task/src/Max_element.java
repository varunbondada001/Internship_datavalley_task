class Max_element {
    public static void main(String[] args) {
       int arr[] = new int[]{2,14,32,7,8,14,5,3,32};
       int max_element = arr[0];
       for(int i=0;i<arr.length;i++){
           if(arr[i]>max_element){
               max_element = arr[i];
           }
       }
       System.out.print("Maximum element in the array is"+" "+max_element);
    }
}