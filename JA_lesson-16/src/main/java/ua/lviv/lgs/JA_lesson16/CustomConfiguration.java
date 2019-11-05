package ua.lviv.lgs.JA_lesson16;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ua.lviv.lgs.dao.StudentDao;
import ua.lviv.lgs.dao.impl.StudentDaoImpl;

@Configuration
public class CustomConfiguration {
	
	@Bean(name = "studentDao")
	public StudentDao getStudentDao() {
		StudentDao studentDao = new StudentDaoImpl();
		return studentDao;	
	} 

	@Bean(name = "student")
	public Student getStudent() {
		Student student = new Student();
		student.setName("Mark");
		student.setAge(33);
		student.setId(1);
		return student;
	}
	
	@Bean(name = "student2")
	public Student getStudent2() {
		Student student = new Student();
		student.setName("Oliver");
		student.setAge(25);
		student.setId(2);
		return student;
	}
	
	@Bean(name = "student3")
	public Student getStudent3() {
		Student student = new Student();
		student.setName("David");
		student.setAge(35);
		student.setId(3);
		return student;
	}
	
}
