package ro.cognizant.coderun2023;

public class Book {
    private String name;
    private String author;
    private String publishers;
    public Book(){
    }

    public Book(String name, String author, String publishers){
        this.name = name;
        this.author = author;
        this.publishers = publishers;
    }

    public String getname() {return name;}

    public void setname(String name){this.name = name;}

    public String getauthor() {return author;}

    public void setauthor(String author){this.author = author;}

    public String getpublishers() {return publishers;}

    public void setpublishers(String publishers){this.publishers = publishers;}

    @Override
    public String toString() {
        return "Book{" +
                ",name=" + name + '\'' +
                ",authors='" + author +
                ",publishers=" + publishers +
                '}';
    }
}
