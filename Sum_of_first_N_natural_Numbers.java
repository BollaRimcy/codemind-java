import java.util.Scanner;
import java.lang.*;
public class SumofNatural{
public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int number=s.nextInt();
    int sum=0;
    for(int i=1;i<=number;i++){
        sum=sum+i;
    }
            System.out.println(sum);
    }
}
