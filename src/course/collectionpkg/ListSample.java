package course.collectionpkg;

import course.mypackageB.Person;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Vector;

public class ListSample {
    public static void main(String[] args) {
        Vector<String> myList = new Vector<>();
        myList.add("a");
        myList.add("b");
        myList.add("c");
        for (String s: myList){
            System.out.println(s);
        }
    }
}
