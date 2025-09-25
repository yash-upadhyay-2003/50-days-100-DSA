public class RemoveDuplicatesString{
public static String Removee(String str){
    boolean[] seen = new boolean[256];
    StringBuilder sb = new StringBuilder();
    for(int i =0;i<str.length();i++){
        char ch = str.charAt(i);
        if(!seen[ch]){
            seen[ch] = true;
            sb.append(ch);
        }
    }
return sb.toString();
}
public static void main(String[] args){
    String str = "aaabbbcccdhhs";
    System.out.println("original: " + str);
       System.out.println("Reversed: " + Removee(str));
}
}