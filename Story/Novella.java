package Story;

public class Novella extends Story {

    public Novella() {
        super();
        setMinNumberOfPages();
        setMaxNumberOfPages();
    }

    public void setMinNumberOfPages() {
        minNumberOfPages = 50;
    }

    public void setMaxNumberOfPages() {
        maxNumberOfPages = 100;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    @Override
    public String setMessage() {
        if (numberOfPages < minNumberOfPages) {
            return ("You need to add " + (minNumberOfPages - numberOfPages) + " more pages for a Novella.");
        }
        if (numberOfPages > maxNumberOfPages) {
            return ("You need to remove " + (numberOfPages - maxNumberOfPages) + " pages for a Novella.");
        } else {
            if (numberOfPages == minNumberOfPages || numberOfPages == maxNumberOfPages);
            return ("You have enough pages for a Novella.");
        }
    }
}