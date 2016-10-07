package kr.spring.wish.domain;

public class WishCommand {
	private int wish_seq;
	private int res_code;
	private String mem_id;
	private int wish;
	public int getWish_seq() {
		return wish_seq;
	}
	public void setWish_seq(int wish_seq) {
		this.wish_seq = wish_seq;
	}
	public int getRes_code() {
		return res_code;
	}
	public void setRes_code(int res_code) {
		this.res_code = res_code;
	}
	public String getMem_id() {
		return mem_id;
	}
	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}
	public int getWish() {
		return wish;
	}
	public void setWish(int wish) {
		this.wish = wish;
	}
	@Override
	public String toString() {
		return "WishCommand [wish_seq=" + wish_seq + ", res_code=" + res_code + ", mem_id=" + mem_id + ", wish=" + wish
				+ "]";
	}
}
