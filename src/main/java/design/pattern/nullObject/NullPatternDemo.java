package design.pattern.nullObject;

public class NullPatternDemo {
    public static void main(String[] args) {
        AbstractCustomer customer = CustomerFactory.getCustomer("Robert");
        AbstractCustomer customer1 = CustomerFactory.getCustomer("Bob");
        AbstractCustomer customer2 = CustomerFactory.getCustomer("Julie");
        AbstractCustomer customer3 = CustomerFactory.getCustomer("Laura");

        System.out.println("Customers");
        System.out.println(customer.getName());
        System.out.println(customer1.getName());
        System.out.println(customer2.getName());
        System.out.println(customer3.getName());
    }
}
