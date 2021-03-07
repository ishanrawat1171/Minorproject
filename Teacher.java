package com.ltts.student;

public class Teacher {
String name;
public Teacher(String name, int id) {
	super();
	this.name = name;
	this.id = id;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public Teacher() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Teacher [name=" + name + ", id=" + id + "]";
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
int id;

}
