package Java;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PeopleWarehouse {
    SearchCriteria searchCriteria = new SearchCriteria();
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

    public void printPeople(List<Person> roster) {
        for (Person person : roster) {
            System.out.println(person);
        }
    }
}

