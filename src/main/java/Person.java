import java.util.Objects;

public class Person {
    protected String name;
    protected String surName;
    protected int age;
    protected String address;

    public Person(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }

    public Person(String name, String surName, int age) {
        this.name = name;
        this.surName = surName;
        this.age = age;
    }

    public Person(String name, String surName, String address) {
        this.name = name;
        this.surName = surName;
        this.address = address;
    }

    public Person(String name, String surName, int age, String address) {
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.address = address;
    }

    public void happyBirthday() {
        this.age++;
    }

    public boolean hasAge() {
        return age >= 0;
    }

    public boolean hasAddress() {
        if (this.address != null) {
            return true;
        } else return false;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return " " + name +
                " " + surName +
                " " + age + " год" +
                ", проживающей(-ему) в городе = " + address;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surName);
    }

    public PersonBuilder newChildBuilder() {
        PersonBuilder builder = new PersonBuilder()
                .setSurname(this.getSurName())
                .setAddress(this.getAddress())
                .setAge(0);
        return builder;
    }
}
