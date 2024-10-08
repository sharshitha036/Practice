package MapsFolder;

public class Person {
    String name;
    int age;
    Grade grade;
    Address address;

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Person(String name, int age, Grade grade, Address address) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                ", address=" + address +
                '}';
    }
}

class Address{
    String AddressLine;
    String City;
    String State;

    public Address(String addressLine, String city, String state) {

        AddressLine = addressLine;
        City = city;
        State = state;
    }

    public String getAddressLine() {
        return AddressLine;
    }

    public void setAddressLine(String addressLine) {
        AddressLine = addressLine;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    @Override
    public String toString() {
        return "Address{" +
                "AddressLine='" + AddressLine + '\'' +
                ", City='" + City + '\'' +
                ", State='" + State + '\'' +
                '}';
    }
}
