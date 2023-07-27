import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.sql.*;
import java.sql.*;
class projectacc7 extends projectacc6 
implements ActionListener
{
public void cal3()
{
jf10=new JFrame();
l34=new JLabel("CustomerID");
l34.setBounds(250,200,200,30);
l34.setFont(f1);
l34.setBackground(Color.BLACK);
l34.setForeground(Color.WHITE);
l34.setOpaque(true);
jf10.add(l34);
t30=new JTextField();
t30.setBounds(500,200,200,30);
t30.setFont(f1);
t30.setBackground(Color.BLACK);
t30.setForeground(Color.WHITE);
jf10.add(t30);
b17=new JButton("Submit");
b17.setBounds(750,200,200,30);
b17.setBackground(Color.BLUE);
b17.setForeground(Color.WHITE);
b17.setFont(f1);
jf10.add(b17);
l30=new JLabel("Acc_no");
l30.setBounds(350,250,200,30);
l30.setFont(f1);
l30.setBackground(Color.WHITE);
l30.setForeground(Color.BLACK);
l30.setOpaque(true);
jf10.add(l30);
t26=new JTextField();
t26.setBounds(600,250,200,30);
t26.setFont(f1);
t26.setBackground(Color.WHITE);
t26.setForeground(Color.BLACK);
jf10.add(t26);
l31=new JLabel("Balance");
l31.setBounds(350,300,200,30);
l31.setFont(f1);
l31.setBackground(Color.WHITE);
l31.setForeground(Color.BLACK);
l31.setOpaque(true);
jf10.add(l31);
t27=new JTextField();
t27.setBounds(600,300,200,30);
t27.setFont(f1);
t27.setBackground(Color.WHITE);
t27.setForeground(Color.BLACK);
jf10.add(t27);
l32=new JLabel("Pin_no");
l32.setBounds(350,350,200,30);
l32.setFont(f1);
l32.setBackground(Color.WHITE);
l32.setForeground(Color.BLACK);
l32.setOpaque(true);
jf10.add(l32);
t28=new JTextField();
t28.setBounds(600,350,200,30);
t28.setFont(f1);
t28.setBackground(Color.WHITE);
t28.setForeground(Color.BLACK);
jf10.add(t28);
b66=new JButton("BACK");
b66.setBounds(600,550,200,50);
b66.setBackground(Color.BLUE);
b66.setForeground(Color.WHITE);
b66.setFont(f1);
jf10.add(b66);
b17.addActionListener(this);
b66.addActionListener(this);
JLabel jp=new JLabel(new 
ImageIcon("kk.jpg"));
jf10.getContentPane().add(jp);
jf10.pack();
jf10.setVisible(true);
}
public void actionPerformed(ActionEvent 
e23)
{
try
{
if(e23.getSource()==b66)
{
jf10.setVisible(false);
projectacc5 ob29=new projectacc5();
ob29.fun1(m15);
}
m15=Integer.parseInt(t30.getText());
Class.forName("com.mysql.jdbc.Driver"); 
con=DriverManager.getConnection( 
"jdbc:mysql://localhost:3306/bank","root",
"Malathi@123");
st=con.createStatement();
if(e23.getSource()==b17)
{
String sql = "SELECT 
Acc_no,Balance,Pin_no FROM Details1 
WHERE CustomerID =?";
 ps=con.prepareStatement(sql);
 ps.setString(1,t30.getText());
rs=ps.executeQuery();
if(rs.next())
{
t26.setText(rs.getString("Acc_no"));
t27.setText(rs.getString("Balance"));
t28.setText(rs.getString("Pin_no"));
}
}
}
catch(Exception e68)
{
System.out.println(e68);
}
}
}