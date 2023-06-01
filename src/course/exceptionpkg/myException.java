package course.exceptionpkg;

public class myException extends Exception {
    String message;
    myException(String message){
        this.message = message;
    }
}
