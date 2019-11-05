package ua.lviv.lgs.JA_lesson16;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import ua.lviv.lgs.dao.impl.StudentDaoImpl;

@SpringBootApplication
public class Application {

	public static void main(String[] args) throws Exception {
	
		
		ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args);
		
		StudentDaoImpl studentImpl = (StudentDaoImpl) ctx.getBean("studentDao");
		
		Student student = (Student) ctx.getBean("student");
		Student student2 = (Student) ctx.getBean("student2");
		Student student3 = (Student) ctx.getBean("student3");
		studentImpl.create(student);
		studentImpl.create(student2);
		studentImpl.create(student3);
		List<Student> students = studentImpl.readAll();
		
		System.out.println("---> From list <---");
		students.forEach(System.out::println);
			
		studentImpl.update(student2, "age", "120");
		System.out.println("---> After update <---");
		students.forEach(System.out::println);
		
		studentImpl.delete(1);
		System.out.println("---> After delete <---");
		students.forEach(System.out::println);
		
		
	}

}
