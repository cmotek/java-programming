package course.inheritance;

public interface HumanTemp {
    default public void speak(){
        System.out.println("Hey, I am from HumanTemp Interface.");
    }
}
