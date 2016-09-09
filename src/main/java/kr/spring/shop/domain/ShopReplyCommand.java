package kr.spring.shop.domain;

import java.sql.Date;

public class ShopReplyCommand {
	private int no;
	private Date register;
	private String content;
	private int code;
	private String mem_id;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public Date getRegister() {
		return register;
	}
	public void setRegister(Date register) {
		this.register = register;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int res_code) {
		this.code = res_code;
	}
	public String getMem_id() {
		return mem_id;
	}
	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}
	@Override
	public String toString() {
		return "ShopReplyCommand [no=" + no + ", register=" + register + ", content=" + content + ", res_code="
				+ code + ", mem_id=" + mem_id + "]";
	}
	
	
}
