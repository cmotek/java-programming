package course.mypackageB;


import course.mypackageA.PersonSuper;

public class Person extends PersonSuper {
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    private String name;
    private int age;
    private String gender;

    public Person(String name, int age, String gender) {
        this();
        System.out.println("Person 3 arg Constructor");
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Person(){
        System.out.println("Person Default Constructor");
        }


    public void sleep() {
        if(age < 10){
            System.out.println(name + " will sleep more than 12 hours in a day.");
        } else if (age >= 10 && age <= 50) {
            System.out.println(name + " will sleep less than 10 hours in a day.");
        } else {
            System.out.println(name + " will sleep an average of 10 hours in a day.");
        }
    }

    }

