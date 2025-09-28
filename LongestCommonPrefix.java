public class LongestCommonPrefix{
    public static String lcp(String[] strs){
        if(strs==null||strs.length==0) return "";
        String prefix = strs[0];
        for(int i =0 ;i<strs.length;i++){
            while (strs[i].indexOf(prefix)!=0){
                prefix=prefix.substring(0,prefix.length()-1);
                if(prefix.isEmpty()) return "";
            }
        }
    return prefix;

        }
        public static void main(String[] args){
            String[] str1 = {"yard","yaar","yash"};
            String[] str2 = {"sam","sad","saturday"};
            String[] str3 = {"you","yoyo","Tokyo"};
            System.out.println("LCP of str1: "+lcp(str1));
            System.out.println("LCP of str2: "+lcp(str2));
            System.out.println("LCP of str3: "+lcp(str3));

    }
}