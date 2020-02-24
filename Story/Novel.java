package Story;

public class Novel extends Story {

    public Novel() {
        super();
        setMinNumberOfPages();
    }

    public void setMinNumberOfPages() {
        minNumberOfPages = 101;
    }

    @Override
    public String setMessage() {
        if (numberOfPages < minNumberOfPages) {
            return ("You need to add " + (minNumberOfPages - numberOfPages) + " more pages for a Novel.");
        } else {
            return ("You have enough pages for a Novel.");
        }
    }
}