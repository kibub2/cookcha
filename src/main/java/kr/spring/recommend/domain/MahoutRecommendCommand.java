package kr.spring.recommend.domain;

public class MahoutRecommendCommand {
	private int private_rate;
	private int shop_code;
	
	
	public int getPrivate_rate() {
		return private_rate;
	}
	public void setPrivate_rate(int private_rate) {
		this.private_rate = private_rate;
	}
	public int getShop_code() {
		return shop_code;
	}
	public void setShop_code(int shop_code) {
		this.shop_code = shop_code;
	}
	@Override
	public String toString() {
		return "MahoutRecommendCommand [private_rate=" + private_rate + ", shop_code="
				+ shop_code + "]";
	}
	
	
	
}
