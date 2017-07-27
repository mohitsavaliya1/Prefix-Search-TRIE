package javaapplication8;

import java.sql.*;

public class JavaApplication8 {

  
    public static void main(String[] args) {
        try{
            String query = "SELECT * FROM A.ARTIST;";
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        
        Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Search words", "a", "a");
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
        
        rs.next();
        
        String sname = rs.getString(1);
        System.out.println(sname);
      
        con.close();
        }
        catch(Exception e){
       
        }
    }
}
