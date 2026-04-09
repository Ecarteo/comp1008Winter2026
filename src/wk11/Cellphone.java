package wk11;

public class Cellphone
        extends Rectangle
        implements PaymentMethod, Screen {
    @Override
    public void pay() {

    }

    @Override
    public boolean refund(double amount) {
        return false;
    }

    @Override
    public void touch() {

    }

    @Override
    public boolean isCracked() {
        return false;
    }
}
