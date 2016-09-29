package kr.spring.member.domain;

import java.sql.Date;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

public class MemberCommand {
	
	@NotEmpty
	@Email
	private String id;
	private int id_num;
	@NotEmpty
	private String name;
	@Size(min=4, max=10, message="4자 이상 10자 이하로 입력하세요")
	private String passwd;
	private int rate_count;
	private Date register; 
	@NotEmpty
	private String birth;
	@NotEmpty
	private String sex;
	private int grade;
	private int point;
	private String picture;
	@NotEmpty
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
	public int getId_num() {
		return id_num;
	}
	public void setId_num(int id_num) {
		this.id_num = id_num;
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
		return "MemberCommand [id=" + id + ", idnum=" + id_num + ", name=" + name + ", passwd=" + passwd
				+ ", rate_count=" + rate_count + ", register=" + register + ", birth=" + birth + ", sex=" + sex
				+ ", grade=" + grade + ", point=" + point + ", picture=" + picture + ", phone=" + phone + "]";
	}
}
