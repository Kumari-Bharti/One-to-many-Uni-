package com.example.One.to.many.Uni;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="bank")
public class bank {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="bank_id")
	private Long bankId;
	private String bankname;
	private String bankType;
	public bank() {
		super();
		// TODO Auto-generated constructor stub
	}
	public bank(Long bankId, String bankname, String bankType) {
		super();
		this.bankId = bankId;
		this.bankname = bankname;
		this.bankType = bankType;
	}
	public Long getBankId() {
		return bankId;
	}
	public void setBankId(Long bankId) {
		this.bankId = bankId;
	}
	public String getBankname() {
		return bankname;
	}
	public void setBankname(String bankname) {
		this.bankname = bankname;
	}
	public String getBankType() {
		return bankType;
	}
	public void setBankType(String bankType) {
		this.bankType = bankType;
	}
	@Override
	public String toString() {
		return "bank [bankId=" + bankId + ", bankname=" + bankname + ", bankType=" + bankType + "]";
	}
	
	
	
}
