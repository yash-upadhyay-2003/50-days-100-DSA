public class TwoSumII{
    public static int[] Sum(int[] nums,int target){
        int start=0;
        int end = nums.length-1;
        int sum=0;
        while(start<end){
            sum = nums[start] + nums[end];
            if(sum==target){
                return new int[]{start+1,end+1};
            }
            else if(sum<target){
                start++;
            }
            else{
                end--;
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args){
        int[] nums={1,2,3,4,5,6,9};
        int target=12;
        int[] result =Sum(nums,target);
        if(result[0]==-1){
            System.out.print("there are no such elements whose sum is " + target );
        }
        else{
            System.out.print("The elements whose sum is " + target + " are: ");
            System.out.print(result[0] +", "+result[1]);
        }
    }
}