package week11;

public class Family {
    // Instance variables
    private Person[] members;
    private int numberOfPeople;
    private static final int MAX_MEMBERS = 10;

    // Default constructor
    public Family() {
        members = new Person[MAX_MEMBERS];
        numberOfPeople = 0;
    } // end of the default constructor

    // IO method to display the family
    public void display() {
//System.out.println("There are " + numberOfPeople + " people in the family, with a total age of " + getTotalAge());
        for (int i = 0; i < numberOfPeople; i++) {
            System.out.println(members[i]);
        }
    } // end of the display method

    // Mutator method to add a person to the family
    public boolean addPerson (String name, int age) {
        if (numberOfPeople < MAX_MEMBERS) {
            members[numberOfPeople] = new Person(name, age);
            numberOfPeople++;
            return true;
        } else {
            return false;
        }
    } // end of the addPerson method

    // Mutator method to make changes for a birthday
    public void birthday(String name) {
        for (int i = 0; i < numberOfPeople; i++) {
            if (members[i].getName().equals(name)) {
                members[i].incrementAge();
                break;
            }
        }
    } // end of the birthday method

    // Accessor method to return the number of people
    public int getNumberOfPeople() {
        return numberOfPeople;
    } // end of the getNumberPeople method

    // Accessor method to return the total age of the people
    public int getTotalAge() {
        int totalAge = 0;
        for (int i = 0; i < numberOfPeople; i++) {
            totalAge += members[i].getAge();
        }
        return totalAge;
    } // end of the calculateTotalAge method

} // end of the Family class
