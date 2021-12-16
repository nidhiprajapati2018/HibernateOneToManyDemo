package com.jnit;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="order1")
public class Order {

@Id
@Column(name="oid")
private int oid;

@Column(name="quantity")
private int quantity;

@Column(name="location")
private String location;

public int getOid() {
	return oid;
}

public void setOid(int oid) {
	this.oid = oid;
}

public int getQuantity() {
	return quantity;
}

public void setQuantity(int quantity) {
	this.quantity = quantity;
}

public String getLocation() {
	return location;
}

public void setLocation(String location) {
	this.location = location;
}



}
