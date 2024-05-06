// Column wise print
import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       System.out.println("Enter the no.of rows for M1 :");
       int r1=s.nextInt();
       System.out.println("Enter the no.of column for M1 :");
       int c1=s.nextInt();
       int[][] arr1=new int[r1][c1];
       System.out.println("Enter the elements of M1:");
       for(int i=0;i<arr1.length;i++){
           for(int j=0;j<arr1[i].length;j++){
               arr1[i][j]=s.nextInt();
           }
       }
       System.out.println("Column wise Print:");
       for(int i=0;i<arr1[0].length;i++){
           for(int j=0;j<arr1.length;j++){
               System.out.print(arr1[j][i]+" ");
           }
           System.out.println();
       }
       

    }
}
