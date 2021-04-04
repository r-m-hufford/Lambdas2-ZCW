import Java.PeopleWarehouse;
import Java.Person;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PeopleWarehouseTest {

    private PeopleWarehouse warehouse;

    @Before
    public void setUp() throws Exception {
        warehouse = new PeopleWarehouse();
    }

    @Test
    public void addTest() {
        Person person = new Person(null,null,null,null);

        warehouse.add(person);

        Integer actual = warehouse.size();
        Integer expected = 1;

        Assert.assertEquals(expected,actual);
    }

}
