package exceptionLearn;

public class MyException extends Exception{
    static final long serialVersionUID = 13465653435L;
    private int idnumber;
    private String message;
    public MyException(String message, int id) {
        super(message);
        this.message = message;
        this.idnumber = id;
    }
    public int getId() {
        return idnumber;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
