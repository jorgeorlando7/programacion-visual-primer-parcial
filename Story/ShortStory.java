package Story;

public class ShortStory extends Story {

    public ShortStory() {
        super();
        setMaxNumberOfPages();
    }

    public void setMaxNumberOfPages() {
        maxNumberOfPages = 49;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    @Override
    public String setMessage() {
        if (numberOfPages > maxNumberOfPages) {

            return ("You need to remove " + (numberOfPages - maxNumberOfPages) + " pages for a Short Story.");
        } else {
            return ("You have enough pages for a Short Story.");
        }
    }
}