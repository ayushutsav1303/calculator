import java.util.Scanner;

public class conditions1 {
    public static void main(String args[]){
        Scanner Sc=new Scanner(System.in);
        int num1=Sc.nextInt();
        int num2=Sc.nextInt();
        int num3=Sc.nextInt();
        if(num1>num2&&num1>num3){
            System.out.println("num1 is greatest");
        }else if(num2>num1&&num2>num3){
            System.out.println("num2 is greatest");
        }else if(num3>num1&&num3>num2){
            System.out.println("num3 is greatest ");
        }
        

        }
    
}
