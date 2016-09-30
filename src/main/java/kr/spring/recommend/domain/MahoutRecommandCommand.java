package kr.spring.recommend.domain;

public class MahoutRecommandCommand {
	private int id_num;
	private int rate;
	private int shop_code;
	
	public int getId_num() {
		return id_num;
	}
	public void setId_num(int id_num) {
		this.id_num = id_num;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	public int getShop_code() {
		return shop_code;
	}
	public void setShop_code(int shop_code) {
		this.shop_code = shop_code;
	}
	@Override
	public String toString() {
		return "MahoutRecommandCommand [id_num=" + id_num + ", rate=" + rate + ", shop_code=" + shop_code + "]";
	}
	
	
}
