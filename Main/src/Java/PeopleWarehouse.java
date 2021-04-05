package Java;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PeopleWarehouse {
    List<Person> roster = new ArrayList<>();

    public PeopleWarehouse() {
    }

    public void add(Person person) {
        roster.add(person);
    }

    public Integer size() {
        return roster.size();
    }

    public List<Person> getRoster() {
        return roster;
    }

    public void printPersons(List<Person> roster, Predicate<Person> tester) {
        for (Person person : roster) {
            if (tester.test(person)) {
                person.printPerson();
            }
        }
    }

    public void selectiveService(List<Person> roster) {
        Predicate<Person> tester = (person) -> person.getGender() == Person.Sex.MALE
                && person.getAge() >= 18
                && person.getAge() <= 25;

        printPersons(roster, tester);
    }

    public void isOlderThan(List<Person> roster, Integer age) {
        Predicate<Person> tester = (person) -> person.getAge() == age;

        printPersons(roster, tester);
    }


    public void isMale(List<Person> roster) {
        Predicate<Person> tester = (person) -> person.getGender() == Person.Sex.MALE;

        printPersons(roster, tester);
    }


    public void isFemale(List<Person> roster) {
        Predicate<Person> tester = (person) -> person.getGender() == Person.Sex.FEMALE;

        printPersons(roster, tester);
    }
}