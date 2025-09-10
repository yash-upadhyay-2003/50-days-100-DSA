//import java.util.Arrays;
public class removeDuplicates{
    public static int Remove(int[] arr){
        if(arr.length == 0) return 0;
        int i=0;
        for(int j =1;j<arr.length;j++){
            if(arr[i] != arr[j]){
                i++;
                arr[i]=arr[j];
            }
        }
        return i+1;


    }
    public static void main(String[] args){
        int[] arr={1,1,2,3,4,4};
        int NewLength = Remove(arr);
        System.out.println("the new length of the array is: "+ NewLength);
        System.out.print("The New Array is here -> ");
        for(int i=0;i<NewLength;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}