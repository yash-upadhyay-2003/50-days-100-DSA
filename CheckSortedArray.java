class CheskSortedArray {
    public static boolean IsSorted(int [] arr){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] > arr[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        int[] arr1={1,2,3,4,5,6};
        System.out.println(IsSorted(arr1));
        int [] arr2 ={1,2,2,1,1,3,4,5};
        System.out.println(IsSorted(arr2));
    }
}
