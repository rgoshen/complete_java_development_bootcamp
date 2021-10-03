import java.util.ArrayList;

public class ResizableArrays {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();

        names.add("Joe");
        names.add("Jim");
        names.add("John");

        for (int i = 0; i < names.size(); i++) {
            System.out.println(i + ". " + names.get(i));
        }
        System.out.println("\n");
        names.set(0, "Joe Fresh");
        names.add(3, "Katie");

        for (int i = 0; i < names.size(); i++) {
            System.out.println(i + ". " + names.get(i));
        }

        names.remove(2);
        System.out.println("\n");

        for (int i = 0; i < names.size(); i++) {
            System.out.println(i + ". " + names.get(i));
        }

        names.clear();
        System.out.println("\nCleared:");

        for (int i = 0; i < names.size(); i++) {
            System.out.println(i + ". " + names.get(i));
        }
    }
}
