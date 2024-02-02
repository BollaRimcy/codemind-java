import java.util.*;
 public class Rain{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        
        if(r>0&&r<3)
        {
            System.out.print("LIGHT");
        }
        else if(r>=3&&r<7)
        {
            System.out.print("MODERATE");
        }
        else
        {
            System.out.print("HEAVY");
        }
    
 }
 }