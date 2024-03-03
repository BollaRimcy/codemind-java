import java.util.*;
public class Multiplication{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int mul=sc.nextInt();
        int Starting=sc.nextInt();
        int ending=sc.nextInt();
        for(int i=Starting;i<=ending;i++){
            System.out.println(mul +" x "+ i +" = "+ ( mul*i));
        }
    }
}