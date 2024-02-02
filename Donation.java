import java.util.*;
 public class Donate{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        if(y>x){
            int donate=y-x;
            System.out.print(donate);
        }
    }
 }