package course.exceptionpkg;

public class ExceptionSample {
    public static void main(String[] args) {
        try {
          doSomething();
          throw new myException("My Message");
        } catch(NumberFormatException e){
            System.out.println("Invalid number. You may only use numbers.");
        } catch(ArrayIndexOutOfBoundsException e){
            throw new ArrayIndexOutOfBoundsException("Give numbers between 1 to 4");
        } catch (myException e) {
            System.out.println("This is my own Exception");
        } catch(Exception e){
            System.out.println("Something went wrong.");
        }
    }

    public static void doSomething() throws ArrayIndexOutOfBoundsException, NumberFormatException {
        int userInput = 0;
        userInput = Integer.parseInt("1");
        String[] fruits = {"Bananas", "Watermelons", "Apples", "Oranges"};
        System.out.println("User Picked " + fruits[userInput - 1]);

    }
}
