package com.example.otmr.circlecieclipse;

public class Hello {
	public static void main(String[] args) {
		System.out.println("hello");
	}
	private String name_;
	private int id_;
	public Hello() {
		super();
	}

	public String getName() {
		return name_;
	}
	public void setName(String name) {
		name_ = name;
	}
	public int getId() {
		return id_;
	}
	public void setId(int id) {
		id_ = id;
	}

	@Override
	public String toString() {
		return "Hello [name_=" + name_ + ", id_=" + id_ + "]";
	}
}
