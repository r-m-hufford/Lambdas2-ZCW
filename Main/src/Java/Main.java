package Java;

import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Comparator;

public class Main {

    public static void main (String[] args) throws IOException {
        Person pat = new Person("Pat", LocalDate.of(1995,02,02), Person.Sex.MALE, "patpewterschmidt@pat.io");

        System.out.println(pat);
    }
}
