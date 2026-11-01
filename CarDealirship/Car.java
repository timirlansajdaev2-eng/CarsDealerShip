package CarDealirship;
public class Car extends Vehicle {
    private String model;
    public Car(String brand, String model, int year, int speed){
        super(brand, year, speed);
        this.model = model;
    }

    public String getModel(){
        return model;
    }

    public void accelerate(){
        speed += 20;
    }
    @Override 
    public void start(){
        System.out.println( getBrand() + " завелся");
    }
}
