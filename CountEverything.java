public class CountEverything{
    public static void countall(String str){
        int vowel=0,consonent=0,space=0,digit=0;
        str= str.toLowerCase();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch>='a' && ch<='z'){
                if(ch=='a' || ch == 'e' || ch=='i' || ch == 'o' || ch == 'u'){
                    vowel++;
                }
                else{
                    consonent++;
                }
            }
            else if(ch>='0' && ch<='9'){
                digit++;
            }
            else if(ch==' '){
                space++;
            }
        }
            System.out.println("Number of vowels: " + vowel);
                        System.out.println("Number of consonents: " + consonent);
                                    System.out.println("Number of digits: " + digit);
                                                System.out.println("Number of spaces: " + space);
        }
        public static void main(String[] args){
            String str = "Hi I am Yash Upadhyay 1234";
            countall(str);

        }
}