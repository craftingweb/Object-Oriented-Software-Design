import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String url, file; // declare variables

        System.out.print("Enter URL (example: https://www.google.com/) : ");
        url = scanner.nextLine(); // scanner.nextLine() retrieves whole line of input that user enters (after user press Enter) and then we need to assign to variable in order store it.

        System.out.print("Enter name of file: ");
        file = scanner.nextLine(); // .next() only retrieves till whitespace
        // if its interger then scanner.nextInt(); and nextFloat()

        try {
            URL webpage = new URL(url); // class Url (package) initializing equal to url;; there is not blank url
            Scanner in = new Scanner(webpage.openStream()); // openStream() allow us to start to take input from url ;; it is method in Url class
            FileWriter fileWriter = new FileWriter(file); // FileWriter class creates file

            while (in.hasNextLine() ) { //method checks to see if there's another line in the input of the Scanner object,
                String line = in.nextLine();
                fileWriter.write(line); // writes into file
            }

            fileWriter.close(); // closing file
            in.close(); // closing input

            System.out.println("All information from webpage was saved in the file with the name " + file);
        } catch (MalformedURLException e) {
            System.err.println("Malformed URL: " + e.getMessage());
        } catch (IOException e) { // this exception for openStream() & fileWriter because not everything can be readable in that website, not supported type .
            System.err.println("Error: " + e.getMessage()); // getMessage() method returns the detail message string of this throwable.
        } catch (Exception e) {
            System.err.println("An unexpected exception occurred: " + e.getMessage());
        } finally {
            scanner.close(); // good practise to close scanner
        }
    }
}
