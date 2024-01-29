import java.util.Scanner;
public class Avg{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        double avg=(n+m);
        System.out.printf("%.4f",((avg)/2));
    }
}