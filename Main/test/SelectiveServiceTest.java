import Java.PeopleWarehouse;
import Java.Person;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

public class SelectiveServiceTest {

    PeopleWarehouse warehouse;

    @Before
    public void setUp() throws Exception {
        warehouse = new PeopleWarehouse();

        Person pat = new Person("pat", LocalDate.of(1999,02,02), Person.Sex.MALE, "patpewterschmidt@pat.io");
        Person paul = new Person("paul", LocalDate.of(2001,03,12), Person.Sex.MALE, "paul@pat.io");
        Person pete = new Person("pete", LocalDate.of(1985,10,07), Person.Sex.MALE, "pete@pat.io");

        warehouse.add(pat);
        warehouse.add(paul);
        warehouse.add(pete);
    }

    @Test
    public void selectiveServiceTest() {

    }
}
