/* class Student{ 
    String name;
    static String collegename = "IIT" ; //static keyword
    Student(String name ){
        this.name = name;
    }

    void studcol(){
        System.out.println(name + " studies in " + collegename);
    }
}
class keywords{
    public static void main(String[]args){
        Student std = new Student("sonali");
        std.studcol();
    }
}
*/

abstract class Shape{
    String color;
    void setcolor(String color){
        this.color = color;
    }
    String getcolor(){
        return color;
    }

    abstract double calculateArea();
}

class circle extends Shape{
    double radius;
    circle(double radius){
        this.radius = radius;
    }

    @Override
    double calculateArea(){
        return (3.14) * radius * radius;
    }
}

class reactangle extends Shape{
    double length,breadth;
    reactangle( double length,double breadth){
        this.length = length;
        this.breadth = breadth;
    }
    @Override
    double calculateArea(){
        return length * breadth;
    }

}

class keywords {
    public static void main(String[] args) {
        Shape sh = new circle(5);

        sh.setcolor("red");

        System.out.println("shape is :  circle ");
        System.out.println("color : " + sh.getcolor());
        System.out.println("Area: " + sh.calculateArea());
    }
}