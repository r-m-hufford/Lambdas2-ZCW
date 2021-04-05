package Java;

public class IsMale implements CheckPerson{
    @Override
    public Boolean test(Person person) {
        return person.gender == Person.Sex.MALE;
    }
}
