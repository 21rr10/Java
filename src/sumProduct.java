import java.util.*;
public class sumProduct {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1, num2,sum,product;
        System.out.println("Enter the 2 numbers");
        num1=sc.nextInt();
        num2=sc.nextInt();
        sum=num1+num2;
        product=num1*num2;
        System.out.println("the sum is "+sum+"and the product is "+product);
    }
}
