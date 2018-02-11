package controller;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class taskModel {

	@Id
	private int id;
	private String Task;
	private Date date;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTask() {
		return Task;
	}
	public void setTask(String task) {
		Task = task;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	
	
}
