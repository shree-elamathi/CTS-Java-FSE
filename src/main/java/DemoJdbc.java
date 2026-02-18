import java.sql.*;

public class DemoJdbc {

    public static void main(String[] args) throws SQLException {
        String url ="jdbc:mysql://localhost:3306/school";
        String username = "root";
        String pass = "elamathi123";

        String query = "select * from student";

        Connection conn = DriverManager.getConnection(url,username,pass);
        System.out.println("Connection established");
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(query);
        while (rs.next()){
            System.out.println(rs.getInt("stud_ID") + " "+rs.getString("stud_name"));
            
        }
        System.out.println(rs.next());

        conn.close();
        System.out.println("Connection closed");


    }

}
