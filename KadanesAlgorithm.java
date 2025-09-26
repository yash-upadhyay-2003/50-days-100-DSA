public class KadanesAlgorithm{
    public static int maxx(int[] arr){          
        int maxsofar = arr[0];
        int currmax = arr[0];
        for(int i =1;i<arr.length;i++){
        currmax = Math.max(arr[i], currmax+arr[i]);
        maxsofar = Math.max(currmax,maxsofar);
        }
        return maxsofar;
    }
    public static void main(String[] args){
        int[] arr ={1,2,-3,4,-2,-5,2,1};
        int [] arr2 = {-2,-3,-4,-5,-2};
    System.out.println("Maximum subarray sum is: " + maxx(arr));
    System.out.println("Maximum subarray sum is: " + maxx(arr2));
    }
}