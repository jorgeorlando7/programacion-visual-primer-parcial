Package NewspaperSuscriber;

public class WeekendSubscriber extends NewspaperSubscriber {
    String subscriptionType;

    public WeekendSubscriber() {
        super();
        setSubscriptionType();
        setSubscriptionRate();
    }

    public void setSubscriptionType() {
        subscriptionType = "Weekend";
    }

    public void setSubscriptionRate() {
        subscriptionRate = 2.00;
    }

    @Override
    public String subscriptionDetails() {
        return ("Subscribers address is : " + subscriberAddress + ". Rate: " + subscriptionRate + ". Service type: " + subscriptionType);
    }

    @Override
    public void getSubscriptionType() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void getSubscriptionRate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}