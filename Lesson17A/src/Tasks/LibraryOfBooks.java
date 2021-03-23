package Tasks;

import java.util.Objects;

public class LibraryOfBooks {

    private String name;
    private String author;
    private String genre;
    private int year;
    private String material;
    private String type;


    public LibraryOfBooks(String name, String author, String  genre, int year, String material, int numberOfPages, String type) {
        this.name = name;
        this.author = author;
        this.genre = genre;
        this.year = year;
        this.material = material;
        this.type = type;
    }

    public LibraryOfBooks() {
    }

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

    public String  getGenre() {
        return genre;
    }

    public void setGenre(String  genre) {
        this.genre = genre;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }


    public String isType() {
        return type;
    }

    public void setType (String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LibraryOfBooks that = (LibraryOfBooks) o;
        return year == that.year &&
                type == that.type &&
                Objects.equals(name, that.name) &&
                Objects.equals(author, that.author) &&
                genre == that.genre &&
                Objects.equals(material, that.material);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author, genre, year, material, type);
    }

    @Override
    public String toString() {
        return "LibraryOfBooks{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", genre=" + genre +
                ", year=" + year +
                ", material='" + material + '\'' +
                ", extradition=" + type +
                '}';
    }

}
