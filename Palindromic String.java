// Program to check whether it is palindromic string
import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a string to reverse:");
        String str=s.next();
        StringBuilder sb=new StringBuilder(str);
         String rev= sb.reverse().toString();
         if(str.equals(rev)){
             System.out.println("Palindromic String");
         }else{
             System.out.println("Not Palindromic String");
         }
        }
}
