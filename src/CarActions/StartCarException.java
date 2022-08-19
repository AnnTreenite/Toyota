package CarActions;

public class StartCarException extends Exception {
    public String messageTo;

    public StartCarException(String s) {
        this.messageTo = s;
    }
    public String getMessageTo() {
        return messageTo;
    }
}
