package practice.tasks;

import java.io.Serializable;

public class Example{

    public static void main(String[] args) {

        Person person = new Person();
        person.setId(1L);
        person.setName("Ivan");
        person.setSurmane("Ivanov");
        Address address = new Address();
        address.setId(1L);
        address.setStreet("Lenina");
        address.setHome(54);
        person.setAddress(address);

        Person person2 = new Person();
        person2.setName("Petr");
        Address address2 = new Address();
        person.setAddress(address2);

        emptyTest(person);
        emptyTest(person2);
    }

    private static void emptyTest(Person person) {
        System.out.println(person);
        System.out.println("Id: " + person.getId() + " - " + isNotEmpty(person.getId()));
        System.out.println("Name: " + person.getName() + " - " + isNotEmpty(person.getName()));
        System.out.println("Surname: " + person.getSurmane() + " - " + isNotEmpty(person.getSurmane()));
        System.out.println(person.getAddress());
        if (person.getAddress() != null) {
            System.out.println("Address.Id: " + person.getAddress().getId() + " - " + isNotEmpty(person.getAddress().getId()));
            System.out.println("Address.Street: " + person.getAddress().getStreet() + " - " + isNotEmpty(person.getAddress().getStreet()));
            System.out.println("Address.Home: " + person.getAddress().getHome() + " - " + isNotEmpty(person.getAddress().getHome()));
        }
    }

    private static boolean isNotEmpty(Serializable item) {
        return item != null;
    }

    static class Person {

        private Long id;

        private String name;

        private String surmane;

        private Address address;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSurmane() {
            return surmane;
        }

        public void setSurmane(String surmane) {
            this.surmane = surmane;
        }

        public Address getAddress() {
            return address;
        }

        public void setAddress(Address address) {
            this.address = address;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", surmane='" + surmane + '\'' +
                    ", address=" + address +
                    '}';
        }
    }

    static class Address {

        private long id;

        private String street;

        private int home;

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public String getStreet() {
            return street;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public int getHome() {
            return home;
        }

        public void setHome(int home) {
            this.home = home;
        }

        @Override
        public String toString() {
            return "Address{" +
                    "id=" + id +
                    ", street='" + street + '\'' +
                    ", home=" + home +
                    '}';
        }
    }
}
