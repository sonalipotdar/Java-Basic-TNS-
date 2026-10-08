class Car{
    int speed;
    String color;
    String Brand;

    Car( int speed, String color,String brand){
        this.color = color;
        this.speed = speed;
        this.Brand = brand;
    }


      //  method1//
      void displayInfo(){
        System.out.println(Brand+"\n"+color+"\n"+speed);
      }

      void accelerate(int incr){
        int or_speed = speed;
        speed+=incr;
        System.out.println("Original Speed:"+or_speed);
        System.out.println(Brand+ " accelerated by "+ speed + "km/hr");
      }



    
}
    class constructor {
        public static void main(String []args){
            Car c1 = new Car(300, "blue", "BMW");
            c1.displayInfo();
            c1.accelerate(50);
        }
    }

