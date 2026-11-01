package CarDealirship;
public class test {
    public static void main(String[] args) {
        Dealership dealer = new Dealership();

        Car mers = new Car("Mercedes - Benz", "E63s", 2022, 300);
        Car bmw = new Car("BMW", "X5M", 2015, 150);
        Car aston = new Car("Aston Martin", "DB12", 2022, 330);
        ElectricCar rimac = new ElectricCar("Rimac", 2021, 370, 100);

        dealer.addVehicle(mers);
        dealer.addVehicle(bmw);
        dealer.addVehicle(aston);
        dealer.addVehicle(rimac);

        System.out.println("\nАвтомобили в салоне");

        dealer.snowAllVehicles();

            System.out.println("\nПоиск автомобиля");

        dealer.findVehicleByBrand("Aston Martin");

        System.out.println("\nУскоряем Aston Martin");

        aston.accelerate();

        System.out.println(aston);

        System.out.println("\nЗапуск автомобилей");

        Vehicle[] vehicles = {bmw,mers,aston,rimac};

        for (Vehicle vehicle : vehicles) {
            vehicle.start();
        }




    }
}
