package course.inheritance;

public class Artist extends Human {
    public void preparePainting(){
        System.out.println(name + " is preparing for painting." );
    }

    public static void main(String[] args) {
        Artist a = new Artist();
        a.name = "Lucia";
        a.age = 23;
        a.gender = "Female";

        a.preparePainting();
        a.speak();
    }
}
