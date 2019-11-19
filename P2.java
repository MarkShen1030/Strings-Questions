import java.util.Scanner;

class P2 {

    public static void main (String [] args) {    
        
    Scanner sc = new Scanner(System.in);    
        
    String input = sc.nextLine();    
        
    
    isPalindrome(input);
    
    }   

    public static boolean isPalindrome(String str) {
        str = clean(str);
        if (str.length() <= 1) {
            System.out.println("true");
            return true;
        }

        for (int i = 0; i < str.length()/2; i++) {

            if (str.charAt(i) != str.charAt(str.length()-i-1)) {
                System.out.println("false");
                return false;
            }

        }
        System.out.println("true");
        return true; 
    }

    public static String clean(String str){
        String out = "";
        str = str.toLowerCase();
        for(int i=0; i<str.length(); i++) {
            if('a' <= str.charAt(i) && str.charAt(i) <= 'z') {
                out += str.charAt(i);
            }   
        }
        return out;
    }
}