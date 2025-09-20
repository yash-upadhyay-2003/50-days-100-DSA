import java.util.*;

public class UnionOfSortedArrays {
    public static List<Integer> findUnion(int[] arr1, int[] arr2) {
        int i = 0, j = 0;
        List<Integer> union = new ArrayList<>();

        while (i < arr1.length && j < arr2.length) {
            // Skip duplicates in arr1
            while (i > 0 && i < arr1.length && arr1[i] == arr1[i - 1]) i++;
            // Skip duplicates in arr2
            while (j > 0 && j < arr2.length && arr2[j] == arr2[j - 1]) j++;

            if (i >= arr1.length || j >= arr2.length) break;

            if (arr1[i] < arr2[j]) {
                union.add(arr1[i]);
                i++;
            } else if (arr1[i] > arr2[j]) {
                union.add(arr2[j]);
                j++;
            } else {
                // Both elements are same
                union.add(arr1[i]);
                i++;
                j++;
            }
        }

        // Remaining elements in arr1
        while (i < arr1.length) {
            if (i == 0 || arr1[i] != arr1[i - 1]) {
                union.add(arr1[i]);
            }
            i++;
        }

        // Remaining elements in arr2
        while (j < arr2.length) {
            if (j == 0 || arr2[j] != arr2[j - 1]) {
                union.add(arr2[j]);
            }
            j++;
        }

        return union;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 5, 6};
        int[] arr2 = {2, 3, 5, 7};

        List<Integer> result = findUnion(arr1, arr2);
        System.out.println("Union: " + result);
    }
}