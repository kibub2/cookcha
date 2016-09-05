package kr.spring.blog.domain;

import java.sql.Date;

public class BlogCommand {
	//멤버테이블
	private String mem_id;
	private Date mem_birth;
	private String mem_sex;
	private String mem_picture;
	//가게테이블
	private int shop_code;
	private String shop_name;
	private int shop_rate;
	private String shop_picture;
	private String shop_intro;
	private int shop_rater;
	private int shop_classify;
	//코멘트 테이블
	private int comm_num;
	private Date comm_register;
	private String comm_content;
	//개인평가테이블
	private int private_rate;
	//좋아요테이블
	private int wish;
	public String getMem_id() {
		return mem_id;
	}
	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}
	public Date getMem_birth() {
		return mem_birth;
	}
	public void setMem_birth(Date mem_birth) {
		this.mem_birth = mem_birth;
	}
	public String getMem_sex() {
		return mem_sex;
	}
	public void setMem_sex(String mem_sex) {
		this.mem_sex = mem_sex;
	}
	public String getMem_picture() {
		return mem_picture;
	}
	public void setMem_picture(String mem_picture) {
		this.mem_picture = mem_picture;
	}
	public int getShop_code() {
		return shop_code;
	}
	public void setShop_code(int shop_code) {
		this.shop_code = shop_code;
	}
	public String getShop_name() {
		return shop_name;
	}
	public void setShop_name(String shop_name) {
		this.shop_name = shop_name;
	}
	public int getShop_rate() {
		return shop_rate;
	}
	public void setShop_rate(int shop_rate) {
		this.shop_rate = shop_rate;
	}
	public String getShop_picture() {
		return shop_picture;
	}
	public void setShop_picture(String shop_picture) {
		this.shop_picture = shop_picture;
	}
	public String getShop_intro() {
		return shop_intro;
	}
	public void setShop_intro(String shop_intro) {
		this.shop_intro = shop_intro;
	}
	public int getShop_rater() {
		return shop_rater;
	}
	public void setShop_rater(int shop_rater) {
		this.shop_rater = shop_rater;
	}
	public int getShop_classify() {
		return shop_classify;
	}
	public void setShop_classify(int shop_classify) {
		this.shop_classify = shop_classify;
	}
	public int getComm_num() {
		return comm_num;
	}
	public void setComm_num(int comm_num) {
		this.comm_num = comm_num;
	}
	public Date getComm_register() {
		return comm_register;
	}
	public void setComm_register(Date comm_register) {
		this.comm_register = comm_register;
	}
	public String getComm_content() {
		return comm_content;
	}
	public void setComm_content(String comm_content) {
		this.comm_content = comm_content;
	}
	public int getPrivate_rate() {
		return private_rate;
	}
	public void setPrivate_rate(int private_rate) {
		this.private_rate = private_rate;
	}
	public int getWish() {
		return wish;
	}
	public void setWish(int wish) {
		this.wish = wish;
	}
	@Override
	public String toString() {
		return "BlogCommand [mem_id=" + mem_id + ", mem_birth=" + mem_birth + ", mem_sex=" + mem_sex + ", mem_picture="
				+ mem_picture + ", shop_code=" + shop_code + ", shop_name=" + shop_name + ", shop_rate=" + shop_rate
				+ ", shop_picture=" + shop_picture + ", shop_intro=" + shop_intro + ", shop_rater=" + shop_rater
				+ ", shop_classify=" + shop_classify + ", comm_num=" + comm_num + ", comm_register=" + comm_register
				+ ", comm_content=" + comm_content + ", private_rate=" + private_rate + ", wish=" + wish + "]";
	}
	
}
