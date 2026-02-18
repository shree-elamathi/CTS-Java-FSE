import java.sql.*;


// To do statis changes
//contains query and pre defined values in query
public class DemoJdbc {
    public static void main(String[] args) throws SQLException {
        String url ="jdbc:mysql://localhost:3306/school";
        String username = "root";
        String pass = "elamathi123";


        Connection conn = DriverManager.getConnection(url,username,pass);
        System.out.println("Connection established");
        Statement st = conn.createStatement();

//      To fetch data
//        String query = "select * from student";
//        ResultSet rs = st.executeQuery(query);
//        while (rs.next()){
//            System.out.println(rs.getInt("stud_ID") + " "+rs.getString("stud_name"));
//
//        }
//        System.out.println(rs.next());


//        To insert data
//        String query = "insert into student values(207,'Nimisha',460)";
//        boolean status = st.execute(query); this gives output based on the query
//        System.out.println(status);


//        To update data
//        String query = "update student set stud_name = 'Aishu' where stud_ID = 200";
//        int status = st.executeUpdate(query);
//        System.out.println(status);

//        To delete
//        String query = "delete from student where stud_ID = 207";
//        st.execute(query);


        conn.close();
        System.out.println("Connection closed");


    }

}
