public class MajorityElement{
    public static int majority(int[] nums){
        int candidate=0,count=0;
        for(int num: nums){
            if(count == 0){
                candidate = num;
            }
            if(num == candidate){
                count++;
            } else {
                count--;
            }
        }
        count = 0;
        for(int num: nums){
            if(num == candidate){
                count++;
            }
        }
        if(count > nums.length / 2){
            return candidate;
        }
        return -1;
    }

    public static void main(String[] args){
        int[] nums = {1,1,1,2,3,3,3,3,1,1,5,6,7,1,1,1,1,1};
        System.out.println("Majority element is: " + majority(nums));
    }
}