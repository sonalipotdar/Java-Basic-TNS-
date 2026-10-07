import java .util.Scanner;
class vote{
    public static void main(String []args){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter your age:");
        int age = sc.nextInt();
        System.out.println("age");

        if(age>18){
            System.out.println("your eligible to vote");
        }

        else{
            System.out.println("your not eligible to vote");
        }
    }
}
