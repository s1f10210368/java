package lecture11.quiz;

public class Status {
    private int state;
    private static Status instance;

    public Status() {
    }

    public static Status getInstance(){
        if (instance == null) {
            instance = new Status();
        }
        return instance;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
