import java.util.Scanner;

public class ArrayUnion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input first array
        System.out.print("Enter size of first array: ");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        System.out.println("Enter elements of first array:");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        // Input second array
        System.out.print("Enter size of second array: ");
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        System.out.println("Enter elements of second array:");
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }
        sc.close();

        // Find union
        int[] union = new int[n + m];
        int k = 0;

        // Add all elements of first array
        for (int i = 0; i < n; i++) {
            union[k++] = arr1[i];
        }

        // Add elements of second array if not already in union
        for (int i = 0; i < m; i++) {
            boolean found = false;
            for (int j = 0; j < k; j++) {
                if (arr2[i] == union[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                union[k++] = arr2[i];
            }
        }

        // Print union
        System.out.println("Union of two arrays:");
        for (int i = 0; i < k; i++) {
            System.out.print(union[i] + " ");
        }
        
    }
}
