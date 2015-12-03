package controller;

//Rahul Rastogi
//Sayed Hamid

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;
import org.springframework.web.servlet.view.RedirectView;

import bean.Employee;
import dao.EmployeeDAO;
import dao.EmployeeHibernateDAO;
import utility.ConnectionManager;

/**
 * Servlet implementation class EmployeeController
 */
@SuppressWarnings("deprecation")
public class EmployeeController extends SimpleFormController {
	
	Employee objEmployee;
	
	public Employee getObjEmployee() {
		return objEmployee;
	}


	public void setObjEmployee(Employee objEmployee) {
		this.objEmployee = objEmployee;
	}


	public EmployeeController() {
		// TODO Auto-generated constructor stub
	}


	protected Object formBackingObject(HttpServletRequest req)throws ServletException
	{
		System.out.println("Inside backing object.");
	    objEmployee =this.getObjEmployee();
		return objEmployee;
	}
	
	
	protected ModelAndView onSubmit(HttpServletRequest request,HttpServletResponse response,Object command,BindException errors) throws Exception
	{ 
		
		System.out.println("Inside onSubmit.");
		Employee objEmployee = (Employee)command;
//		objEmployee.setFirstName(request.getParameter("fName"));
//		objEmployee.setMiddleName(request.getParameter("mName"));
//		objEmployee.setLastName(request.getParameter("lName"));
//		objEmployee.setEmployeeId(request.getParameter("empId"));
//		objEmployee.setAge(request.getParameter("age"));
//		objEmployee.setCompany(request.getParameter("company"));
//		objEmployee.setSalary(request.getParameter("salary"));
//		
//		EmployeeDAO eDAO = new EmployeeDAO();
//		eDAO.createEmployee(objEmployee);
		
		
		EmployeeHibernateDAO hDAO = new EmployeeHibernateDAO();
        hDAO.addEmployee(objEmployee);
		
		System.out.println("Leaving onSubmit.");		
		
		return new ModelAndView(new RedirectView("Create.htm"));
     }

}
