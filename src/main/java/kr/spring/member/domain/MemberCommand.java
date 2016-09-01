package kr.spring.member.domain;

import java.sql.Date;

public class MemberCommand {
	
	private String id;
	private int idnum;
	private String name;
	private String passwd;
	private int rate_count;
	private Date register;
	private String birth;
	private String sex;
	private int grade;
	private int point;
	private String picture;
	private String phone;
	
	public boolean isCheckedPasswd(String userPasswd) {
		if(passwd.equals(userPasswd)) {
			return true;
		}
		return false;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getIdnum() {
		return idnum;
	}
	public void setIdnum(int idnum) {
		this.idnum = idnum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public int getRate_count() {
		return rate_count;
	}
	public void setRate_count(int rate_count) {
		this.rate_count = rate_count;
	}
	public Date getRegister() {
		return register;
	}
	public void setRegister(Date register) {
		this.register = register;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "MemberCommand [id=" + id + ", idnum=" + idnum + ", name=" + name + ", passwd=" + passwd
				+ ", rate_count=" + rate_count + ", register=" + register + ", birth=" + birth + ", sex=" + sex
				+ ", grade=" + grade + ", point=" + point + ", picture=" + picture + ", phone=" + phone + "]";
	}
}
