public class Book {
    String title;
    String author;
    int pages;

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public String label() {
        return title + " by " + author + " (" + pages + "p)";
    }

    public boolean isLong() {
        return pages >= 300;
    }
}
