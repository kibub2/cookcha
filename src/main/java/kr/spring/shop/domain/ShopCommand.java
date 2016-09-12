package kr.spring.shop.domain;

public class ShopCommand {
	private int code;
	private String name;
	private String phone;
	private String address;
	private String sub_address;
	private int shop_rating;
	private String main_picture;
	private String back_picture;
	private String introduction;
	private int rater;
	private int classify;
	private int maxtable;
	private int able_book;
	private int albe_coupon;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getSub_address() {
		return sub_address;
	}
	public void setSub_address(String sub_address) {
		this.sub_address = sub_address;
	}
	public int getShop_rating() {
		return shop_rating;
	}
	public void setShop_rating(int shop_rating) {
		this.shop_rating = shop_rating;
	}
	public String getMain_picture() {
		return main_picture;
	}
	public void setMain_picture(String main_picture) {
		this.main_picture = main_picture;
	}
	public String getBack_picture() {
		return back_picture;
	}
	public void setBack_picture(String back_picture) {
		this.back_picture = back_picture;
	}
	public String getIntroduction() {
		return introduction;
	}
	public void setIntroduction(String introduce) {
		this.introduction = introduce;
	}
	public int getRater() {
		return rater;
	}
	public void setRater(int rater) {
		this.rater = rater;
	}
	public int getClassify() {
		return classify;
	}
	public void setClassify(int classify) {
		this.classify = classify;
	}
	public int getMaxtable() {
		return maxtable;
	}
	public void setMaxtable(int maxtable) {
		this.maxtable = maxtable;
	}
	public int getAble_book() {
		return able_book;
	}
	public void setAble_book(int able_book) {
		this.able_book = able_book;
	}
	public int getAlbe_coupon() {
		return albe_coupon;
	}
	public void setAlbe_coupon(int albe_coupon) {
		this.albe_coupon = albe_coupon;
	}
	@Override
	public String toString() {
		return "ShopCommand [code=" + code + ", name=" + name + ", phone=" + phone + ", address=" + address
				+ ", sub_address=" + sub_address + ", shop_rating=" + shop_rating + ", main_picture=" + main_picture
				+ ", back_picture=" + back_picture + ", introduction=" + introduction + ", rater=" + rater + ", classify="
				+ classify + ", maxtable=" + maxtable + ", able_book=" + able_book + ", albe_coupon=" + albe_coupon
				+ "]";
	}
	
}
