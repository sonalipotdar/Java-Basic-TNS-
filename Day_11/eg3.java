import java.util.function.*;
class eg3{

    public static void main(String[] arg){
        Function<Integer,Integer> Square = num -> num*num;
        System.out.println(Square.apply(12));
    }
}