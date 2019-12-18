import java.sql.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2019-12-18
 * Time: 20:08
 **/
public class Main2 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //1.注册Driver
        Class.forName("com.mysql.jdbc.Driver");
        //2.
        String url = "jdbc:mysql://127.0.0.1:3306/sql_20191218?useSSL=false";
        String username = "root";
        String password = "";
        Connection connection = DriverManager.getConnection(
                url,
                username,
                password
        );
        Statement statement = connection.createStatement();
        String sql = "SELECT id, username FROM users ORDER BY id";
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            int id = resultSet.getInt(1);
            String name = resultSet.getString(2);
            System.out.println(id + " " +name);
        }

        resultSet.close();
        statement.close();
        connection.close();
    }
}
