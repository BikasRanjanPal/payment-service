package com.example.ps.api.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "payment_tbl")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {
	@Id
	@GeneratedValue
	private int paymentId;
	private String paymentStatus;
	private String transactionId;
	private int orderId;
	private int amount;

	public void setTransactionId(String string) {
		// TODO Auto-generated method stub

	}

	public void setPaymentStatus(String paymentProcessing) {
		// TODO Auto-generated method stub
		
	}
}
