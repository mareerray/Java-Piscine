public class ExerciseRunner {
    public static void main(String[] args) {
        System.out.println("Add");
        System.out.println(IntOperations.addTwoIntegers(1, 2));       // expects 3
        System.out.println(IntOperations.addTwoIntegers(15, 68));     // expects 83

        System.out.println("Subtract");
        System.out.println(IntOperations.subtractTwoIntegers(4, 1));  // expects 3
        System.out.println(IntOperations.subtractTwoIntegers(10, 23));// expects -13

        System.out.println("Multiply");
        System.out.println(IntOperations.multiplyTwoIntegers(3, 6));  // expects 18
        System.out.println(IntOperations.multiplyTwoIntegers(12, 11));// expects 132

        System.out.println("Divide");
        System.out.println(IntOperations.divideTwoIntegers(8, 2));    // expects 4
        System.out.println(IntOperations.divideTwoIntegers(13, 4));   // expects 3
    }
}
