Package NewspaperSuscriber;

public abstract class NewspaperSubscriber {

    public static String subscriberAddress;
    public static double subscriptionRate;
    
    public abstract void getSubscriptionType();
    public abstract void getSubscriptionRate();

    public String getSubscriberAddress() {
        return subscriberAddress;
    }

    public void setSubscriberAddress(String subscriberAddress) {
        this.subscriberAddress = subscriberAddress;
    }

    public double getSubsciptionRate() {
        return subscriptionRate;
    }

    public void setSubscriptionRate() {
    }

    public boolean isEqual(NewspaperSubscriber subscriber) {
        boolean result;
        if (subscriberAddress.equals(subscriber.subscriberAddress)) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
    
    public abstract String subscriptionDetails();  
}