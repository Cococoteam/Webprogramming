package com.maple.community.model;

import java.sql.Date;


public class MemberModel {

	private String id;	
	private String password;	
	private String name;
	private String email;
	private String address;
	private String cell;
	private String home;
	private String permission;
	private Date endday;
	private int numborrow;
	private int numarrear;
	private Date borrowday;
	private Date returnday;
	private int score;
	private String content;
	
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public Date getBorrowday() {
		return borrowday;
	}

	public void setBorrowday(Date borrowday) {
		this.borrowday = borrowday;
	}

	public Date getReturnday() {
		return returnday;
	}

	public void setReturnday(Date returnday) {
		this.returnday = returnday;
	}


	public int getNumarrear() {
		return numarrear;
	}

	public void setNumarrear(int numarrear) {
		this.numarrear = numarrear;
	}

	public int getNumborrow() {
		return numborrow;
	}

	public void setNumborrow(int numborrow) {
		this.numborrow = numborrow;
	}

	public Date getEndday() {
		return endday;
	}

	public void setEndday(Date endday) {
		this.endday = endday;
	}

	public String getPermission() {
		return permission;
	}

	public void setPermission(String permission) {
		this.permission = permission;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCell() {
		return cell;
	}

	public void setCell(String cell) {
		this.cell = cell;
	}

	public String getHome() {
		return home;
	}

	public void setHome(String home) {
		this.home = home;
	}
}