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
public class BookItem {
    private int id;
    private int book_id;
    private String status;
    private int price;
    
    public int getId() {
        return id;
    }

    public BookItem(int id, int book_id, String status, int price) {
        this.id = id;
        this.book_id = book_id;
        this.status = status;
        this.price = price;
    }

    @Override
    public String toString() {
        return "BookItem{" + "id=" + id + ", book_id=" + book_id + ", status=" + status + ", price=" + price + '}';
    }
    

    public void setId(int id) {
        this.id = id;
    }

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    
}
