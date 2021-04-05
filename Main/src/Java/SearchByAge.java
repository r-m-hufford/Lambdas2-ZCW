package Java;

public class SearchByAge implements CheckPerson{
    @Override
    public Boolean test(Person person) {
            return person.getAge() > 25;
        }
    }
