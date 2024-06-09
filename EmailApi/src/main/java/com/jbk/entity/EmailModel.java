package com.jbk.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class EmailModel {
	@Id
	private String to;
	private String subject;
	private String msg;
	public EmailModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmailModel(String to, String subject, String msg) {
		super();
		this.to = to;
		this.subject = subject;
		this.msg = msg;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	@Override
	public String toString() {
		return "EmailModel [to=" + to + ", subject=" + subject + ", msg=" + msg + "]";
	}

}
