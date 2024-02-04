import java.util.*;
public class Check{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
         if(n>0&&n<=1000){
             System.out.print("Positive Number");
         }
         else{
             System.out.print("Negative Number");
         }
    }
}