package exam01;

public class Main {
    public static void main(String[] args) {
        CharacterMaker maker = new CharacterMaker();

        maker.createCharacter(
            new Character() {
                void start() {
                    System.out.println("Start at 10AM!!");
                    action();
                }

                void action() {
                    System.out.println("Workout hard!!");
                }
            }
        );
    }
}