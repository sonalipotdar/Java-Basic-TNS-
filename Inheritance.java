class vehicle{
    String Brand;            //attribute
    void StartEngine(){       //method
        System.out.println("Brand: " + Brand + " engine is started");
        }
}

        class Bike extends vehicle { //child class 
            boolean hasCarrier;
            void kickStand(){
                System.out.println("kickstand put down ");
            }
        }
        class Inheritance {
            public static void main(String[] args) {
               Bike myBike = new Bike();
                myBike.Brand = "honda";
                System.out.println("Has carrier: " + myBike.hasCarrier);
                myBike.StartEngine();
                myBike.kickStand();


            }
        }

