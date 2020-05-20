/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Object;

/**
 *
 * @author chinh
 */
public class Book {
    private int id;
    private String title;
    private String subject;
    private String publisher;
    private int numberOfPage;
    private String author;
    private int numberOfItem;

    public Book(int id, String title, String subject, String publisher, int numberOfPage, String author, int numberOfItem) {
        this.id = id;
        this.title = title;
        this.subject = subject;
        this.publisher = publisher;
        this.numberOfPage = numberOfPage;
        this.author = author;
        this.numberOfItem = numberOfItem;
    }

    
    @Override
    public String toString() {
        return "Book{" + "id=" + id + ", title=" + title + ", subject=" + subject + ", publisher=" + publisher + ", numberOfPage=" + numberOfPage + ", author=" + author + ", numberOfItem=" + numberOfItem + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getNumberOfPage() {
        return numberOfPage;
    }

    public void setNumberOfPage(int numberOfPage) {
        this.numberOfPage = numberOfPage;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumberOfItem() {
        return numberOfItem;
    }

    public void setNumberOfItem(int numberOfItem) {
        this.numberOfItem = numberOfItem;
    }
    
    
}
