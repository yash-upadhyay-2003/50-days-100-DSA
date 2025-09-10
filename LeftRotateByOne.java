public class LeftRotateByOne {
    public static void Rotate(int[] arr){
        if(arr.length ==0) return;
        int first = arr[0];
        for(int i=0;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=first;
    }
    public static void main(String[] args){
        int[] arr= {1,2,3,4,5};
        System.out.print("Original array-> ");
        printArray(arr);
        Rotate(arr);
        System.out.println();
        System.out.print("Rotated one time to left -> ");
        printArray(arr);
    }
    public static void printArray(int[] arr){
        for (int i =0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
