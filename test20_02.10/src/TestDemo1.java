import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-02-10
 * Time: 11:40
 **/
public class TestDemo1 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://127.0.0.1:3306/test20_0210?useSSL=false&characterEncoding=utf8";
        String user = "root";//连接mysql的用户名
        String password = "";//连接mysql的密码
        Connection connection = DriverManager.getConnection(
                url, user, password
        );
        /*
        //1.INSERT 插入语句
        Statement statement = connection.createStatement();
        String sql = "INSERT INTO student(id,name,score)VALUES(1,'吴世勋',20)";
        statement.executeUpdate(sql);//通过statement对象来执行sql语句
        statement.close();
        */

        /*
        //2.UPDATE 修改语句
        Statement statement = connection.createStatement();
        String sql = "UPDATE student SET id = 0 WHERE name = 'xxx'";
        statement.executeUpdate(sql);
        statement.close();
         */

        /*
        //3.DELETE 删除语句
        Statement statement = connection.createStatement();
        String sql = "DELETE FROM student WHERE id = 0";
        statement.executeUpdate(sql);
        statement.close();
        */

        //SELECT 选择语句
        //1.插入一些数据 共SELECT使用
        {
            Statement statement = connection.createStatement();
            String sql = "INSERT INTO student (id,name,score)VALUES(2,'边伯贤',66),(3,'朴灿烈',88)";
            statement.executeUpdate(sql);
            statement.close();
        }
        //2.执行SELECT 语句
        {
            Statement statement = connection.createStatement();
            String sql = "SELECT * FROM student";
            ResultSet resultSet = statement.executeQuery(sql);
            List<String> nameList = new ArrayList<>();
            while(resultSet.next()) {

                //1.需要不同类型，调用不同方法
                /*int id = resultSet.getInt("id");
                Long lo = resultSet.getLong();
                String name = resultSet.getString("name");
                */

                //
                /*int id = resultSet.getInt(1);//下表示从1开始的（可以通过下表获取）
                String name = resultSet.getString("name");//可以通过字段名称获取
                int score = resultSet.getInt(3);
                */
                int id = resultSet.getInt(1);
                String name = resultSet.getString("name");
                int score = resultSet.getInt(3);
                //结果集马上需要销毁，所以通过list保存结果
               nameList.add(name);
                System.out.println(id+","+name+","+score);
            }
            resultSet.close();//结果集用完需要立马销毁
            statement.close();
        }
        connection.close();

    }
}
