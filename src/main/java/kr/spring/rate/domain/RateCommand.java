package kr.spring.rate.domain;

import java.sql.Date;

public class RateCommand {
	private int no;
	private int shop_code;
	private String mem_id;
	private int private_rate;
	private Date rate_date;
	private double shop_rating;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getShop_code() {
		return shop_code;
	}
	public void setShop_code(int shop_code) {
		this.shop_code = shop_code;
	}
	public String getMem_id() {
		return mem_id;
	}
	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}
	public int getPrivate_rate() {
		return private_rate;
	}
	public void setPrivate_rate(int private_rate) {
		this.private_rate = private_rate;
	}
	public Date getRate_date() {
		return rate_date;
	}
	public void setRate_date(Date rate_date) {
		this.rate_date = rate_date;
	}
	public double getShop_rating() {
		return shop_rating;
	}
	public void setShop_rating(double shop_rating) {
		this.shop_rating = shop_rating;
	}	
}
