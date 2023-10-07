public class Motorcycle extends Vehicle{

    public Motorcycle(String brand, int year){
        super(brand, year);
    }
    @Override
    public void start(){
        System.out.println("Motorcycle started");
    }

}
