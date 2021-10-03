import models.Employee;
import models.Store;
public class Main {
    public static void main(String[] args) {
        // Employee stocker = new Employee("   ", null);
        Employee stocker = new Employee("Paul", "Stocker");
        // Employee stockerCopy = new Employee(stocker);
        // Employee assisManager = new Employee("Nicholas", "     ");
        Employee assistManager = new Employee("Nicholas", "Asst Manager");
        // Employee manager = new Employee(null, "      ");
        Employee manager = new Employee("Damien", "Manager");

        Store store = new Store();

        store.setEmployees(0, stocker);
        store.setEmployees(1, assistManager);
        store.setEmployees(2, manager);

        System.out.println(store);
        store.open();
        
    }
}
