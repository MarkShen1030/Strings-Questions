import java.util.Scanner;

class P4 {

    public static void main(String [] args) {   

        Scanner sc = new Scanner (System.in);
        
        String input = sc.nextLine();
        
        
        stringToPigLatin(input);
    }  

    public static String stringToPigLatin(String str){
        String [] arr = str.split(" ");
        
        String out = "";
        
        for (int i = 0; i < arr.length; i++)
            out += toPigLatin(arr[i])+ " ";
        System.out.println(out);
        return out;
   
    }

    public static String toPigLatin (String str) {
        if (str.length() <= 2) {
            return str;
        }

        String pig = str.substring(1)+str.charAt(0)+"ay";

        return pig;  
    }

}