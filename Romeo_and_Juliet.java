import java.util.Scanner;
public class Romeo{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        double d=((5*a)+(10*b))/c;
        System.out.printf("%.0f",d);
        
    }
}