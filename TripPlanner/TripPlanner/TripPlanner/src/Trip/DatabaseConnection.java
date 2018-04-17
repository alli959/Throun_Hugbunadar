package Trip;

import java.sql.*;
import java.util.ArrayList;

public class DatabaseConnection {
    private String DBurl = "jdbc:sqlite:daytrips.db";
    private Connection DBconn;

    public DatabaseConnection() {

    }

    private Connection getConnection() throws Exception {
        try {
            Class.forName("org.sqlite.JDBC");
            DBconn = DriverManager.getConnection(DBurl);
        } catch(SQLException e) {
            System.out.println(e);
        }

        return DBconn;
    }

    public ArrayList<String> executeQuery(String query) throws Exception {
        Connection conn = null;
        ArrayList<String> resultList = null;
        try {
            conn = getConnection();
            Statement stmt = conn.createStatement();
            ResultSet results = stmt.executeQuery(query);
            ResultSetMetaData rsmd = results.getMetaData();
            int columnCount = rsmd.getColumnCount();

            resultList = new ArrayList<>(columnCount);
            while (results.next()) {
                int i = 1;
                while(i <= columnCount) {
                    resultList.add(results.getString(i++));
                }
            }

        } catch(SQLException e) {
            System.err.println(e.getMessage());
        } finally {
            try {
                if(conn != null)
                    conn.close();
            }
            catch(SQLException e) {
                System.err.println(e);
            }
        }
        return resultList;
    }

    public void executeUpdate(String query) throws Exception {
        Connection conn = null;
        ArrayList<String> resultList = null;
        try {
            conn = getConnection();
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(query);
        } catch(SQLException e) {
            System.err.println(e.getMessage());
        } finally {
            try {
                if(conn != null)
                    conn.close();
            }
            catch(SQLException e) {
                System.err.println(e);
            }
        }
    }
}
