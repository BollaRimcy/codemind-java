import java.util.Scanner;
public class Profit{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int cp=sc.nextInt();
        int sp=sc.nextInt();
        double profit=(sp-cp);
        System.out.printf("%.2f",((profit)/cp)*100);
    }
}