package course.variablepkg;

public class VariableSample {
    public void operatorsTest() {
//      int count = 10;
        Integer count = 10;
        int temp = count;
        int extraCount = 2;
        int totalCount = count;
        if (extraCount == 1) {
            totalCount = count + extraCount;
        }

        System.out.println("Total count is :: " + totalCount);

    }
    public static void main(String[] args) {
        VariableSample obj = new VariableSample();
        obj.operatorsTest();
    }

}

