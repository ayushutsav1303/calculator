import java.util.Scanner;
import java.util.concurrent.locks.Condition;

public class calculate {
    public static void main(String args[]){
       Scanner Sc=new Scanner(System.in);
       int num=Sc.nextInt();
        int a=Sc.nextInt();
        int b=Sc.nextInt();
        //int num=Sc.nextInt();
        int sum=a+b;
        int sub=a-b;
        int mul=a*b;
        int div=a/b;
        //System.out.println(sum);
        //System.out.println(sub);
        //System.out.println(mul);
        //System.out.println(div);
      switch(num){
        case 1:System.out.println(sum);
        break;
        case 2:System.out.println(sub);
        break;
        case 3:System.out.println(mul);
        break;
        case 4:System.out.println(div);
        break;
        default:System.out.println("invalid");
      }
    }
}
