package banking;

public class OverdraftException extends RuntimeException {
    private static final long serialVersionUID = 1L;
    //赤字
    private double deficit;

    public OverdraftException(String message,double deficit){
        super(message);
        this.deficit = deficit;
    }

    public double getDeficit() {
        return deficit;
    }

    public void setDeficit(double deficit) {
        this.deficit = deficit;
    }
}
