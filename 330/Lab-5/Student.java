import java.util.Objects;
public class Student {
        private String name;
        private int emplID;
        private double gpa;
        private Address address;

        // Constructor
        public Student(String name, int emplID, double gpa, Address address) {
            this.name = name;
            this.emplID = emplID;
            this.gpa = gpa;
            this.address = address;
        }

        // Getters and Setters
        public String getName() {return name;};
        public void setName(String name) {this.name=name;};
        public int getEmplID() {return emplID;}
        public void setEmplID(int emplID) {this.emplID = emplID;}
        public double getGpa() {return gpa;}
        public void setGpa(double gpa) {this.gpa = gpa;}
        public Address getAddress() {return address;}
        public void setAddress(Address address) {this.address = address;}

        // Compare two Students objects with help of equal method.
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null || getClass() != obj.getClass())
                return false;
            Student student = (Student) obj;
            return emplID == student.emplID &&
                    Objects.equals(name, student.name) &&
                    Objects.equals(address, student.address);
        }

        // toString method to represent Student
        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", emplID=" + emplID +
                    ", gpa=" + gpa +
                    ", address=" + address +
                    '}';
        };

        // Copy method
        public Student copy() {
            Address addressCopy = new Address(address.getStreet(), address.getCity(), address.getState(), address.getZipCode());
            return new Student(name, emplID, gpa, addressCopy);
        }


        // Copy constructor object
        public Student(Student otherStudent) {
            this.name = otherStudent.name;
            this.emplID = otherStudent.emplID;
            this.gpa = otherStudent.gpa;

            // copying the existing address
            this.address = new Address(otherStudent.address.getStreet(), otherStudent.address.getCity(),
                    otherStudent.address.getState(), otherStudent.address.getZipCode());
        }

        // hashCode method
        @Override
        public int hashCode() {
            return Objects.hash(name, emplID, address);
        }


}
