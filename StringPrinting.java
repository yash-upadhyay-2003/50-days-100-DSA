import java.util.Scanner;
public class StringPrinting {
    public static void printt (String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first name");
        String firstName = sc.nextLine();
        System.out.println("enter last name");
        String lastName = sc.nextLine();
        String fullName = firstName + " " + lastName;
        printt(fullName);
        sc.close();
    }
    }
