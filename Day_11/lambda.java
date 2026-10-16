
@FunctionalInterface
interface Greeter {
    void greet(String name);
}

public class lambda {
    public static void main(String[] args) {

        Greeter g = name -> System.out.println("Hello, " + name);

        System.out.println("Welcome back");

        g.greet("Sonali");
        g.greet("Rahul");
        g.greet("Amit");
    }
}
