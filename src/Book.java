public class Book {
    private String title;
    private Author author;
    private int yearOfPublication;

    public Book(String title, Author author, int yearOfPublication){
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    public String toString(){
        return "Название: " + title + " Автор: " + author.toString() + " Год публикации: " + yearOfPublication;
    }

    public boolean equals(Object o){
        if (getClass() != o.getClass()) return false;
        if (hashCode() != o.hashCode()) return false;
        return toString().equals(o.toString());
    }

    public int hashCode(){
        return title.hashCode() + author.hashCode() + yearOfPublication;
    }

    public String getTitle(){
        return this.title;
    }
    public Author getAuthor(){
        return this.author;
    }
    public int getYearOfPublication(){
        return this.yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication){
        this.yearOfPublication = yearOfPublication;
    }
}
