public class Car extends Vehicle {
    public Car(String brand, int year){
        super(brand,year); // super keyword used to access what's inside of parent (aka super) class;; subclass is child of parent (super), here Car is subclass and Vehicle is super class
        // super keyword allow us to call parent class constructor from here just using keyword super and then in parantheses pass in parameters what's in parent constructor
        // we also can add extra variable, which is only will be available in this class, we create field; and then in constructor we adding this.newField = newField, below super.
        // another usage of super in subclass we have method, which has the same name as parent method, so in order to call parent method in subclass we have to use super.name of method, without keyword super will be recursive call.
    }
 @Override //annotation is a label that we attach to a class member, it give information to Java compiler that we are overriding start() method declared in parent class (Vehicle). It is not neccessary but good practise
    public void start(){
        System.out.println("Car started");
    }
}
