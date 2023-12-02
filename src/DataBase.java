import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBase {
	public static Connection connect( ) throws SQLException {
		String url = "jdbc:mysql://localhost:3306/tree";
		try {
			Connection con = DriverManager.getConnection(url, "root", "Prabha@std3");
			if( con==null ) {
				System.out.println("connection failed");
				return null;
			}else {
				return con;
			}
			
		}catch( SQLException e ) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
		}catch( Exception e ) {
			e.printStackTrace();
		}
		
		return null;
	}
}
