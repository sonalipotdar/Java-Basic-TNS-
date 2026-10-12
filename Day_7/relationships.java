/* class Engine{
    void start(){
        System.out.println("engine is starting");
    }
}

class Break{
    void press(){
        System.out.println("break is pressed");
    }
}

class Car {
     Engine engine;
     Break brake;
    Car(){
        this.engine = new Engine();
        this.brake = new Break();
    }

    void drive(){
    engine.start();
    brake.press();
    System.out.println("car is moving");
   
    }

}
*/  

/*class Address{
    String city;
    String state;
    int pincode;

    Address(String city,String state,int pincode){
        this.city = city;
        this.state = state;
        this.pincode = pincode;
    }

    void displayAddress () {
        System.out.println(city + " ," + state + " , " + pincode + " , ");
    }
}

class student{
    String name;
    String roll_no;
    Address address;

    student(String name,String roll_no,Address address){
        this.name = name;
        this.roll_no = roll_no;
        this.address = address;
    }

    void displaystudent(){
          System.out.println("name: " + name + ", roll_no: " + roll_no);
          address.displayAddress();


    }
}
*/

class Camera{
    int pix;
        Camera(int pix){
        this.pix = pix ;
        }
        void displayCamera(){
            System.out.println("photo is clicked");
        }
}


class phone{
    String brand;
    int battery;
    Camera camera;

    phone(String brand,int battery,Camera camera){
        this.brand = brand;
        this.battery = battery;
        this. camera =  camera;
    }

    void displayphone(){
        System.out.println("brand :" +brand+", battery:" + battery+ ",camera:"+camera.pix);
    }
}