
import java.util.*;

import javax.lang.model.util.ElementScanner14;
import javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener;
public class Conditions {
    public static void main(String args[]){
        Scanner Sc=new Scanner(System.in);
       int n=Sc.nextInt();
       if(n>0){
        System.out.println("positive");
       }else if(n<0){
        System.out.println("negative");
       }else{
        System.out.println("zero");
       }
}
}