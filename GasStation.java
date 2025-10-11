public class GasStation {
    public static int Check(int[] gas,int[] cost){
        int start =0;
        int totalGas =0;
        int totalCost =0;
        int tank =0;
        for(int i=0;i<gas.length;i++){
            totalGas += gas[i];
            totalCost += cost[i];
            tank += gas[i]-cost[i];
            if(tank<0){
                start =i+1;
                tank =0;
            }
        }
        return totalGas>totalCost ? -1:start;
    }
    public static void main(String[] args){
        int[] gas={1,2,3,4,5};
        int[] cost ={3,4,5,1,2};
        int idx = Check(gas,cost);
        System.out.println("the starting point is: " + idx);
    }
}
