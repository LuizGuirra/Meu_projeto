package Entities;

import java.util.Date;

import Entities_Enum.ORDER_STATUS;

public class ORDER {
	
	private Integer id;
	private Date moment;
	private ORDER_STATUS status;
	
	public ORDER() {	
	}
	
	public ORDER(Integer id, Date moment, ORDER_STATUS status) {
		this.id = id;
		this.moment = moment;
		this.status = status;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getMoment() {
		return moment;
	}
	public void setMoment(Date moment) {
		this.moment = moment;
	}
	public ORDER_STATUS getStatus() {
		return status;
	}
	public void setStatus(ORDER_STATUS status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", moment=" + moment + ", status=" + status + "]";
	}
}
