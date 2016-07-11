<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.sql.*,com.ethan.web.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Create Movie Database</title>
</head>
<body>
<%
Connection con = null;
Statement st = null;
int rs = 0;

//updated this URL to matcht the name of the new schema I created in MySQL
String url = "jdbc:mysql://localhost:3306/movies";
//DO NOT include this info in .java files pushed to GitHub in real projects
//updated this users priveleges in MySQL
String user = "java";
String password = "java123";

Movie movie = null;

//had to import the ArrayList class a little differently here

try {
	Class.forName("com.mysql.jdbc.Driver");
    con = DriverManager.getConnection(url, user, password);
    st = con.createStatement();
    
    //create query statement - use ? to the values so that it can call the perpared statement
    String query = "INSERT INTO movies VALUES (?, ?, ?)";
    
    PreparedStatement insertStatement = con.prepareStatement(query);
    
    for (int i = 1; i <= 100; i++) {
		//because getMovie is a static method I can invoke it on the class as a whole, don't need to instantiate an object
		//storing in the for loop as "movie"
		movie = MovieIO.getMovie(i);
		insertStatement.setInt(1, movie.getMovieiD());
		insertStatement.setString(2, movie.getTitle());
		insertStatement.setString(3, movie.getCategory());
		insertStatement.executeUpdate();
		
		
		//I want to make sure that these variables will be inserted 
    
    	//st.executeUpdate(query);
    }
    		
} catch (SQLException e) {
    out.println("DB Exception: " + e);

} finally {
    try {
    	//con.commit();
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
</body>
</html>