package course.methodpkg;

public class MethodSample {
    public static void main(String[] args) {
        MethodSample obj = new MethodSample();
        obj.sayHello( "Female");
    }

    public void sayHello(String gender){
        String newText = gender.equalsIgnoreCase("Male") ? "Hello, Sir" : "Hello, Madam";
        System.out.println(newText);
    }
}
