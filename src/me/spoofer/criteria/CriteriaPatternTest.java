package me.spoofer.criteria;

import java.util.ArrayList;
import java.util.List;

public class CriteriaPatternTest {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("le","Male", "Single"));
        persons.add(new Person("fork","Male", "Married"));
        persons.add(new Person("dgl","Female", "Married"));
        persons.add(new Person("dada","Male", "Single"));

        Criteria male = new CriteriaMale();
        Criteria female = new CriteriaFemale();
        Criteria single = new CriteriaSingle();

        System.out.println("Males: ");
        printPersons(male.meetCriteria(persons));

        System.out.println("\nFemales: ");
        printPersons(female.meetCriteria(persons));

        System.out.println("\nSingle: ");
        printPersons(single.meetCriteria(persons));
    }

    public static void printPersons(List<Person> persons){
        for (Person person : persons) {
            System.out.println("Person : [ Name : " + person.getName()
                    +", Gender : " + person.getGender()
                    +", Marital Status : " + person.getMaritalStatus()
                    +" ]");
        }
    }
}
