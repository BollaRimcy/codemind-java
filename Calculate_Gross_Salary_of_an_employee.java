import java.util.*;
public class Gross{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double bs=sc.nextFloat();
        double hra=sc.nextFloat();
        double da=sc.nextFloat();
        double pf=bs*0.12;
        double gs=bs+hra+da+pf;
        System.out.printf("%.2f
%.2f",pf,gs);
    }
}