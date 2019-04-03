package nl.designpatterns.state.game;

public class Game {

    private State state;

    private StartState startState;
    private PauseState pauseState;
    private StopState stopState;

    public Game() {
        this.startState = new StartState(this);
        this.pauseState = new PauseState(this);
        this.stopState = new StopState(this);

        this.state = this.getStopState();

    }

    public void start() {
        this.getState().start();
    }

    public void pause() {
        this.getState().pause();
    }

    public void stop() {
        this.getState().stop();
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public StartState getStartState() {
        return startState;
    }

    public void setStartState(StartState startState) {
        this.startState = startState;
    }

    public PauseState getPauseState() {
        return pauseState;
    }

    public void setPauseState(PauseState pauseState) {
        this.pauseState = pauseState;
    }

    public StopState getStopState() {
        return stopState;
    }

    public void setStopState(StopState stopState) {
        this.stopState = stopState;
    }
}
