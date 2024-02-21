package com.example.One.to.many.Uni;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="customer_details")

public class customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="cus_id")
	private Long cusId;
	private String cusName;
	private Integer cusAge;
	
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_cus_id",referencedColumnName ="cus_id" )
	
	private List<bank>Bank;


	public customer(Long cusId, String cusName, Integer cusAge, List<bank> bank) {
		super();
		this.cusId = cusId;
		this.cusName = cusName;
		this.cusAge = cusAge;
		Bank = bank;
	}


	public customer() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Long getCusId() {
		return cusId;
	}


	public void setCusId(Long cusId) {
		this.cusId = cusId;
	}


	public String getCusName() {
		return cusName;
	}


	public void setCusName(String cusName) {
		this.cusName = cusName;
	}


	public Integer getCusAge() {
		return cusAge;
	}


	public void setCusAge(Integer cusAge) {
		this.cusAge = cusAge;
	}


	public List<bank> getBank() {
		return Bank;
	}


	public void setBank(List<bank> bank) {
		Bank = bank;
	}


	@Override
	public String toString() {
		return "customer [cusId=" + cusId + ", cusName=" + cusName + ", cusAge=" + cusAge + ", Bank=" + Bank + "]";
	}
	
	
	
	
}
