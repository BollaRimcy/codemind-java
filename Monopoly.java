import java.util.Scanner;
public class Mono{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
      while(t-->0) {
        int r1=sc.nextInt();
        int r2=sc.nextInt();
        int r3=sc.nextInt();
          boolean a=false;
         if((r1+r2)<r3||(r1+r3)<r2||(r2+r3)<r1)
        {
            a=true;
        }
            if(a)
            {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
      }
}
}