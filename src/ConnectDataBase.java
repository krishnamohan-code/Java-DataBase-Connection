
import java.sql.DriverManager;


public class ConnectDataBase {

	public static void main(String[] args)   {
		
		String url="jdbc:mysql://localhost:3306/sys";
		String user="root";
		String password="root";
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection connection=null;
		DriverManager.getConnection(url,user,password);
//		if(connection != null) {
//			System.out.println("Connection Established");
//		}
		System.out.println("Connection Established");
		
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("connection Failed");
		}
//		else {
//			System.out.println("connection Failed");
//		}
	}

}
