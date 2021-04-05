import Java.PeopleWarehouse;
import Java.Person;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

public class PeopleWarehouseTest {

    private PeopleWarehouse warehouse;

    @Before
    public void setUp() throws Exception {
        warehouse = new PeopleWarehouse();

        Person pat = new Person("pat", LocalDate.of(2001,10,17), Person.Sex.MALE, "patpewterschmidt@pat.io");
        Person paul = new Person("paul", LocalDate.of(1998,02,02), Person.Sex.MALE, "paul@pat.io");
        Person pete = new Person("pete", LocalDate.of(1985,07,30), Person.Sex.MALE, "pete@pat.io");

        warehouse.add(pat);
        warehouse.add(paul);
        warehouse.add(pete);
    }

    @Test
    public void addTest() {
        Integer actual = warehouse.size();
        Integer expected = 3;

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void selectiveServiceTest() {
        warehouse.selectiveService(warehouse.getRoster());
    }

    @Test
    public void isOlderThan() {
        warehouse.isOlderThan(warehouse.getRoster(), 25);
    }

    @Test
    public void isMale() {
        warehouse.isMale(warehouse.getRoster());
    }

    @Test
    public void isFemale() {
        warehouse.isFemale(warehouse.getRoster());
    }

}
