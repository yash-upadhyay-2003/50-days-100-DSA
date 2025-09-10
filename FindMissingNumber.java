public class FindMissingNumber{
    public static int fiind(int[] arr,int n){
        int expectedSum = n*(n+1)/2;
        int actualSum=0;
        for(int num: arr){
            actualSum += num;
        }
        return expectedSum -actualSum;
    }
    public static void main(String[] args){
        int [] arr={1,2,3,4,6};
        int n = 6;
        int missing = fiind(arr,n);
        System.out.print("The Missing Number is: " + missing);

    }
}