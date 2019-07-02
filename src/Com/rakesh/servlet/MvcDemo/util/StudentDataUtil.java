package Com.rakesh.servlet.MvcDemo.util;

import java.util.ArrayList;
import java.util.List;

import Com.rakesh.servlet.MvcDemo.Student;

public class StudentDataUtil {

	
	
	
	public static List<Student> getStudents(){
		
		List<Student> StudentsObj=new ArrayList<>();
		
		StudentsObj.add(new Student("ram","raj","ram@gmail.com"));
		
		StudentsObj.add(new Student("rohan","raj","ram@gmail.com"));

		StudentsObj.add(new Student("aaa","bbbb","aaa@gmail.com"));
		
		StudentsObj.add(new Student("xxxx","yyyy","xxx@gmail.com"));
		
		return StudentsObj;	
	}
}
