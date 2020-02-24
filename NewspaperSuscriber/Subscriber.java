package NewspaperSuscriber;

public class Subscriber extends NewspaperSubscriber {
    public static void main(String[] args) {
        int typeChoice;

        NewspaperSubscriber[] subscriptionArray = new NewspaperSubscriber[3];
        for (int i = 0; i < subscriptionArray.length; i++) {

            Scanner input = new Scanner(System.in);
            
            System.out.print("Enter your address: ");
            subscriberAddress = input.nextLine();
            
            System.out.println("Choose subscription:  1)Seven Day  2)Weekday only  3)Weekend only (type 0 to QUIT)");
            typeChoice = input.nextInt();

            if (typeChoice == 0) {
                System.exit(0);
            }
            if (typeChoice == 1) {
                subscriptionArray[i] = new SevenDaySubscriber();
            }
            if (typeChoice == 2) {
                subscriptionArray[i] = new WeekdaySubscriber();
            }
            if (typeChoice == 3) {
                subscriptionArray[i] = new WeekendSubscriber();

                for (int j = 0; j < i; j++) {
                    if (subscriptionArray[i].getSubscriberAddress().equals(subscriptionArray[j].getSubscriberAddress())) {
                        System.out.println("That address is already in our system.");
                    }
                }
            }
            System.out.println(subscriptionArray[i].subscriptionDetails());
        }
    }
    

    @Override
    public void getSubscriptionType() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void getSubscriptionRate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String subscriptionDetails() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}