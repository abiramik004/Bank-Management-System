import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import javax.sql.*;
class projectacc8 extends projectacc7 
{
public void fun3( String m17,String m18)
{
try
{
m18="";
Class.forName("com.mysql.jdbc.Driver"); 
con=DriverManager.getConnection( 
"jdbc:mysql://localhost:3306/bank","root",
"Malathi@123");
st=con.createStatement();
rs=st.executeQuery("select pin_no from 
details1");
while(rs.next())
{
String sql = "SELECT Acc_no FROM 
Details1 WHERE pin_no=?";
 ps=con.prepareStatement(sql);
 ps.setString(1,m17);
rs=ps.executeQuery();
if(rs.next())
{
m18=m18+rs.getString("Acc_no");
}
}
}
catch(Exception e43)
{
System.out.println(e43);
}
}
}s