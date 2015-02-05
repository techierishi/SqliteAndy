package com.example.sqlitedb;

public class Student {

	private int stu_id;
	private String stu_name;
	private String stu_marks;

	public int getStu_id() {
		return stu_id;
	}

	public void setStu_id(int stu_id) {
		this.stu_id = stu_id;
	}

	public String getStu_name() {
		return stu_name;
	}

	public void setStu_name(String stu_name) {
		this.stu_name = stu_name;
	}

	public String getStu_marks() {
		return stu_marks;
	}

	public void setStu_marks(String stu_marks) {
		this.stu_marks = stu_marks;
	}

	@Override
	public String toString() {
		return "Id : " + stu_id + " Name : " + stu_name + " Marks : "
				+ stu_marks;
	}

}
