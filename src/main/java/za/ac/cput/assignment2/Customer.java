package za.ac.cput.assignment2;

public class Customer {
    public String name;
    public String city;
    public String email_address;

    public Customer() {
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
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
        System.out.println("The name of the customer is as follows" + " " + name );
        System.out.println("The city is as follows" + " "+ city);
        System.out.println("The email is as follows" + " " +email_address);
    }
}
