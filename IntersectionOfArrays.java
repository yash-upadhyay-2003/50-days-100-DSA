import java.util.*;
public class IntersectionOfArrays{
    public static int[] intersection(int[] num1,int[] num2){
        HashMap<Integer,Boolean> map= new HashMap<>();
        for(int num : num1){
            map.put(num,true);
        }
        HashSet<Integer> resultSet = new HashSet<>();
        for(int num :num2){
            if(map.containsKey(num)){
                resultSet.add(num);
            }
        }
        int[] result = new int[resultSet.size()];
        int i=0;
        for(int num: resultSet){
            result[i++]=num;
        }
        return result;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first array size: ");
        int n1 = sc.nextInt();
        System.out.println("Enter first array : ");
        int[] num1 = new int[n1];
        for(int i =0;i<n1;i++){
        num1[i]= sc.nextInt();
        }
        System.out.println("Enter second array size: ");
        int n2 = sc.nextInt();
        System.out.println("Enter second array : ");
        int[] num2 = new int[n2];
        for(int i =0;i<n2;i++){
        num2[i]= sc.nextInt();
        }
      
        System.out.println("Intersection: ");
        int[] result =  intersection(num1,num2);
        for(int n : result){
            System.out.print(n + " ");
        }
        sc.close();
    }
    
}