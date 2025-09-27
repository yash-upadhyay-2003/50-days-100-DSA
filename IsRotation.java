public class IsRotation{
    public static boolean check(String s1,String s2){
        if(s1==null||s2==null) return false;
        if(s1.length()!=s2.length()) return false;
        if(s1.isEmpty()&& s2.isEmpty()) return true;
        String doubled = s1+s1;
        return doubled.contains(s2);

    }
    public static void main(String[] args){
        String[][] problems ={
            {"abcde","deabc"},{"Yash","shYa"},{"system","stemsy"},{"timer","rimet"}
        };
        for(String[] n:problems){
            String s1=n[0],s2=n[1];
            System.out.printf("checking %s,%s=%b%n",String.valueOf(s1),String.valueOf(s2),check(s1,s2));
        }
        
        
    }
}