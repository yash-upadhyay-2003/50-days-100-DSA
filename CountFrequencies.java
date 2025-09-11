public class CountFrequencies{
    public static void Countt(int[] arr){
        int max = arr[0];
        for(int num : arr){
            if(num > max){
                max = num;
            }
        }
        int freq[] = new int[max+1];
        for(int num : arr){
            freq[num]++;

        }
        System.out.println("Num : Frequency");
        for(int i=0;i<freq.length;i++){
            if(freq[i] >0){
        System.out.println(i + "   :    " + freq[i]);
            }
        }
    }
        public static void main(String [] args){
            int[] arr={1,2,3,3,2,4,5,3,3,1};
            System.out.print("Original Array: ");
            printArray(arr);
            System.out.println("Frequency :");
            Countt(arr);
    }
    public static void printArray(int[] arr){
for(int num : arr){
    System.out.print(num + " ");
}
System.out.println();
    }
    

    }
