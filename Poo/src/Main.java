/*
Create a Car class with methods to represent a specific model over three years. Implement methods to set the model name,
average prices for each year, and calculate and display the lowest and highest prices. Add a subclass CarModel to
create specific instances, using it in the main class to set prices and display information.*
*/

import person.Person;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> listOfPeople = new ArrayList<>();
        Person personOne = new Person();
        personOne.setName("John Doe");
        personOne.setAge(30);

        Person personTwo = new Person();
        personTwo.setName("Jane Doe");
        personTwo.setAge(30);

        Person personThree = new Person();
        personThree.setName("Jane Doe");
        personThree.setAge(30);

        listOfPeople.add(personOne);
        listOfPeople.add(personTwo);
        listOfPeople.add(personThree);

        System.out.println(listOfPeople.size());
        System.out.println(listOfPeople.get(0));
        System.out.println(listOfPeople.toString());
    }
}
