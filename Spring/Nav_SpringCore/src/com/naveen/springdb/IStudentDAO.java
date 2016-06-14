package com.naveen.springdb;

import java.util.List;

import javax.sql.DataSource;


public interface IStudentDAO {
	// setting up the database
	public void setDataSource(DataSource ds);
	
	/**
	 * this method is used to create the student record 
	 * into the database, by passing parameters 
	 * 
	 */
	public void create(String name, Integer age);
	   /** 
	    * This is the method to be used to list down
	    * a record from the Student table corresponding
	    * to a passed student id.
	    */
	   public Student getStudent(Integer id);
	   /** 
	    * This is the method to be used to list down
	    * all the records from the Student table.
	    */
	   public List<Student> listStudents();
	   /** 
	    * This is the method to be used to delete
	    * a record from the Student table corresponding
	    * to a passed student id.
	    */
	   public void delete(Integer id);
	   /** 
	    * This is the method to be used to update
	    * a record into the Student table.
	    */
	   public void update(Integer id, Integer age);
}
