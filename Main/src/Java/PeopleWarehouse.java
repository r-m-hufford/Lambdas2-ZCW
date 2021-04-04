package Java;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PeopleWarehouse {
    List<Person> roster = new ArrayList<>();

/*    CheckPerson testFunc = (p) -> p.getGender() == Person.Sex.MALE
            && p.getAge() >= 18
            && p.getAge() <= 25;*/
    Predicate<Person> selectiveService = (person -> person.getGender() == Person.Sex.MALE
            && person.getAge() >= 18
            && person.getAge() <= 25);


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
