package kr.spring.recommend.domain;

public class MahoutRecommendCommand {
	private int mem_id_num;
	private int private_rate;
	private int shop_code;
	
	public int getMem_id_num() {
		return mem_id_num;
	}
	public void setMem_id_num(int mem_id_num) {
		this.mem_id_num = mem_id_num;
	}
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
		return "MahoutRecommendCommand [mem_id_num=" + mem_id_num + ", private_rate=" + private_rate + ", shop_code="
				+ shop_code + "]";
	}
	
	
	
}
