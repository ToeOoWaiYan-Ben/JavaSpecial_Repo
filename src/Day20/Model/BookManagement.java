package Day20.Model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class BookManagement {
    private int bookId;
    private String name;
    private String author;
    private int quantity;
    private String publisherEmail;
    private Date publisherDate;
    private double rentFee;

    public BookManagement(int bookId, String name, String author, int quantity, String publisherEmail, Date publisherDate, double rentFee) {
        this.bookId = bookId;
        this.name = name;
        this.author = author;
        this.quantity = quantity;
        this.publisherEmail = publisherEmail;
        this.publisherDate = publisherDate;
        this.rentFee = rentFee;
    }

    public String getName() {
        return name;
    }

    public int getBookId() {
        return bookId;
    }

    public String getAuthor() {
        return author;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getPublisherEmail() {
        return publisherEmail;
    }

    public Date getPublishDate() {
        return publisherDate;
    }

    public double getRentFee() {
        return rentFee;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        return "ID No: " +bookId + "  |  " +
                "Name: " +name + "  |  " +
                "Author: " +author + "  |  " +
                "Book Quantity: " +quantity + "  |  " +
                "Email: " +publisherEmail + "  |  " +
                "Publisher Date: " +sdf.format(publisherDate) + "  |  " +
                "Rent fee: " +rentFee;
    }
}
