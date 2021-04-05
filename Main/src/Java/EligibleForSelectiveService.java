package Java;

public class EligibleForSelectiveService implements CheckPerson{
    @Override
    public Boolean test(Person person) {
        return person.gender == Person.Sex.MALE &&
                person.getAge() >= 18 &&
                person.getAge() <= 25;
    }
}
