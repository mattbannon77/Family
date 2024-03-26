package week11;

public class Person {

    // Instance variables
    private String name;
    private int age;

    //Default constructor
    public Person() {
        name = "";
        age = 0;
    } // end of the default constructor

    // Parameterized constructor
    public Person (String name, int age) {
        this.name = name;
        this.age = age;
    } // end of the parameterized constructor

    // toString method
    public String toString() {
        return this.name + " is " + this.age + " years old";
    } // end of the toString method

    // Mutator method to increment age
    public void incrementAge() {
        age++;
    } // end of the incrementAge method

    // Accessor method to return name
    public String getName() {
        return name;
    } // end of the getName method

    //Accessor method to return age
    public int getAge() {
        return age;
    } // end of the getAge method

} // end of the Person class
