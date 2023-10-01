import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

        House yourHouse = new Village();
        System.out.println("Welcome To Your House!");
        System.out.println("How many bedrooms in your house: ");
        int numberOfBedrooms = scanner.nextInt();
        yourHouse.setBedrooms(numberOfBedrooms);
        System.out.println("How many kitchens in your house: ");
        int numberOfKitchens = scanner.nextInt();
        yourHouse.setKitchens(numberOfKitchens);
        System.out.println("How many windows in your house: ");
        int numberOfWindows = scanner.nextInt();
        yourHouse.setWindows(numberOfWindows);
        System.out.println("How many bathrooms in your house: ");
        int numberOfBathrooms = scanner.nextInt();
        yourHouse.setBathrooms(numberOfBathrooms);
        System.out.println("How many doors in your house: ");
        int numberOfDoors = scanner.nextInt();
        yourHouse.setDoors(numberOfDoors);
        System.out.printf("Your House consist of: "+ yourHouse.getBedrooms() + " bedrooms, "+yourHouse.getKitchens()+" kitchen, "+yourHouse.getBathrooms()+" bathroom, "+yourHouse.getDoors()+" doors, "+yourHouse.getWindows()+" windows.");
       System.out.println(" \nYour Have An Awesome Home!");

    }
}