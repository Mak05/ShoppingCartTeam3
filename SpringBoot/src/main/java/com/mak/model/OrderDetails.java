package com.mak.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class OrderDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "order_id", nullable = false)
    private int orderId;	

	@ManyToOne()
    @JoinColumn(name = "userName")
    private Users user;
 
    @ManyToOne()
    @JoinColumn(name = "id")
    private Book book;
 
    @Column(name = "Quanity", nullable = false)
    private int quanity;
 
    @Column(name = "Price", nullable = false)
    private double price;
    
    /*public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	private double total;*/
 
    public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public int getQuanity() {
		return quanity;
	}

	public void setQuanity(int quanity) {
		this.quanity = quanity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
