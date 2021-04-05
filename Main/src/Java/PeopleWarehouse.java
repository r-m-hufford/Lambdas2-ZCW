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

    public List<Person> getRoster () {
        return roster;
    }

    public void printPersons(List<Person> roster, Predicate<Person> tester) {
        for (Person person : roster) {
            if (tester.test(person)) {
                person.printPerson();
            }
        }
    }


}
