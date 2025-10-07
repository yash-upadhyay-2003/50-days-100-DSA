import java.util.Scanner;
public class RemoveDuplicatesII{
    public static int remove(int[] nums){
        if(nums==null) return 0;
        int n = nums.length;
        if(n<=2) return n;
        int write=2;
        for(int read=2;read<n;read++){
            if(nums[read] != nums[write-2]){
                nums[write]=nums[read];
                write++;
            }
        }
        return write;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in Array:");
        int m = sc.nextInt();
        System.out.println("Enter the elements of array:");
        int[] nums = new int[m];
        for(int i=0;i<m;i++){
            nums[i]=sc.nextInt();
        }
        int neww = remove(nums);
        System.out.println("the new length of array is:" + neww);
        System.out.println("the array is:");
        for(int i=0;i<neww;i++){
            System.out.print(nums[i] + " ");
        }
        sc.close();
    }
}