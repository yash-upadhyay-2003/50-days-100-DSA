public class checksortedbothascAnddes{
    public static String checkk(int[] arr){
        if(arr.length<=1) return "Considered Sorted";
        boolean ascending = true;
        boolean descending = true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1]){
                descending = false;
            }
            if(arr[i]>arr[i+1]){
                ascending =false;
            }
        }
        if (ascending) return "Ascending";
        else if (descending) return "Descending";
        else return "not sorted";
    }
        public static void main(String[] args){
            int[] arr1={1,2,3,4,5,6};
            int[] arr2={6,5,4,3,2,1};
            int[] arr3={14,1,3,5,2};
            System.out.println(checkk(arr1));
            System.out.println(checkk(arr2));
            System.out.println(checkk(arr3));
        }
    }
