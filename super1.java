class bankaccount {
    String Accountholder;
    bankaccount(String Accountholder){
    this.Accountholder = Accountholder ;

    }

     void display_details(){
        System.out.println("Accountholder name: " +Accountholder );
     }

}

class Savingaccount extends bankaccount{
    double InterestRate = 4.5 ;

    Savingaccount(String Accountholder){
        super(Accountholder);
    }
    @Override
    void display_details(){
      
        System.out.println("hello accountholder name is" + Accountholder + " InterestRate " + InterestRate + " %");
    }

}