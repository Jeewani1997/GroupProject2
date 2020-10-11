package com.WasteManagementSystem.Backend.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Entity
@Table(name = "outsourceWasteRequest")
public class OutsourceWasteRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    private int id;
    @NotNull
    private String wasteType;
    @NotNull
	private int quantity;
//	@NotNull
    private Date date;
//	@NotNull
    private String customer;
    private String email;
    private String status;
    private int year;
    public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}

	private int month;


	public OutsourceWasteRequest(){

	}
    public OutsourceWasteRequest(int id, String wasteType, int quantity ,Date date, String customer ,String email,String status,int year,int month){
        super();
        this.id = id;
		this.quantity = quantity ;
		this.status = status ;
        this.date = date;
      	this.customer = customer;
      	this.email = email;
      	this.year = year;
      	this.month = month;
    }

    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getWasteType() {
		return wasteType;
	}

	public void setWasteType(String wasteType) {
		this.wasteType =wasteType;
	}
	
	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getstatus() {
		return status;
	}

	public void setstatus(String status) {
		this.status = status;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer =customer;
	}
	
	public String getEMail() {
		return email;
	}

	public void setEMail(String email) {
		this.email =email;
	}

    
}