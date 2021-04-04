import Java.Person;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

public class PersonTest {

    private Person pat;

    @Before
    public void setUp() throws Exception {
        pat = new Person("pat", LocalDate.of(1995,02,02), Person.Sex.MALE, "patpewterschmidt@pat.io");
    }

    @Test
    public void getNameTest() {
        String actual = pat.getName();

        String expected = "pat";

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setNameTest() {
        pat.setName("paul");

        String actual = pat.getName();
        String expected = "paul";

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getBirthday() {
        LocalDate actual = pat.getBirthday();
        LocalDate expected = LocalDate.of(1995,02,02);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setBirthdayTest() {
        pat.setBirthday(LocalDate.of(1996,02,02));
        LocalDate actual = pat.getBirthday();

        LocalDate expected = LocalDate.of(1996,02,02);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getGenderTest() {
        Person.Sex actual = pat.getGender();
        Person.Sex expected = Person.Sex.MALE;

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getEmailAddressTest() {
        String actual = pat.getEmailAddress();
        String expected = "patpewterschmidt@pat.io";

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setEmailAddressTest() {
        pat.setEmailAddress("pewtpaterschmidt@pat.io");
        String actual = pat.getEmailAddress();
        String expected = "pewtpaterschmidt@pat.io";

        Assert.assertEquals(expected,actual);
    }

}
