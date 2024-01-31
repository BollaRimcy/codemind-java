import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int s=sc.nextInt();
        int b=sc.nextInt();
        int capacity=2*512*t*s*b;
        System.out.println(capacity);
    }
}