package com.example.demo.layer2.model;
import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the AIR_TRANSACTION database table.
 * 
 */
@Entity
@Table(name="AIR_TRANSACTION")
@NamedQuery(name="AirTransaction.findAll", query="SELECT a FROM AirTransaction a")
public class AirTransaction implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="TRANSACTION_ID")
	private int transactionId;

	@Column(name="TRANSACTION_AMOUNT")
	private double transactionAmount;

	@Column(name="TRANSACTION_MODE")
	private String transactionMode;

	@Column(name="TRANSACTION_STATUS")
	private String transactionStatus;

	@Column(name="TRANSACTION_TYPE")
	private String transactionType;
/*
*/
	public AirTransaction() {
	}

	public int getTransactionId() {
		return this.transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	public double getTransactionAmount() {
		return this.transactionAmount;
	}

	public void setTransactionAmount(double d) {
		this.transactionAmount = d;
	}

	public String getTransactionMode() {
		return this.transactionMode;
	}

	public void setTransactionMode(String transactionMode) {
		this.transactionMode = transactionMode;
	}

	public String getTransactionStatus() {
		return this.transactionStatus;
	}

	public void setTransactionStatus(String transactionStatus) {
		this.transactionStatus = transactionStatus;
	}

	public String getTransactionType() {
		return this.transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
}