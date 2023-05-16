package course.mypackageA;

import course.mypackageB.*;

public class ClassObjSample {
    public static void main(String[] args) {
        Person alex = new Person("Alex", 55, "Male");
        alex.sleep();

        Person mia = new Person();
        mia.name = "Mia";
        mia.age = 40;
        mia.gender = "Female";
        mia.sleep();

        Person james = new Person();
        james.name = "James";
        james.age = 3;
        james.gender = "Male";
        james.sleep();

    }
}
