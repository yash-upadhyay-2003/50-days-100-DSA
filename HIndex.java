import java.util.*;

public class HIndex {
    public static int hIndex(int[] citations) {
        int n = citations.length;
        int[] bucket = new int[n+1];
        for(int c : citations){
            if(c >= n){
                bucket[n]++;
            } else {
                bucket[c]++;
            }
        }
        int total = 0;
        for(int i = n; i >= 0; i--){
            total += bucket[i];
            if(total >= i){
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] parts = sc.nextLine().split(" ");
        int n = parts.length;
        int[] citations = new int[n];
        for(int i = 0; i < n; i++){
            citations[i] = Integer.parseInt(parts[i]);
        }
        System.out.println(hIndex(citations));
        sc.close();
    }
}
