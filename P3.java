import java.util.Scanner;

class P3 {

    public static void main (String [] args) {    

        
     Scanner sc = new Scanner (System.in);
     
     int input = sc.nextInt();
     
     
     
     toBinary(input);
    }

    public static String toBinary(int n) {

      
        
        String out = ""; 

        while (n > 0) {
            int ans = n/2;
            int remainder = n % 2;

            n = ans;

            out = remainder+out;
            System.out.println(out);
            
            

        }
        return out;
        /*
        String number = "";
        for (int i = 0; i < out.length(); i++) {

            number += (out.charAt(out.length()-i-1)); 

        }
        return number;
        */
    }
}