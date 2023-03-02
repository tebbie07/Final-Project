
public class Book{
    private String title;
    private String author;
    private String genre;
   
   
//this class is for formatting. The toString method is here as well as other organization info, but there isn't any book info here
    public Book(String  title, String author, String genre) {
        this.title = title;
        this.author = author;
        this.genre = genre;
    }

    public String getTitle() {
        return this.title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return this.author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getGenre() {
        return this.genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String toString(){
        return ("You should read " + this.title + " by " + this.author + 
        ". It is a " + this.genre + " book. Hope your enjoy it!");
    }
}
