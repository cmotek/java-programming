package course.mypackageB;


import course.mypackageA.PersonSuper;

public class Person extends PersonSuper {
    public String name;
    public int age;
    public String gender;

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
            System.out.println(name + " will sleep more than 10 hours in a day.");
        } else {
            System.out.println(name + " will sleep an average of 10 hours in a day.");
        }
    }

    }

