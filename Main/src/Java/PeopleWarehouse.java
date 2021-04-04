package Java;

import java.util.ArrayList;
import java.util.List;

public class PeopleWarehouse {
    List<Person> roster = new ArrayList<>();

    public void printPersons(List<Person> roster, CheckPerson tester) {
        for (Person person : roster) {
            if (tester.test(person)) {
                person.printPerson();
            }
        }
    }


}
