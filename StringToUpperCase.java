public class StringToUpperCase{
public static String toUpperCase(String str){
    StringBuilder sb = new StringBuilder("");
    char ch = Character.toUpperCase(str.charAt(0));
    sb.append(ch);
    for(int i=1;i<str.length();i++){
        char m=str.charAt(i);
        if(m ==' ' && i<str.length()-1){
            sb.append(str.charAt(i));
             i++;
            sb.append(Character.toUpperCase(str.charAt(i)));
        }
        else{
            sb.append(m);
        }
    }
    return sb.toString();
}
public static void main(String[] args){
String str = "hi i am yash upadhyay please star my repository:)";
System.out.println(toUpperCase(str));
}
}