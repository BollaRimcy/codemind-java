import java.util.Scanner;
public class Octo{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        int decimal=Integer.parseInt(a,8);
        System.out.print(decimal);
    }
}