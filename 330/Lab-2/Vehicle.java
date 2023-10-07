public class Vehicle {
    protected String brand; // protected is like something between public and private; it is like private for other classes, so other classes can not see, EXCEPT classes that inherite this class and therefore it can edit it.
    protected int year;


    public Vehicle(String brand, int year){
        this.brand = brand;
        this.year = year;
    }



    public void start(){
        System.out.println("Vehicle Started");
    }

    // default constructor for Bicycle
    // when we created constructor with few parameters and then inherite this class to subclass, that subclass expects constructors with few parameters, but we do not need create any constructor in that subclass, so solution to create default constructor in parent class: public Vehicle(){}; so it is fine to have multiple constructors in one class.
    public Vehicle(){};

}
