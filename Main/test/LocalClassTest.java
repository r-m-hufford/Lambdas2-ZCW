import Java.PeopleWarehouse;
import Java.Person;
import Java.SearchCriteria;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

public class LocalClassTest {

    PeopleWarehouse warehouse;
    SearchCriteria search = new SearchCriteria();

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
        Assert.assertTrue(search.selectiveService(warehouse.getRoster()));

    }

    @Test
    public void isMale() {
        Assert.assertTrue(search.isMale(warehouse.getRoster()));
    }

    @Test
    public void isOlderThan1(){
        Assert.assertTrue(search.isOlderThan(warehouse.getRoster(), 20));
    }

    @Test
    public void isOlderThan2(){
        Assert.assertFalse(search.isOlderThan(warehouse.getRoster(), 45));
    }
}
