import java.util.Scanner;

public class MyMain {
    
    // Counts the number of 'a', 'b', and 'c' chars in str
    public static int countABC(String str) {
        String str1 = str.toLowerCase();
        int a=0;
        int b=0;
        int c=0;
        for(int i = 0; i < str.length(); i++){
        if(str1.charAt(i)=='a'){
            a++;
        }
        else if(str1.charAt(i)=='b'){
            b++;
        }
        else if(str1.charAt(i)=='c'){
            c++;
        }
        }
        return (a+b+c);
    }

    // Checks to see whether or not str contains 'The' or 'the'
    public static boolean containsThe(String str) {
        String str1 = str.toLowerCase();
        int t = str1.indexOf("the");
        if(t>=0){
            return true;
        }else{
            return false;
        }
        
    }

    // Checks whether str is a palindrome or not
    public static boolean isPalindrome(String str) {
        String rts = "";
        for(int i=str.length()-1; i>=0; i--){
            rts = rts+str.charAt(i);
        }
        boolean p=str.equals(rts);
        if(p==true){ 
        return true;
        }else{
        return false;    
        }
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        boolean t = containsThe(str);
        System.out.println("Your string contains"+countABC(str)+" a's, b's, or c's");
        if(t==true){
            System.out.println("Your string DOES contain the");
        }else{
            System.out.println("Your string DOES NOT contain the");
        }
        boolean p = isPalindrome(str);
        if(p==true){
            System.out.println("Your string IS a palindrome");
        }else{
            System.out.println("Your string IS NOT a palindrome");
        }
        // YOUR CODE HERE
    }
}
