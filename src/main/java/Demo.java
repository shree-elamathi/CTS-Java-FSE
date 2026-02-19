import java.sql.*;
import java.util.*;

//To have dynamic values
//Have used Prepared Statement
public class Demo {
    public static void main(String[] args) throws SQLException {

        String url = "jdbc:mysql://localhost:3306/school";
        String user = "root";
        String pass = "elamathi123";
        Connection conn = DriverManager.getConnection(url,user,pass);

        int id = 207;
        String name = "Nimisha";
        int marks = 460;

        String query = "insert into student values(?,?,?)";

        PreparedStatement st = conn.prepareStatement(query);
        st.setInt(1,id);
        st.setString(2,name);
        st.setInt(3,marks);

        System.out.println(st.execute());

    }
}
