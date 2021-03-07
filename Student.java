package com.ltts.student;

public class Student {
String name;
int id;
int marks;
double attendance;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks = marks;
}
public double getAttendance() {
	return attendance;
}
public void setAttendance(double attendance) {
	this.attendance = attendance;
}
@Override
public String toString() {
	return "Student [name=" + name + ", id=" + id + ", marks=" + marks + ", attendance=" + attendance + "]";
}



}
