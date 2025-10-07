public class SercondLargestInArray {
    public static void main(String [] args){
        int arr[]={1,2,3,4,5,66,78};
        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                secondLargest = largest;
                largest=arr[i];
            }
            else if(arr[i] > secondLargest && arr[i] != largest){
                secondLargest=arr[i];
            }
        }//result
        System.out.println("Second Largest -> " + secondLargest);
    }
}
