import java.util.Scanner;
public class Hypo{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double ac=sc.nextDouble();
        double bc=sc.nextDouble();
        double ab=Math.sqrt((ac*ac)+(bc*bc));
        System.out.printf("%.2f",ab);
    }
}