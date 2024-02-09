import java.util.Scanner;
public class Gross{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int bs=sc.nextInt();
        double da;
        double hra;
        if(bs<=10000){
            da=(80.00/100.00)*bs;
            hra=(20.00/100.00)*bs;
            System.out.printf("%.2f",(bs+da+hra));
        }
         if(bs>10000&&bs<=20000){
            da=(90.00/100.00)*bs;
            hra=(25.00/100.00)*bs;
            System.out.printf("%.2f",(bs+da+hra));
        }
         if(bs>20000){
            da=(95.00/100.00)*bs;
            hra=(30.00/100.00)*bs;
            System.out.printf("%.2f",(bs+da+hra));
        }
    }
}