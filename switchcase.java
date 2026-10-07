
import java.util.Scanner;
class switchcase{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("1.triangle");
         System.out.println("2.rectangle");
         System.out.println("enter your choice");
         int a = sc.nextInt();

        switch(a){
            case 1:
                System.out.println("triangle");
                System.out.println("enter base");
                float base = sc.nextFloat();

                  System.out.println("enter height");
                float height = sc.nextFloat();

                float trianglearea = 0.5f * base * height;
                System.out.println("area of triangle= "+trianglearea);


                break;
                case 2:
                     System.out.println("rectangle");
                     System.out.println("enter the length");
                     float length = sc.nextFloat();

                     System.out.println("enter the breadth ");
                     float breadth = sc.nextFloat();

                     
                     float rectangleArea = length * breadth;
                     System.out.println("area of rectangle= "+rectangleArea);





                     break;
                        default:
                            System.out.println("incorrect selection");
        }
    }
}