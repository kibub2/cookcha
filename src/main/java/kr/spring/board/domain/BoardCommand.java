package kr.spring.board.domain;

import java.sql.Date;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class BoardCommand {
	
	private int seq;
	private int code;
	@NotEmpty
	private String subject;
	@NotEmpty
	private String content;
	private Date reg_date;
	@NotEmpty
	@Email
	private String id;

	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getReg_date() {
		return reg_date;
	}
	public void setReg_date(Date reg_date) {
		this.reg_date = reg_date;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "BoardCommand [seq=" + seq + ", code=" + code + ", subject=" + subject + ", content=" + content
				+ ", reg_date=" + reg_date + ", id=" + id + "]";
	}
}
