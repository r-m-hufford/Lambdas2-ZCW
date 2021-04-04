package Java;

import java.time.LocalDate;
import java.time.Period;

public class Person {


    public enum Sex {
        MALE,
        FEMALE
    }

    String Name;
    LocalDate birthday;
    Sex gender;
    String emailAddress;

    public Person(String name, LocalDate birthday, Sex gender, String emailAddress) {
        Name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public Sex getGender() {
        return gender;
    }

    public void setGender(Sex gender) {
        this.gender = gender;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public int getAge() {
        return Period.between(getBirthday(), LocalDate.now()).getYears();
    }

    public void printPerson() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Person{" +
                "Name='" + Name + '\'' +
                ", birthday=" + birthday +
                ", gender=" + gender +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }
}
