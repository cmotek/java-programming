package course.inheritance;

public class Artist extends Human {

    public void walk(){
        System.out.println("This is from Artists");
    }

    public static void main(String[] args) {
        Artist a = new Artist();

        a.walk();
        a.speak();

    }
}
