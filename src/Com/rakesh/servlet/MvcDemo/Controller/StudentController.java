package Com.rakesh.servlet.MvcDemo.Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Com.rakesh.servlet.MvcDemo.Student;
import Com.rakesh.servlet.MvcDemo.util.StudentDataUtil;


@WebServlet("/StudentController")
public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		List<Student> students=StudentDataUtil.getStudents();
		
		
		request.setAttribute("stud",students);
		
		RequestDispatcher rd=request.getRequestDispatcher("view.jsp");
		
		rd.forward(request, response);
		
		
		
		
		
		
		
		
		
	}



}
