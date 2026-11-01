package CarDealirship;
public class Vehicle {
    private String brand;
    private int year;
    protected int speed;

    public Vehicle(String brand, int year, int speed){
        this.brand = brand;
        this.year = year;
        this.speed = speed;
    }

    public String getBrand(){
        return brand;
    }
    
    public int getYear(){
        return year;
    }

    public int getSpeed(){
        return speed;
    }

    public void setYear(int year){
        this.year = year;
    }

    public void start(){
        System.out.println("Транспорт запускается");
    }
    @Override 
    public String toString(){
        return "Vehicle{" +
                "Brand='" + brand + '\'' + 
                ", year=" + year +
                ", speed=" + speed +
                '}';
    }
}
