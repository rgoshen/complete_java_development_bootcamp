package models;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Contact {

    private String name;
    private int age;
    private String birthDate;
    private String phoneNumber;

    public Contact(String name, String phoneNumber, String birthDate) throws ParseException {

        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("name cannot be blank/null");
        }

        if (phoneNumber == null || phoneNumber.isBlank()) {
            throw new IllegalArgumentException("phone number cannot be blank/null");
        }

        if (phoneNumber.length() < 5) {
            throw new IllegalArgumentException("phone number cannot be less than 5 characters");
        }

        this.name = name;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
        this.age = toAge(birthDate);
    }

    public Contact(Contact source) {
        this.name = source.name;
        this.birthDate = source.birthDate;
        this.phoneNumber = source.phoneNumber;
        this.age = source.age;
    }

    public String getName() {
        return name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("name cannot be blank/null");
        }

        this.name = name;
    }

    public void setBirthDate(String birthDate) throws ParseException {
        this.birthDate = birthDate;
        setAge(toAge(birthDate));
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber == null || phoneNumber.isBlank()) {
            throw new IllegalArgumentException("phone number cannot be blank/null");
        }
        if (phoneNumber.length() < 5) {
            throw new IllegalArgumentException("phone number cannot be less than 5 characters");
        }

        this.phoneNumber = phoneNumber;
    }

    private void setAge(int age) {
        this.age = age;
    }

    /**
     * Name: toAge
     * @param birthDate
     * @return age (int)
     * @throws ParseException
     *
     * Inside the function:
     *   1. Parses a date from the birthDate String
     *   2. Gets the current date
     *   3. Subtracts the difference and returns the age.
     *
     */
    public int toAge(String birthDate) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        formatter.setLenient(false);
        long diff = new Date().getTime() - formatter.parse(birthDate).getTime();
        return (int) (TimeUnit.MILLISECONDS.toDays(diff) / 365);
    }

    public String toString() {
        return "Name: " + this.name + "\n" + "Phone number: " + this.phoneNumber + "\n" + "Birth date: " + this.birthDate + "\n" + "Age: " + this.age + " years old\n";
    }

}
