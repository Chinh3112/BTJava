/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Object;
import java.util.Date;
/**
 *
 * @author chinh
 */
public class BookLendingTicket {
    private int id;
    private int bookItemId;
    private Date borrowDate;
    private Date dueDate;
    private Date returnDate;
    private int memberId;

    public BookLendingTicket(int id, int bookItemId, Date borrowDate, Date dueDate, Date returnDate, int memberId) {
        this.id = id;
        this.bookItemId = bookItemId;
        this.borrowDate = borrowDate;
        this.dueDate = dueDate;
        this.returnDate = returnDate;
        this.memberId = memberId;
    }

    @Override
    public String toString() {
        return "BookLendingTicket{" + "id=" + id + ", bookItemId=" + bookItemId + ", borrowDate=" + borrowDate + ", dueDate=" + dueDate + ", returnDate=" + returnDate + ", memberId=" + memberId + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBookItemId() {
        return bookItemId;
    }

    public void setBookItemId(int bookItemId) {
        this.bookItemId = bookItemId;
    }

    public Date getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(Date borrowDate) {
        this.borrowDate = borrowDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }
    
    
}
