package course.variablepkg;

public class VariableSample {
    volatile static protected int x = 10;
    public static void main(String[] args) {
        VariableSample obj = new VariableSample();
        System.out.println(obj.x);
    }

}

