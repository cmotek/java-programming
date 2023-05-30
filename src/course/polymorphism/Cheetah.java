package course.polymorphism;

public class Cheetah extends WildAnimal {
    public static void main(String[] args) {
        Cheetah c = new Cheetah();
        c.setMinSpeed("82 km/h");
        c.eat();
        c.run();
    }
}
