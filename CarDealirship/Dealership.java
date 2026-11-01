package CarDealirship;
public class Dealership {
    private Vehicle[] vehicles;

    public Dealership(){

    vehicles = new Vehicle[10];
    }

    public void addVehicle(Vehicle vehicle){
        for(int i = 0; i < vehicles.length; i++){
            if(vehicles[i] == null){
                vehicles[i] = vehicle;
                System.out.println("Автомобиль добавлен");
                return ;
            }
        }
        System.out.println("Автосалон заполнен");
    }

    public void snowAllVehicles(){
        for (Vehicle veh : vehicles) {
            if(veh != null){
                System.out.println(veh);
                System.out.println("------------------------------------");
            }
        }
    }

    public void findVehicleByBrand(String brand){

        for (Vehicle vehicle1 : vehicles) {
            if(vehicle1 != null && vehicle1.getBrand().equals(brand)){
                System.out.println("Автомобиль найден");
                System.out.println(vehicle1);
                return ;
            }
        }

        System.out.println("Автомобиль " + brand + " не найден");

    }


}
