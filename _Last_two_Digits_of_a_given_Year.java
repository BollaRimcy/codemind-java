import java.util.*;
public class LastToDigits{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        int result=year%100;
        String format=String.format("%02d",result);
        System.out.print(format);
        
    }
}