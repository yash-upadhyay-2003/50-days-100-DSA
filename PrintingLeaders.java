public class PrintingLeaders{
    public static void leaders(int[] arr){
        int n = arr.length;
        int rightmost = arr[n-1];
        System.out.print(rightmost+" ");
        for(int i =n-2;i>=0;i--){
            if(arr[i]>rightmost){
                rightmost=arr[i];
                System.out.print(rightmost+" ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[] arr={16,17,3,4,6,5,2,1};
        System.out.print("Leaders are: ");
        leaders(arr);
    }
}