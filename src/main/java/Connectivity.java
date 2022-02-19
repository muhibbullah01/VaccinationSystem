import java.sql.*;

public class Connectivity {
    static Connection con;
    public static Connection create() throws Exception {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/covid","root","root");

        }catch (Exception e){
            System.out.println(e);
        }
        return con;
    }
}
