import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.sql.*;
import java.sql.*;
class projectacc6 extends projectacc5 
implements ActionListener
{
public void fun2()
{
jf9=new JFrame();
l24=new JLabel("CustomerID");
l24.setBounds(250,200,200,30);
l24.setFont(f1);
l24.setBackground(Color.BLACK);
l24.setForeground(Color.WHITE);
l24.setOpaque(true);
jf9.add(l24);
t20=new JTextField();
t20.setBounds(500,200,200,30);
t20.setFont(f1);
t20.setBackground(Color.BLACK);
t20.setForeground(Color.WHITE);
jf9.add(t20);
b16=new JButton("Submit");
b16.setBounds(750,200,200,30);
b16.setBackground(Color.BLUE);
b16.setForeground(Color.WHITE);
b16.setFont(f1);
jf9.add(b16);
b16.addActionListener(this);
l25=new JLabel("Name ");
l25.setBounds(350,250,200,30);
l25.setFont(f1);
l25.setBackground(Color.YELLOW);
l25.setForeground(Color.BLACK);
l25.setOpaque(true);
jf9.add(l25);
t21=new JTextField();
t21.setBounds(600,250,200,30);
t21.setFont(f1);
t21.setBackground(Color.YELLOW);
t21.setForeground(Color.BLACK);
jf9.add(t21);
l26=new JLabel("Fathername ");
l26.setBounds(350,300,200,30);
l26.setFont(f1);
l26.setBackground(Color.YELLOW);
l26.setForeground(Color.BLACK);
l26.setOpaque(true);
jf9.add(l26);
t22=new JTextField();
t22.setBounds(600,300,200,30);
t22.setFont(f1);
t22.setBackground(Color.YELLOW);
t22.setForeground(Color.BLACK);
jf9.add(t22);
l27=new JLabel("Gender");
l27.setBounds(350,350,200,30);
l27.setFont(f1);
l27.setBackground(Color.YELLOW);
l27.setForeground(Color.BLACK);
l27.setOpaque(true);
jf9.add(l27);
t23=new JTextField();
t23.setBounds(600,350,200,30);
t23.setFont(f1);
t23.setBackground(Color.YELLOW);
t23.setForeground(Color.BLACK);
jf9.add(t23);
l28=new JLabel("Acc_no");
l28.setBounds(350,400,200,30);
l28.setFont(f1);
l28.setBackground(Color.YELLOW);
l28.setForeground(Color.BLACK);
l28.setOpaque(true);
jf9.add(l28);
t24=new JTextField();
t24.setBounds(600,400,200,30);
t24.setFont(f1);
t24.setBackground(Color.YELLOW);
t24.setForeground(Color.BLACK);
jf9.add(t24);
l29=new JLabel("Balance");
l29.setBounds(350,450,200,30);
l29.setFont(f1);
l29.setBackground(Color.YELLOW);
l29.setForeground(Color.BLACK);
l29.setOpaque(true);
jf9.add(l29);
t25=new JTextField();
t25.setBounds(600,450,200,30);
t25.setFont(f1);
t25.setBackground(Color.YELLOW);
t25.setForeground(Color.BLACK);
jf9.add(t25);
b65=new JButton("BACK");
b65.setBounds(600,550,200,50);
b65.setBackground(Color.BLUE);
b65.setForeground(Color.WHITE);
b65.setFont(f1);
jf9.add(b65);
b16.addActionListener(this);
b65.addActionListener(this);
JLabel jh=new JLabel(new 
ImageIcon("i55.jpg"));
jf9.getContentPane().add(jh);
jf9.pack();
jf9.setVisible(true);
}
public void actionPerformed(ActionEvent 
e21)
{
m13=Integer.parseInt(t20.getText());
if(e21.getSource()==b65)
{
jf9.setVisible(false);
projectacc5 ob23=new projectacc5();
ob23.fun1(m13);
}
try
{
Class.forName("com.mysql.jdbc.Driver"); 
con=DriverManager.getConnection( 
"jdbc:mysql://localhost:3306/bank","root",
"Malathi@123");
st=con.createStatement();
if(e21.getSource()==b16)
{
String sql = "SELECT 
Name,Fathername,Gender,Acc_no,Balanc
e FROM Details1 WHERE CustomerID 
=?";
 ps=con.prepareStatement(sql);
 ps.setString(1,t20.getText());
rs=ps.executeQuery();
if(rs.next())
{
t21.setText(rs.getString("Name"));
t22.setText(rs.getString("Fathername"));
t23.setText(rs.getString("Gender"));
t24.setText(Integer.toString(rs.getInt("Acc
_no")));
t25.setText(Integer.toString(rs.getInt("Bala
nce")));
}
}
}
catch(Exception e67)
{
System.out.println(e67);
}
}
}