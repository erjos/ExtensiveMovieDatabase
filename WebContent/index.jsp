<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import = "java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Extensive Movie Database</title>
</head>
<body background = "Hollywood_Sign.jpg">
<%
Connection con = null;
Statement st = null;
ResultSet rs = null;

String category = request.getParameter("category");

String url = "jdbc:mysql://localhost:3306/movies";
//DO NOT include this info in .java files pushed to GitHub in real projects
String user = "java";
String password = "java123";

try {
	Class.forName("com.mysql.jdbc.Driver");
    con = DriverManager.getConnection(url, user, password);
    st = con.createStatement();
    
    String query = "SELECT * FROM movies WHERE category = ?";
    PreparedStatement insertStatement = con.prepareStatement(query);
    insertStatement.setString(1, category);
    rs = insertStatement.executeQuery();
    
    
  	//rs = st.executeQuery();
	
    out.println("<br><br><br><br><br><br><h1 align = 'center' style = font-family:Verdana;color:white>"+ category.toUpperCase() +"</h1> <form action = 'http://localhost:8080/ExtensiveMovieDatabase/Welcome.html' align='center'> <input type='submit' value = 'New Category'></form><br>");
    out.println("<table align='center'>");
    //while there's still another result
    boolean grey = false;
    while (rs.next()) {
    	if(grey)
    		out.println("<tr bgcolor=#AAAAAA>");
    	else
    		out.println("<tr bgcolor=#FFFFFF>");
    	grey = !grey; 
    	// flip it everytime
    	//basically it sets grey false - when grey is false it prints the row in black
    	//when it is true it prints it as grey - every loop it flips the boolean so that it alternates
    	//what are the numbers in here? How does it know
    			
    			//declare new variables and get the type as the "rs"
    		int id = rs.getInt(1);
    		String name = rs.getString(2);
    		String cat = rs.getString(3);
    		out.println("<td>"+ id + "</td><td>" + name + "</td><td> " + category + "</td><td> ");
    }
    out.println("</table>");
    
    		
} catch (SQLException e) {
    out.println("DB Exception: " + e);

} finally {
    try {
        if (rs != null) {
            rs.close();
        }
        if (st != null) {
            st.close();
        }
        if (con != null) {
            con.close();
        }

    } catch (SQLException e) {
    		out.println("DB Exception in finally: " + e);
    }
}

%>
<br>
<form action = "http://localhost:8080/ExtensiveMovieDatabase/Welcome.html" align="center">
<input type="submit" value = "New Category">
</form>

</body>
</html>