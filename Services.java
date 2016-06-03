package com.restsecurity.containermangd.example.util;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.restsecurity.declarative.example.model.Student;

@Path("/rest")
public class Services {

	//below resource method is authorized of fixed path /rest/student/list
	@GET
	@Path("/student/list")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Student> studentList(){
		List<Student> studentList = new ArrayList<Student>();
		Student st1 = new Student();
		st1.setFirstName("Emily");
		st1.setLastName("Watson");
		st1.setSchool("Edinburgh High School");
		st1.setId(1001);
		st1.setStandard(5);
		studentList.add(st1);
		
		Student st2 = new Student();
		st2.setFirstName("Sarah");
		st2.setLastName("Williams");
		st2.setSchool("MountainView High School");
		st2.setId(1002);
		st2.setStandard(6);
		studentList.add(st2);
		
		return studentList;
	}
	//below resource method is authorized for any path param
	@GET
	@Path("/mystudent/{firstname}")
	@Produces(MediaType.TEXT_PLAIN)
	public String getStudentByName(@PathParam("firstname") String fname){
		return fname;
	}
	
	//below resource method is not authorized
	@GET
	@Path("/student/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Student studentById(@PathParam("id") int id){		
		Student student = new Student();
		student.setFirstName("Andrew");
		student.setLastName("Jones");
		student.setSchool("St.Mary's");
		student.setId(id);
		return student;
	}
}
