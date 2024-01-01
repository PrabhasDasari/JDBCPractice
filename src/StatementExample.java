import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementExample {
	public static void main(String[] args) throws SQLException {
		Connection con = DataBase.connect();
		Statement st = con.createStatement();
		st.executeUpdate( updateSalaryByName() )
	}
	private static String updateSalaryByName(String name, BigDecimal salary) {
        return "UPDATE EMPLOYEE SET SALARY='" + salary + "' WHERE NAME='" + name + "'";
    }
}
