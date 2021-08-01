package africa.semicolon.randomExercises;

public abstract class Tutorial {

    abstract void goHome();

    public static void main(String[] args) {
        Tutorial tutorial = new Tutorial() {
            @Override
            void goHome() {
                System.out.println("Iam going Home!!!!!!!");
            }
        };
        tutorial.goHome();
    }
}
