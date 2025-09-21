import java.util.Scanner;
public class BinarySearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array in sorted manner to get correct results: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number you need to find: ");
        int key =sc.nextInt();
        int result = Searchh(arr,key);
        if(result==-1){
            System.out.println("Element not found.");
        }
        else{
            System.out.println("your element (i.e:" + key + ") is at index: " + result);
        }
        sc.close();
    }
public static int Searchh(int[] arr,int key){
    int low=0;
    int high = arr.length-1;
    while(low<=high){
        int mid = low + (high-low)/2;
        if(arr[mid]==key){
            return mid;
        }
        else if(arr[mid]<key){
            low=mid+1;
        }
        else{
            high=mid-1;
        }
    }

return -1;

}
}
