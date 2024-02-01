import java.util.Scanner;
public class Height{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int deno=sc.nextInt();
        if(num>deno){
            System.out.print(num);
        }
        else
        {
            System.out.print(deno);
        }
    }
}