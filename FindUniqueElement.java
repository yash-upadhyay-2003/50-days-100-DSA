public class FindUniqueElement{
    public static int findd(int[] arr){
        int result =0;
        for(int num : arr){
            result ^= num;
        }
         return result;
    }
    public static void main(String[] args){
        int[] arr={1,2,3,2,1,4,5,4,5};
        int unique = findd(arr);
        System.out.println("Unique element is: " + unique);
    }
}
