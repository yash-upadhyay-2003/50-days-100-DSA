public class SumAndAverage{
    public static void main(String[] args){
        int[] arr={2,2,2,4,6,8};
        //int average = 0;
        int sum =0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            
        }
        System.out.println("Sum ->" + sum);
        System.out.println("Average-> " + sum/arr.length);
    }
}