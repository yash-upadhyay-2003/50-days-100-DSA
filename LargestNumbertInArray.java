public class LargestNumbertInArray{
    public static int Largest(int[] arr){
int max = arr[0];
for(int i=0;i<arr.length;i++){
    if(arr[i]>max){
        max=arr[i];
    }
}
return max;
    }
    public static void main(String[] args){
        int arr[] ={1,2,33,43,56};
        System.out.println("Largest -> " + Largest(arr));
    }
}