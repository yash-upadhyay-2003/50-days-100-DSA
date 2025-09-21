import java.util.Scanner;
//linear search is used to find the element in any array!
public class LinearSearch{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the desired element: " );
        int key = sc.nextInt();
        boolean found= false;
        int position = -1;
        for(int i=0;i<n;i++){
        if(arr[i] == key){
            found=true;
            position = i+1;
            break;
        }
    }
        if(found){
            System.out.println("your element " + key + " is at position " + position);
        }
        else{
            System.out.println("Element " + key + "not found");
        }

    
    sc.close();
    }
}