import java.util.Scanner;
class positivenegative{
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the number");
       int positive =0;
        int negative = 0;
        int zero= 0;
        char choice;

        int num = sc.nextInt();

        do{
            System.out.println("enter the number");
            if(num>0){
                positive++;
            }
            else if(num<0){
                  negative++;
            }

            else{
               zero++;
            }
            System.out.println("do u want to continue(y/n):");
            choice =sc.next().charAt(0);
        }

        while(choice == 'y' || choice == 'Y');
         System.out.println("positive numbers:" + positive);
          System.out.println("positive numbers:" + negative);
           System.out.println("positive numbers:" + zero);



      
    }
}
