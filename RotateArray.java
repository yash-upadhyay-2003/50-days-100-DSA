// import java.util.*;
public class RotateArray{
    private static void rotate(int[] num,int k){
        int n = num.length;
        k = k%n;
        if(k==0) return;
        reverse(num,0,n-1);
        reverse(num,0,k-1);
        reverse(num,k,n-1);
    }
    public static void reverse(int[] num,int start,int end){
        while(start<end){
            int temp = num[end];
            num[end]=num[start];
            num[start]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args){
        int[] arr= {1,2,3,4,5};
        int k=7;
        rotate(arr,k);
        System.out.print("Rotated Array: ");
        for(int a:arr){
            System.out.print(a + " ");
        }
    }
}