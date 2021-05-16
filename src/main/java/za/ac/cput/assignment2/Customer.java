package za.ac.cput.assignment2;

import java.util.Objects;

/**
 *  Ratidzai Makondo - 218187289
 *  This is a TDD program illustrating my understanding on java collection
 */

public class Customer {
    private int key;
    private String name;
    private String city;
    private String email_address;

    public Customer() {
    }

    public int getKey() {
        return key;
    }

    public Customer(String name, int key) {
        this.name = name;
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String getEmail_address() {
        return email_address;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setCity(String city) {
        this.city = city;
    }

    public void setEmail_address(String email_address) {
        this.email_address = email_address;
    }

    public void show() {
        System.out.println("The name of the customer is as follows" + " " + name);
        System.out.println("The city is as follows" + " " + city);
        System.out.println("The email is as follows" + " " + email_address);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return key == customer.key;
    }


}