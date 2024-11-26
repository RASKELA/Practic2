package org.colladge.practice2.task1;

class Picture {
    private String name;
    private short year;
    private String author;

    public Picture(String name, short year, String author) {
        this.name = name;
        this.year = year;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public short getYear() {
        return year;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "org.colladge.practice2.task1.Picture{name='" + name + "', year=" + year + ", author='" + author + "'}";
    }
}