package utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;


public class ConnectionManager {
	



		static ConnectionManager dbc=null;
		public static Connection getConnection()
		{
			String driverName="oracle.jdbc.driver.OracleDriver";
			String url="jdbc:oracle:thin:@localhost:1521:XE";
			String userName="Rahul";
			String password="Rahul";
			Connection con=null;
			try{
			Class.forName(driverName);
			System.out.println("Driver loaded");
			con=DriverManager.getConnection(url,userName,password);
			System.out.println("Connection created");
			} catch(SQLException e)
			{
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
				System.out.println("Driver could not be loaded");
			}
			return con;
		}
		public static ConnectionManager getDbConnection()
		{
			if(dbc==null)
				dbc=new ConnectionManager();
			return dbc;
		}
		
		
		public static void closeResultSet(ResultSet rs){
			try{
				if(rs!=null){
					rs.close();
				}
			}catch(Exception e){
				e.printStackTrace();
			}
			
		}
		
		public static void closeStatement(Statement st){
			try{
				if(st!=null){
					st.close();
				}
			}catch(Exception e){
				e.printStackTrace();
			}
			
		}
		
		public static void closeConnection(Connection conn){
			try{
				if(conn!=null){
					conn.close();
				}
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		

	}