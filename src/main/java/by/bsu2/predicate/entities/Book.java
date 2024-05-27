package by.bsu2.predicate.entities;

public class Book {
    private String name;
    private String author;
    private int year;
    private int countPage;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getCountPage() {
        return countPage;
    }

    public void setCountPage(int countPage) {
        this.countPage = countPage;
    }

    public Book(String name, String author, int year, int countPage) {
        this.name = name;
        this.author = author;
        this.year = year;
        this.countPage = countPage;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Book{");
        sb.append("name='").append(name).append('\'');
        sb.append(", author='").append(author).append('\'');
        sb.append(", year=").append(year);
        sb.append(", countPage=").append(countPage);
        sb.append('}');
        return sb.toString();
    }
}
