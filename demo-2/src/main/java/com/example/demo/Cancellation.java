package com.example.demo;

public class Cancellation {
	int cid;
	String cDate;
	String reason;
	String status;
	double refundAmount;
	String tid;
	public Cancellation(int cid, String cDate, String reason, String status, double refundAmount, String tid) {
		super();
		this.cid = cid;
		this.cDate = cDate;
		this.reason = reason;
		this.status = status;
		this.refundAmount = refundAmount;
		this.tid = tid;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getcDate() {
		return cDate;
	}
	public void setcDate(String cDate) {
		this.cDate = cDate;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public double getRefundAmount() {
		return refundAmount;
	}
	public void setRefundAmount(double refundAmount) {
		this.refundAmount = refundAmount;
	}
	public String getTid() {
		return tid;
	}
	public void setTid(String tid) {
		this.tid = tid;
	}
	
	
	
}
