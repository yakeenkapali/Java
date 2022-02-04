package crudops;

import schema.StudentSchema;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class CrudOps {
  PreparedStatement stmt = null;

  public void create(String name, int age) {
    String query = "INSERT INTO students (`name`, `age`) VALUES (?,?)";
    try {
      stmt = DB.getConnection().prepareStatement(query);
      stmt.setString(1, name);
      stmt.setInt(2, age);
      stmt.executeUpdate();
    } catch (ClassNotFoundException | SQLException e) {
      e.printStackTrace();
    }
  }

  public StudentSchema read() {
    String query = "SELECT * FROM students";
    StudentSchema student = new StudentSchema();
    try {
      stmt = DB.getConnection().prepareStatement(query);
      ResultSet res = stmt.executeQuery();
      
      while (res.next()) {
       student.setId(res.getInt(1));
        student.setName(res.getString(2));
        student.setAge(res.getInt(3));
      } 
    } catch (ClassNotFoundException | SQLException e) {
      e.printStackTrace();
    }
    return student;
  }
  
  public StudentSchema readOne(int id) {
	    String query = "SELECT * FROM students WHERE `id` = ?";
	    StudentSchema student = new StudentSchema();
	    try {
	      stmt = DB.getConnection().prepareStatement(query);
	      stmt.setInt(1, id);
	      ResultSet res = stmt.executeQuery();
	      
	      while (res.next()) {
	    	student.setId(res.getInt(1));
	        student.setName(res.getString(2));
	        student.setAge(res.getInt(3));
	      } 
	    } catch (ClassNotFoundException | SQLException e) {
	      e.printStackTrace();
	    }
	    return student;
	  }

  public void update(int id, String name, int age) {
    String query = "UPDATE `students` SET `name` = ?, `age` = ? WHERE `students`.`id` = ?";
    try {
      stmt = DB.getConnection().prepareStatement(query);
      stmt.setString(1, name);
      stmt.setInt(2, age);
      stmt.setInt(3, id);
      stmt.executeUpdate();
    } catch (ClassNotFoundException | SQLException e) {
      e.printStackTrace();
    }
  }

  public void delete(int id) {
    String query = "DELETE FROM `students` WHERE `students`.`id` = ?";
    try {
      stmt = DB.getConnection().prepareStatement(query);
      stmt.setInt(1, id);
      stmt.executeUpdate();
    } catch (ClassNotFoundException | SQLException e) {
      e.printStackTrace();
    }
  }
}