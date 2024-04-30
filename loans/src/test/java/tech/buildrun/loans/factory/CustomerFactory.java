package tech.buildrun.loans.factory;

import tech.buildrun.loans.domain.Customer;

public class CustomerFactory {

    public static Customer build() {
        return new Customer(25, "123.456.789-00", "Matheus", 5000.0, "SP");
    }

    public static Customer build(Double income) {
        return new Customer(25, "123.456.789-00", "Matheus", income, "SP");
    }

    public static Customer build(int age) {
        return new Customer(age, "123.456.789-00", "Matheus", 5000.0, "SP");
    }

    public static Customer build(String location) {
        return new Customer(25, "123.456.789-00", "Matheus", 5000.0, location);
    }
}
