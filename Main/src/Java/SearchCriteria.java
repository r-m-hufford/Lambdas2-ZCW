package Java;

import java.util.List;

public class SearchCriteria {

    public Boolean selectiveService(List<Person> roster) {
        Boolean atLeastOneEntryComplies = false;
        for (Person person : roster) {
            if (person.gender == Person.Sex.MALE &&
                    person.getAge() >= 18 &&
                    person.getAge() <= 25) {
                atLeastOneEntryComplies =true;
                System.out.println(person);
            }
        }
        return atLeastOneEntryComplies;
    }

    public Boolean isMale(List<Person> roster) {
        Boolean atLeastOneEntryComplies = false;
        for (Person person : roster) {
            if (person.gender == Person.Sex.MALE) {
                atLeastOneEntryComplies =true;
                System.out.println(person);
            }
        }
        return atLeastOneEntryComplies;
    }


    public Boolean isOlderThan (List<Person> roster, Integer age) {
        Boolean atLeastOneEntryComplies = false;
        for (Person person : roster) {
            if (person.getAge() > age) {
                atLeastOneEntryComplies =true;
                System.out.println(person);
            }
        }
        return atLeastOneEntryComplies;
    }
}
