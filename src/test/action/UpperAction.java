package action;

/**
 */
public class UpperAction implements Action{
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String execute(String str) {
        return (getMessage()+str).toUpperCase();
    }
}
