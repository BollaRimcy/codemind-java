import java.util.*;
public class Check{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        if(n%2==0){
            System.out.print("Even");
        }
        else
        {
            System.out.print("Odd");
        }
    }
}