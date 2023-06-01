package course.collectionpkg;

import course.mypackageB.Person;

import java.util.HashSet;

public class SetSample {
    public static void main(String[] args) {
        HashSet<Person> mySet = new HashSet<>();
        mySet.add(new Person("Zia", 22, "Female"));
        mySet.add(new Person("Zia", 22, "Female"));
        mySet.add(new Person("Alex", 24, "Male"));
        mySet.add(new Person("Zia", 22, "Female"));
        for (Person p : mySet){
            System.out.println(p.getName());
        }

    }
}
