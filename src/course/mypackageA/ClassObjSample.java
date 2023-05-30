package course.mypackageA;

import course.mypackageB.*;

public class ClassObjSample {
    public static void main(String[] args) {
        Person alex = new Person("Alex", 55, "Male");
        alex.sleep();

        Person mia = new Person();
        mia.setName("Mia");
        mia.setAge(40);
        mia.setGender("Female");
        System.out.println(mia.getName());
        mia.sleep();

        Person james = new Person();
        james.setName("James");
        james.setAge(3);
        james.setGender("Male");
        System.out.println(james.getName());
        james.sleep();

    }
}
