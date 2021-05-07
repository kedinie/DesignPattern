package design.pattern.nullObject;

public class CustomerFactory {
    public static final String[] names = {"Robert", "Joe", "Julie"};

    public static AbstractCustomer getCustomer(String name) {
        for (String s : names) {
            if (s.equalsIgnoreCase(name)) {
                return new RealCustomer(name);
            }
        }
        return new NullCustomer();
    }
}
