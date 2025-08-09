public class ExerciseRunner {
    public static void main(String[] args) {
        System.out.println(Chifoumi.getActionBeatenBy(ChifoumiAction.ROCK));     // SCISSOR
        System.out.println(Chifoumi.getActionBeatenBy(ChifoumiAction.PAPER));    // ROCK
        System.out.println(Chifoumi.getActionBeatenBy(ChifoumiAction.SCISSOR));  // PAPER
    }
}
