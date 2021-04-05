import Java.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

public class LocalClassTest {

    SearchByAge olderThan25 = new SearchByAge();
    EligibleForSelectiveService selectiveService = new EligibleForSelectiveService();
    IsMale isMale = new IsMale();

    PeopleWarehouse warehouse;

    @Before
    public void setUp() throws Exception {
        warehouse = new PeopleWarehouse();

        Person pat = new Person("pat", LocalDate.of(2001,06,17), Person.Sex.MALE, "patpewterschmidt@pat.io");
        Person paul = new Person("paul", LocalDate.of(1998,02,02), Person.Sex.MALE, "paul@pat.io");
        Person pete = new Person("pete", LocalDate.of(1985,10,21), Person.Sex.MALE, "pete@pat.io");

        warehouse.add(pat);
        warehouse.add(paul);
        warehouse.add(pete);
    }

    @Test
    public void selectiveServiceTest() {
        warehouse.printPeople(warehouse.getRoster(), selectiveService);
    }

    @Test
    public void isMale() {
        warehouse.printPeople(warehouse.getRoster(),isMale);
    }

    @Test
    public void isOlderThan1(){
        warehouse.printPeople(warehouse.getRoster(), olderThan25);
    }
}
