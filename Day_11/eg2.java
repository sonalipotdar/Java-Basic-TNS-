import java.util.function.Function;

class eg2{
    public static void main(String[] args){
        Function<String,Integer> getLength = name -> name.length();
        System.out.println(getLength.apply("java"));
         System.out.println(getLength.apply("sonali"));
        
    }
}