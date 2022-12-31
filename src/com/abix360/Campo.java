package com.abix360;

public abstract class Campo {
	
	protected int id;
	protected String name;
	protected String description;
	
	public int getId() {
		return id;
	}
	public Campo withId(int id) {
		this.id = id;
		return this;
	}
	public String getName() {
		return name;
	}
	public Campo withName(String name) {
		this.name = name;
		return this;
	}
	public String getDescription() {
		return description;
	}
	public Campo withDescription(String description) {
		this.description = description;
		return this;
	}
	public abstract boolean create();
	public abstract boolean isComposite();

}
