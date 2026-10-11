/*class Animal{
    void eat(){
        System.out.println("animal eats food");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("the dogs bark");
    }
}

public class demoinheritance{
    public static void main(String[]args){
        Dog myDog = new Dog();
        myDog.eat();
        myDog.bark();
    }
}
*/

//multilevel inheritance 

/*class device {
    void poweron(){
        System.out.println("power is on");
    }
    
    }
    class dabbaphone extends device{
        void makeacall(){
            System.out.println("calling the number");
        }
    }

    class smartPhone extends dabbaphone{
        void browseInternet(){
            System.out.println("browsing the internet");
        }
    }

    class demoinheritance{
        public static void main(String[]args){
            
            smartPhone sansung = new smartPhone();
            sansung.poweron();
            sansung.makeacall();
            sansung.browseInternet();
        }
    }*/

   //multiple inheritance

   /*class shape{
    String color = "Blue";
   }

   class circle extends shape{
    void drawcircle(){
        System.out.println("drawing a " + color + " circle");
    }
   }

   class rectangle extends shape{
    void drawrectangle(){
        System.out.println("drawing a " + color + " rectangle");
    }
   }

   class demoinheritance{
    public static void main (String[]args){
        circle c = new circle();
        rectangle r = new rectangle();
        c.drawcircle();
        r.drawrectangle();
    }
   }
   */

  //multiple level using interface

  interface mother {
      void message();
  }

  interface father {
      void message();
  }

  class child implements mother, father {
      @Override
      public void message() {
          System.out.println("loving both of them");
      }
  }

  public class demoinheritance {
      public static void main(String[] args) {
          child c = new child();
          mother m = c;
          father f = c;

          c.message();
          m.message();
          f.message();
      }
  }