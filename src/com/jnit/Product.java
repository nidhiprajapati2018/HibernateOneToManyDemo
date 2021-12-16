package com.jnit;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="product1")
public class Product {
	
	@Id
	@Column(name="pid")
	private int pid;
	
	@Column(name="pname")
	private String pname;
	
	@Column(name="price")
	private int price;
	
	  @OneToMany(fetch=FetchType.LAZY,targetEntity=Order.class, cascade=CascadeType.ALL)	
	  @JoinColumn(name="opid",referencedColumnName= "pid")
	  private Set row;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Set getRow() {
		return row;
	}

	public void setRow(Set row) {
		this.row = row;
	}
	  
	  
	

}
