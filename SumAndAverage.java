public class SumAndAverage{
    public static void main(String[] args){
        int[] arr={2,2,2,4,6,9,8};
        int sum =0;
        double average =0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            
        }
        System.out.println("Sum ->" + sum);
        average =(double) sum/arr.length;
        System.out.println("Average-> " + average);
    }
}