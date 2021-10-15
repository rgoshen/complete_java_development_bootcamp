public class Main {
    public static void main(String[] args) {
        Person person = new Person("Zack", 27);
        Person person2 = person;
        Person person3 = new Person(person);

        // System.out.println(person == person2);
        // System.out.println(person3.equals(person));
        // System.out.println("Equality: " + person3.equals(person));
        // System.out.print("person " + person.hashCode());
        // System.out.print(" person3 " + person3.hashCode());

        System.out.println(person.toString());
        System.out.println(person3);
    }
}
