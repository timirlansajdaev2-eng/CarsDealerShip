package CarDealirship;
public class ElectricCar extends Vehicle{
    private int battery;
    public  ElectricCar(String brand, int year, int speed, int battery){
        super(brand, year, speed);
        this.battery = battery;
    }

    public int getBattery(){
        return battery;
    }
    
    public void Start(){
        System.out.println("Автомобиль запускается бесшумно");
    }
}
