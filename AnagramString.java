import java.util.Scanner;
public class AnagramString {
    public static boolean check(String str1,String str2){
        if(str1.length()!=str2.length()){
            return false;
        }
int[] count = new int[256];
        for(int i=0;i<str1.length();i++){
            count[str1.charAt(i)]++;
            count[str2.charAt(i)]--;
        }
        for(int c:count){
            if(c!=0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
 System.out.println("Enter string 1: ");
 String str1=sc.nextLine();
        System.out.println("Enter string 2: ");
        String str2= sc.nextLine();
    if(check(str1,str2)){
        System.out.println("Strings are Anagrams");
    }
    else{
        System.out.println("Strings are not Anagrams");
    }
    }
}
