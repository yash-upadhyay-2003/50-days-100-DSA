public class FirstNonRepeatingChar{
    public static char findd(String str){
        int[] freq = new int[256];
        for(int i =0;i<str.length();i++){
            freq[str.charAt(i)]++;
        }
        for(int i=0;i<str.length();i++){
            if(freq[str.charAt(i)]==1){
                return str.charAt(i);
            }
        }
        return '\0';
    }
    public static void main(String[] args){
        String str = "aaabbccccdeeefff";
        char result = findd(str);
        if(result != '\0'){
            System.out.println("First Non-Repeating character is: " + result);
        }
        else{
            System.out.println("Boss,Every character is repeating");
        }
    }
}