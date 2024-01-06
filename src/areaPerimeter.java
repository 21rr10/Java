import  java.util.*;
public class areaPerimeter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int area, perimeter,length,breadth;
        System.out.println("Enter the length and breadth of the rectangle");
        length=sc.nextInt();
        breadth=sc.nextInt();
        area=length*breadth;
        perimeter=2*(length+breadth);
        System.out.println("the area is "+ area+"the perimeter is"+perimeter);

    }
}
