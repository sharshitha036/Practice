package Practiceques;//Example of Encapsulation


public class User {

    private String name;
    private int age;
    private  String gender;


    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public User(){
        System.out.println("Default Constructor is called");
    }



    public User(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        System.out.println(name+" "+age+" "+gender);
    }
    @Override
    public String toString(){
        return "name: "+ name + " age: " + age + " gender :" + gender;

    }
}
