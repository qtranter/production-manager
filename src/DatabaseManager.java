import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabaseManager {
    static final String JDBC_DRIVER = "org.h2.Driver";
    static final String DB_URL = "jdbc:h2:D:/trant/Documents/Java Practice/OraclProduction/res/userDatabase";
    private Connection con;

    public DatabaseManager() throws SQLException {
        con = DriverManager.getConnection(DB_URL, "", "");
    }

    public void insert(String type, String manufacturer, String name) {
        try {
            //String sql = "INSERT INTO " + table + " VALUES (?, ?, ?)";
            String sql = "INSERT INTO PRODUCT(type, manufacturer, name) VALUES (?, ?, ?)";

            PreparedStatement insertUser = con.prepareStatement(sql);

            insertUser.setString(1, type);
            insertUser.setString(2, manufacturer);
            insertUser.setString(3, name);

            insertUser.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
