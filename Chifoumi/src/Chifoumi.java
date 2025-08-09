public class Chifoumi {
    public static ChifoumiAction getActionBeatenBy(ChifoumiAction chifoumiAction) {
        return switch (chifoumiAction) {
            case ROCK -> ChifoumiAction.SCISSOR;
            case PAPER -> ChifoumiAction.ROCK;
            case SCISSOR -> ChifoumiAction.PAPER;
        };
    }
}


//public class Chifoumi {
//    public static ChifoumiAction getActionBeatenBy(ChifoumiAction chifoumiAction) {
//        switch (chifoumiAction) {
//            case ROCK: return chifoumiAction.SCISSOR;
//            case PAPER: return chifoumiAction.ROCK;
//            case SCISSOR: return chifoumiAction.PAPER;
//            default: return null;
//        }
//    }
//}