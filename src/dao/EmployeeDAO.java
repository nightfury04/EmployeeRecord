package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import bean.Employee;
import utility.ConnectionManager;

public class EmployeeDAO {
	
	Connection conn = null;
	PreparedStatement ps = null;
	
	public EmployeeDAO()
	{
		conn = ConnectionManager.getConnection();
	}
	
	public void createEmployee(Employee emp)
	{
		String sql = "INSERT INTO EMP_DETAILS VALUES (?,?,?,?,?,?,?)";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, emp.getFirstName());
			ps.setString(2, emp.getMiddleName());
			ps.setString(3, emp.getLastName());
			ps.setInt(4, emp.getEmployeeId());
			ps.setInt(5, emp.getAge());
			ps.setString(6, emp.getCompany());
			ps.setInt(7, emp.getSalary());
			ps.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
