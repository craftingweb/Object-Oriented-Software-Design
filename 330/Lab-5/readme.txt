 Lab 5: Applying Good Practicing while Implementing classes.
#### Objectives: ####
1. Understand the purpose of the `equals`, `toString`, `copy`, and copy constructor methods in Java.
2. Implement the `equals`, `toString`, `copy`, and copy constructor methods for a custom class.
3. Learn about object comparisons, string representation, object copying, and encapsulation.
4. Implement a custom `Address` class as an attribute within the `Student` class.
 
#### Instructions: ####
 
**Step 1: Create the Address Class** (5 points)
Create a Java class named `Address` with the following attributes and add all needed getters and setters.
 
class Address {
    private String street;
    private String city;
    private String state;
    private String zipCode;
 
    // Constructor
    public Address(String street, String city, String state, String zipCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }
 
    // Implement getters and setters for the Address class if needed
}

 **Step 2: Class Creation** (5 points)
Create a Java class named `Student` with the following attributes and add all necessary getters and setters.
 
class Student {
    private String name;
    private int emplID;
    private double gpa;
    private Address address;
 
    // Constructor
    public Student(String name, int emplID, double gpa, Address address) {
        this.name = name;
        this. emplID = emplID;
        this.gpa = gpa;
        this.address = address;
    }
    // Implement getters and setters for the Student class if needed
    // Implement the equals method
    // Implement the toString method
    // Implement the copy method
    // Implement a copy constructor
}
 
**Step 3: Implement `equals` Method** (20 points)
In the `Student` class, implement the `equals` method to compare two `Student` objects for equality. The equality condition should be based on the `emplID `.
 


**Step 4: Implement `toString` Method** (15 points)
Implement the `toString` method to return a string representation of the `Student` object, including the address, in the following format:

Student{name='John Doe', rollNumber=12345, gpa=3.75, address=Address{street='123 Main St', city='Anytown', state='CA', zipCode='12345'}}
 
**Step 5: Implement `copy` Method** (20 points)
Implement the `copy` method that creates a deep copy of a `Student` object, including the address, and returns the new copy. Ensure that you create a new `Student` object with the same attribute values and a copy of the `Address` object.
 
**Step 6: Implement the Copy Constructor** (20 points)
Implement a copy constructor in the `Student` class that takes another `Student` object as an argument and creates a new `Student` object with the same attribute values, including the address.
 
**Step 7: Testing** (15 points)
Create a `Main` class with a `main` method for testing your `Student` class.
In the `main` method, do the following:
- Create multiple `Student` objects with different addresses.
- Test the `equals` method to compare `Student` objects for equality.
- Test the `toString` method to print the string representation of `Student` objects.
- Test the `copy` method to create copies of `Student` objects and compare them for equality.
- Test the copy constructor to create new `Student` objects from existing ones and compare them for equality.
  
#### Additional Challenges (Optional): (15 points)
1. Modify the `equals` method to compare `Student` objects based on both `name`, `rollNumber`, and the attributes of the embedded `Address` class.
2. Implement a `hashCode` method in the `Student` class to ensure consistency with the `equals` method.
