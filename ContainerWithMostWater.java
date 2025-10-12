import java.util.Scanner;
public class ContainerWithMostWater{
    public static int Area(int[] height){
        int left=0;
        int right = height.length-1;
        int maxArea=0;
        while(left<right){
            int width = right-left;
            int currentHeight = Math.min(height[left],height[right]);
            int area = width*currentHeight;
            maxArea = Math.max(maxArea,area);
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxArea;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array: ");
        int n = sc.nextInt();
        int[] height = new int[n];
        System.out.println("enter elements of array: ");
        for(int i =0;i<n;i++){
            height[i]= sc.nextInt();
        }
        System.out.print("The max amount of water a container can store(in terms of area): " + Area(height));
        sc.close();
    }
}