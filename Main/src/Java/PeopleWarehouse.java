package Java;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PeopleWarehouse {
    CheckPerson tester;
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

    public void printPersons(List<Person> roster, CheckPerson tester) {
        for (Person person : roster) {
            if (tester.test(person)) {
                person.printPerson();
            }
        }
    }

    public void selectiveService(List<Person> roster) {
        tester = new CheckPerson() {
            @Override
            public Boolean test(Person person) {
                return person.getGender() == Person.Sex.MALE
                        && person.getAge() >= 18
                        && person.getAge() <= 25;
            }
        };
        for (Person person : roster) {
            if (tester.test(person)) {
                person.printPerson();
            }
        }
    }


    public void isOlderThan(List<Person> roster, Integer age) {
        tester = new CheckPerson() {
            @Override
            public Boolean test(Person person) {
                return person.getAge() > age;
            }
        };
        for (Person person : roster) {
            if (tester.test(person)) {
                person.printPerson();
            }
        }
    }


    public void isMale(List<Person> roster) {
        tester = new CheckPerson() {
            @Override
            public Boolean test(Person person) {
                return person.getGender() == Person.Sex.MALE;
            }
        };
        for (Person person : roster) {
            if (tester.test(person)) {
                person.printPerson();
            }
        }
    }


    public void isFemale(List<Person> roster) {
        tester = new CheckPerson() {
            @Override
            public Boolean test(Person person) {
                return person.getGender() == Person.Sex.FEMALE;
            }
        };
        for (Person person : roster) {
            if (tester.test(person)) {
                person.printPerson();
            }
        }
    }
}
