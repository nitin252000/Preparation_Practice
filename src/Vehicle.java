abstract class Vehicle {
    String brand;
    Vehicle(String brand){
        this.brand=brand;
        System.out.println("Vehicle Constructor");

    }
    static class Car extends Vehicle{
        Car(String brand){
            super(brand);
            System.out.println("Car Constructor");
        }
    }
    public static void main(String[] args){
        Car car=new Car("Toyota");
    }
}
