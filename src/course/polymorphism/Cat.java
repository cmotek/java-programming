package course.polymorphism;

public class Cat extends DomesticAnimal{
    @Override
    public void eat() {
        super.eat();
        System.out.println("I will eat meat as well.");
    }

    public String run(boolean hasDanger) {
        if (hasDanger) {
            System.out.println("I am running at 45 km/h");
        } else {
            super.run();
        } return "Running";
    }

    public static void main(String[] args) {
        Cat c = new Cat();
        c.setMinSpeed("24 km/h");
        c.eat();
        c.run(true );
    }
}
