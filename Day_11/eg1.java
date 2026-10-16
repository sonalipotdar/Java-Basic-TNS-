import java.util.*;
import java.util.function.Predicate;

public class lambda{
    public static void main(String[]args){
        predicate<Integer> isAdult = age -> age>=18;

        System.out.println(isAdult.test(20));
        System.out.println(isAdult.test(13));

    }
}