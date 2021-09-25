import java.util.Arrays;
import java.util.Random;

public class Person {

    private String name;
    private String nationality;
    private String dateOfBirth;
    private String[] passport;
    private int seatNumber;

    public Person(String name, String nationality, String dateOfBirth, int seatNumber) {
        this.name = name;
        this.nationality = nationality;
        this.dateOfBirth = dateOfBirth;
        this.passport = new String[3];
        this.seatNumber = seatNumber;
    }

    public Person(Person source) {
        this.name = source.name;
        this.nationality = source.nationality;
        this.dateOfBirth = source.dateOfBirth;
        this.seatNumber = source.seatNumber;
        this.passport = Arrays.copyOf(source.passport, source.passport.length);
    }

    public String getName() {
        return this.name;
    }

    public String getNationality() {
        return this.nationality;
    }

    public String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public String[] getPassport() {
        return Arrays.copyOf(this.passport, this.passport.length);
    }

    public int getSeatNumber() {
        return this.seatNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setPassport() {
        this.passport = new String[] { this.name, this.nationality, this.dateOfBirth };
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    /**
    *  Function name: applyPassport
    *  @return (boolean)
    *
    *  Inside the function:
    *     1. Returns a random boolean of true or false.
    */
    public boolean applyPassport() {
        Random rd = new Random();

        return rd.nextBoolean();
    }

    /**
    *  Function name: chooseSeat
    *
    *  Inside the function:
    *    1. Sets this.seat to a random number between 1 -- 11.
    */
    public void chooseSeat() {
        this.seatNumber = (int) (Math.random() * 11 + 1);
    }

    public String toString() {
        return "Name: " + this.name + "\n" + "Nationality: " + this.nationality + "\n" + "Date of Birth: " + this.dateOfBirth + "\n" + "Seat Number: " + this.seatNumber + "\n" + "Passport: " + Arrays.toString(this.passport) + "\n";
    }

}
