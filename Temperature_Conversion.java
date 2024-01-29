import java.util.Scanner;
public class Temp{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        double temp=32+(a*1.8);
        System.out.printf("%.2f",(temp));
    }
}