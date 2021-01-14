package be.company;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class CustomerHandler {

    public void printCustomers(Collection<Customer> customers) {
        for (Customer customer : customers) {
            if (customer instanceof Person) {
                var person = (Person) customer;
                System.out.println(person.getFirstName() + " " + person.getLastName());

            } else if (customer instanceof Company) {
                var company = (Company) customer;
                System.out.println(company.getName());
            }
        }
    }

    public Map<Customer, Integer> getDiscounts(Collection<Customer> customers) {
        Map<Customer, Integer> discounts = new HashMap<>();

        for (Customer customer : customers) {
            if (customer instanceof Person) {
                discounts.put(customer, 10);

            } else if (customer instanceof Company) {
                discounts.put(customer, 20);
            }
        }

        return discounts;
    }
}
