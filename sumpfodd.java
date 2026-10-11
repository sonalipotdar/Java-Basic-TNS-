<<<<<<< HEAD
import java.util.Scanner;
class sumpfodd{
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the number");

        int n = sc.nextInt();
        int sum = 0;
       for (int i=1;i<=n;i++){
        if(i%2!=0){
            sum= sum+i;
        }
        
       }
       System .out.println("sum is: " +sum);
        
    }
=======
import java.util.Scanner;
class sumpfodd{
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the number");

        int n = sc.nextInt();
        int sum = 0;
       for (int i=1;i<=n;i++){
        if(i%2!=0){
            sum= sum+i;
        }
        
       }
       System .out.println("sum is: " +sum);
        
    }
>>>>>>> fbf9427d8cf093378d10d0d5932a4cb81f28b4df
}