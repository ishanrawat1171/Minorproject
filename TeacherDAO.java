package com.ltts.DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import com.ltts.connection.ConnectionBuilder;
import com.ltts.student.*;
public class TeacherDAO {
	public List<Teacher> getAllTeachers(){
		List<Teacher> li=new ArrayList<Teacher >();
		
		return li;
		}
	public Teacher getTeacherById(int id) {
		Teacher t = new Teacher();
			
		return t;
	}
	public boolean insertPlayer(Teacher t) throws Exception
	{
		Connection c= ConnectionBuilder.getConnection();
		
		PreparedStatement ps= c.prepareStatement("insert into Teacher values(?,?)");
		ps.setInt(1,t.getId());
		ps.setString(2, t.getName());
		return ps.execute();

}
}
