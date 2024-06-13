package oracledb;

import java.sql.*;

public class Insert_Book_Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection connect = null;
		final String connectionURL = """
				jdbc:oracle:thin:@localhost:1521/xe
				"""; // 10.10.108.130 또는 localhost
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			connect = DriverManager.getConnection(connectionURL, "madang", "madang");
			final String insert_sql = """
					INSERT INTO Orders(orderid, custid, bookid, saleprice, orderdate)\s
					VALUES(?, ?, ?, ?, TO_DATE(?, 'yyyy-mm-dd'));
					""";
			final PreparedStatement preparedStatement = connect.prepareStatement(insert_sql);
			int[] custid = {1, 1, 2, 3, 4, 1, 4, 3, 2, 3};
			int[] bookid = {1, 3, 5, 6, 7, 2, 8, 10, 10, 8};
			int[] saleprice = {6000, 21000, 8000, 6000, 20000, 12000, 13000, 12000, 7000, 13000};
			String[] orderdate = {"2020-07-01", "2020-07-03", "2020-07-03", "2020-07-04", "2020-07-05", "2020-07-07", "2020-07-07", "2020-07-08", "2020-07-09", "2020-07-10"};
			
			for(int i = 0;i<10;++i) {
				preparedStatement.setInt(1, i+1);
				preparedStatement.setInt(2, custid[i]);
				preparedStatement.setInt(3, bookid[i]);
				preparedStatement.setInt(4, saleprice[i]);
				preparedStatement.setString(5, orderdate[i]);
				final int row = preparedStatement.executeUpdate();
				System.out.println("저장된 행" + row);
			}
			
			preparedStatement.close();
		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
			System.out.printf("%s\r\n", e.getMessage());
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				connect.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
