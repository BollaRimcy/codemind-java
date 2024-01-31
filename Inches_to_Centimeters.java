import java.util.Scanner;
public class Inch{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        double res=2.54*a;
        System.out.printf("%.2f",res);
    }
}