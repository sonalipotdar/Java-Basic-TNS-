import java.util.function.Consumer;

class eg4 {
    public static void main(String[]args){
        Consumer<String> smsNotifer = mobno -> {
            System.out.println("Sending the otp to the ph no : " + mobno);

        };
        smsNotifer.accept("+91 22222");
    }
}