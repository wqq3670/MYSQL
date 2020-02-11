import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;




/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-02-11
 * Time: 16:45
 **/
public class Main {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");//注册Driver
        String url = "jdbc:mysql://172.0.0.1:3306/test20_0211?useSSL=false&characterEncoding=utf8";
        String uesername = "root";
        String password = "";
        Connection connection = DriverManager.getConnection(
                url,uesername,password
        );
        Scanner scanner = new Scanner(System.in);
        while (true) {
            menu();

            int select = scanner.nextInt();
            scanner.nextLine();//

            switch (select) {
                case 1 :
                    register();
                    break;
            }
        }
    }

    private static void register() {


    }

    private static void menu() {
        System.out.println("========================");
        System.out.println("======1.用户注册========");
        System.out.println("======2.用户登录========");
        System.out.println("======3.发表文章========");
        System.out.println("======4.文章的列表页====");
        System.out.println("======5.文章的详情页====");
        System.out.println("========================");
    }
}
