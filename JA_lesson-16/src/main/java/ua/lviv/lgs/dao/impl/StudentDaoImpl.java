package ua.lviv.lgs.dao.impl;

import java.util.ArrayList;
import java.util.List;

import ua.lviv.lgs.JA_lesson16.Student;
import ua.lviv.lgs.dao.StudentDao;

public class StudentDaoImpl implements StudentDao {
	
	private List<Student> students;
	
	public StudentDaoImpl() {
		students = new ArrayList<>();
	} 

	@Override
	public void create(Student student) {
		if (!students.contains(student)) {
			students.add(student);
		} else {
			System.out.println("Student already exist...");
		}
	}

	@Override
	public Student read(int id) {
		Student student = null;
        for(Student s : students) {
            if(s.getId() == id) {
                student = s;
            }
        }

        return student;
    }

	@Override
	public void update(Student student, String property, String newValue) throws Exception {
		if (students.contains(student) && property != null) {
			Student studentToUpdate = student;
			Integer index = student.getId();
			switch (property) {
			case "name":
				studentToUpdate.setName(newValue);
				break;
			case "age":
				studentToUpdate.setAge(Integer.parseInt(newValue));
				break;	
			default:
				throw new Exception("Incorrect field...");
			}
		students.set(index - 1, studentToUpdate);
		}
	}

	@Override
	public void delete(int id) {
		Student student = read(id);

        if(student != null) {
            students.remove(student);
        }
    }

	@Override
	public List<Student> readAll() {
		return students;
	}

}
