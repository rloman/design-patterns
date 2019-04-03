package nl.designpatterns.state.game;

public class Application {

    public static void main(String[] args) {
        Game game = new Game();

        game.stop();

        game.pause();

        game.start();

        game.pause();

//        game.start();

        game.stop();

    }
}
