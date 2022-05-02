package  JDBC;

import java.sql.*;

public class JDBC {
    public static void main (String args []) throws SQLException {

        String url = "jdbc:mysql://localhost:3306/university";
        String username = "root";
        String password = "valarMorgolis125";
        String query = "select * from EngineeringStudent";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            Connection con = DriverManager.getConnection(url, username, password);
            Statement statement = con.createStatement();

            ResultSet result = statement.executeQuery(query);
            ResultSetMetaData resultSetMeta = result.getMetaData();
            int column_count = resultSetMeta.getColumnCount();

            while (result.next()) {
                String data = "";

                // 6 is the number of column
                for (int i = 1; i <= column_count; i++) {
                    data += result.getString(i) + " : ";
                }

                System.out.println(data);
            }

            System.out.println("-------------");
            System.out.println("End");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
