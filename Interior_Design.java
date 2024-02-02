import java.util.*;
 public class Inter{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int x1=sc.nextInt();
        int y1=sc.nextInt();
        int x2=sc.nextInt();
        int y2=sc.nextInt();
        int des1=x1+y1;
        int des2=x2+y2;
        if(des1<des2){
            System.out.print(des1);
        }
        else{
            System.out.print(des2);
        }
    }
}