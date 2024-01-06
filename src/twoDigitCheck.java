import java.util.*;
public class twoDigitCheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("enter the number");
        num=sc.nextInt();
        if(num/100==0){
            System.out.println("two digit number");
        }else System.out.println("not a two digit number");
    }
}
