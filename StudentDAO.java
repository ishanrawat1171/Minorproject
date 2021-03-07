package com.ltts.DAO;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import com.ltts.connection.*;
import com.ltts.student.*;
public class StudentDAO {

	public List<Student> getAllStudents(){
		List<Student> li=new ArrayList<Student>();
		
		return li;
		}
		
		public Student getStudentById(int id) {
			Student S = new Student();
				
			return S;
		}
		
			public boolean insertStudent(Student S) throws Exception
			{
				Connection c=  ConnectionBuilder.getConnection();
				PreparedStatement ps =c.prepareStatement( "insert into Student values(?,?,?,?)");
				ps.setInt(1, S.getId());
				ps.setString(2, S.getName());
				ps.setInt(3, S.getMarks());
				ps.setDouble(4, S.getAttendance());
				
				return ps.execute();
		
		
	}
}