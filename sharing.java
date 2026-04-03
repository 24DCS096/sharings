import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class GetVideo extends HttpServlet {
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

    response.setContentType("application/json");

    try {
      Connection con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/youtube_db", "root", "");

      Statement st = con.createStatement();
      ResultSet rs = st.executeQuery("SELECT * FROM videos LIMIT 1");

      if (rs.next()) {
        String id = rs.getString("youtube_id");
        response.getWriter().write("{\"id\":\"" + id + "\"}");
      }

    } catch(Exception e) {
      e.printStackTrace();
    }
  }
}
