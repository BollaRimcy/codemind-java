import java.util.Scanner;
public class Student{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int k=sc.nextInt();
            int av=(m-k);
            if(n>av){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
        }
    }
}
