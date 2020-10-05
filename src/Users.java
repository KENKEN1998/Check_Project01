public class Users {
    private String name;
    private int theDate;
    private int paymentAmount;

    public Users(String name, int theDate, int paymentAmount) {
        this.name = name;
        this.theDate = theDate;
        this.paymentAmount = paymentAmount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTheDate() {
        return theDate;
    }

    public void setTheDate(int theDate) {
        this.theDate = theDate;
    }

    public int getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(int paymentAmount) {
        this.paymentAmount = paymentAmount;
    }
}
