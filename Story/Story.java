package Story;

public abstract class Story {

    public String storyTitle;
    public String authorName;
    public int numberOfPages;
    public String message;
    public int minNumberOfPages;
    public int maxNumberOfPages;

    public String getStoryTitle() {
        return storyTitle;
    }

    public void setStoryTitle(String storyTitle) {
        this.storyTitle = storyTitle;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public abstract String setMessage();
}