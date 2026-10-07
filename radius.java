import java.util.Scanner;
class radius{
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the radius of the circle");
        int radius = sc.nextInt();

        float circumference  = 2 * 3.14f * radius;
        System.out.println("circumference of the circle is:" +circumference );
        
    }
}