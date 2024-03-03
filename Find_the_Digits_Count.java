import java.util.*;
public class Countdigit{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        String num1=Integer.toString(number);
        int count=0;
        for(int i=0;i<num1.length();i++){
          count++;  
        }
        System.out.println(count);
    }
}