// To print reversed string
import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a string to reverse :");
        String str=s.nextLine();
        String nstr=" ";
        if(str.length()>0){
                    for(int i=str.length()-1;i>=0;i--){
                        nstr+=str.charAt(i);
                    }
        }
      System.out.println("Reversed String :");
      System.out.println(nstr);
    }
}
