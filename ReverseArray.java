import java.util.Arrays;
public class ReverseArray {
    public static void Rev(int[] arr){
        int start=0;
        int end=arr.length-1;
        
        while(start<end){
            int temp = arr[end];
            arr[end]= arr[start];
            arr[start]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args){
        int []arr1={1,2,3,4,5,6,8};
        Rev(arr1);
        System.out.println("Reversed Array -> " + Arrays.toString(arr1));
    }

}
