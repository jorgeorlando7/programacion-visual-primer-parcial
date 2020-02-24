package newspapersubscriber;

public class WeekdaySubscriber extends NewspaperSubscriber{
    String subscriptionType;

    public WeekdaySubscriber() {
        super();
        setSubscriptionType();
        setSubscriptionRate();
    }

    public void setSubscriptionType() {
        subscriptionType = "Weekday";
    }

    public void setSubscriptionRate() {
        subscriptionRate = 3.50;
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