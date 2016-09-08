package kr.spring.book.domain;

import java.sql.Date;

public class BookCommand {
	private int seq;
	private String id;
	private String name;
	private Date book_date;
	private String book_time;
	private int code;
	private String phone;
	private int seat;
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBook_date() {
		return book_date;
	}
	public void setBook_date(Date book_date) {
		this.book_date = book_date;
	}
	public String getBook_time() {
		return book_time;
	}
	public void setBook_time(String book_time) {
		this.book_time = book_time;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getSeat() {
		return seat;
	}
	public void setSeat(int seat) {
		this.seat = seat;
	}
	@Override
	public String toString() {
		return "BookCommand [seq=" + seq + ", id=" + id + ", name=" + name + ", book_date=" + book_date + ", book_time="
				+ book_time + ", code=" + code + ", phone=" + phone + ", seat=" + seat + "]";
	}
	
	
}
