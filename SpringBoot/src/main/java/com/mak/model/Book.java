
package com.mak.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


/**
 * @author daruvuris
 *
 */
	@Entity
	@Table(name = "Book")
	public class Book {

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int id;

		@Size(min = 1, message = "is required")
		@Column(length=30)
		private String bookName;
		
		@Column(length=30)
		private String bookDescription;
		
		@Size(min = 1, message = "is required")
		@Column(length=30)
		private String author;
		
		@NotNull(message ="is required")
		@Column(length=5)
		private Integer quantity;
		
		@NotNull(message ="is required")
		private Double price;
		
		/*@OneToMany(cascade = CascadeType.ALL)
		Set<OrderDetails> order;

		public Set<OrderDetails> getOrder() {
			return order;
		}
		public void setOrder(Set<OrderDetails> order) {
			this.order = order;
		}*/
		/**
		 * @return the id
		 */
		public int getId() {
			return id;
		}
		/**
		 * @param id the id to set
		 */
		public void setId(int id) {
			this.id = id;
		}
		/**
		 * @return the bookName
		 */
		public String getBookName() {
			return bookName;
		}
		/**
		 * @param bookName the bookName to set
		 */
		public void setBookName(String bookName) {
			this.bookName = bookName;
		}
		/**
		 * @return the bookDescription
		 */
		public String getBookDescription() {
			return bookDescription;
		}
		/**
		 * @param bookDescription the bookDescription to set
		 */
		public void setBookDescription(String bookDescription) {
			this.bookDescription = bookDescription;
		}
		/**
		 * @return the author
		 */
		public String getAuthor() {
			return author;
		}
		/**
		 * @param author the author to set
		 */
		public void setAuthor(String author) {
			this.author = author;
		}
		/**
		 * @return the quantity
		 */
		public Integer getQuantity() {
			return quantity;
		}
		/**
		 * @param quantity the quantity to set
		 */
		public void setQuantity(Integer quantity) {
			this.quantity = quantity;
		}
		/**
		 * @return the price
		 */
		public Double getPrice() {
			return price;
		}
		/**
		 * @param price the price to set
		 */
		public void setPrice(Double price) {
			this.price = price;
		}
		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "Inventory [id=" + id + ", bookName=" + bookName + ", bookDescription=" + bookDescription
					+ ", author=" + author + ", quantity=" + quantity + ", price=" + price + "]";
		}

}

