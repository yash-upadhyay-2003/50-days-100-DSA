public class MoveZeroesToEnd {
    public static void Move(int [] arr){
        int nonZeroIndex =0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[nonZeroIndex] = arr[i];
                nonZeroIndex++;
            }
        }
        while(nonZeroIndex<arr.length){
            arr[nonZeroIndex] =0;
            nonZeroIndex++;
        }
    }
    public static void main(String[] args){
        int[] arr={1,2,3,0,0,6,0,7};
        System.out.print("Original Array -> ");
        printArray(arr);
        Move(arr);
        System.out.print("Array after moving -> ");
        printArray(arr);
    } 
    public static void printArray(int[] arr){
        for(int num:arr){
            System.out.print(num + " ");
        }
        System.out.println();
    }
}