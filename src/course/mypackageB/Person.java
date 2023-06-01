package course.mypackageB;

import course.mypackageA.PersonSuper;

public class Person extends PersonSuper implements Comparable<Person>{
    private String name;
    private int age;
    private String gender;

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
    public String getGender() {return gender;}
    public void setGender(String gender) {
        this.gender = gender;
    }

    public Person(String name, int age, String gender) {}

    @Override
    public int hashCode() {
        return this.name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Person && this.name.equals(((Person) obj).name);
    }


    public Person(){}


    public void sleep() {
        if(age < 10){
            System.out.println(name + " will sleep more than 12 hours in a day.");
        } else if (age >= 10 && age <= 50) {
            System.out.println(name + " will sleep less than 10 hours in a day.");
        } else {
            System.out.println(name + " will sleep an average of 10 hours in a day.");
        }
    }

    @Override
    public int compareTo(Person o) {
        return 0;
    }
}

