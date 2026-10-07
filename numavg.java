import java.util.Scanner;
class numavg{
    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the first number:");
        int a = sc.nextInt();
        System.out.println("enter the second number:");
        int b = sc.nextInt();
        System.out.println("enter the third number:");
        int c = sc.nextInt();

        float avg = (a+b+c) /3.0f;
        System.out.println("avg of number is :"+ avg);



    }
}