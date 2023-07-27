import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
public class projectacc3 extends 
projectacc2 implements ActionListener
{
public void cal()
{
jf2=new JFrame();
l122=new JLabel(" WELCOME TO 
BANK OF INX");
l122.setBounds(350,150,550,60);
l122.setFont(f2);
l122.setBackground(Color.WHITE);
l122.setForeground(Color.BLACK);
l122.setOpaque(true);
jf2.add(l122);
b3=new JButton("Create Account");
b3.setBounds(100,400,200,30);
b3.setBackground(Color.ORANGE);
b3.setForeground(Color.BLACK);
b3.setFont(f1);
jf2.add(b3);
 l3=new JLabel("Customer Id ");
 l3.setBounds(500,400,200,40);
 l3.setFont(f1);
 l3.setBackground(Color.BLACK);
 l3.setForeground(Color.WHITE);
 l3.setOpaque(true);
 jf2.add(l3);
t2=new JTextField();
t2.setBounds(750,400,200,30);
t2.setFont(f1);
t2.setBackground(Color.BLACK);
t2.setForeground(Color.WHITE);
jf2.add(t2);
b4=new JButton("Submit");
b4.setBounds(600,500,200,30);
b4.setBackground(Color.ORANGE);
b4.setForeground(Color.BLACK);
b4.setFont(f1);
jf2.add(b4);
b60=new JButton("BACK");
b60.setBounds(600,550,200,50);
b60.setBackground(Color.ORANGE);
b60.setForeground(Color.BLACK);
b60.setFont(f1);
jf2.add(b60);
b4.addActionListener(this);
b3.addActionListener(this);
b60.addActionListener(this);
JLabel mm=new JLabel(new 
ImageIcon("t5.png"));
jf2.getContentPane().add(mm);
jf2.pack();
jf2.setVisible(true);
}
public void actionPerformed(ActionEvent 
e5)
{
try
{
if(e5.getSource()==b60)
{
jf2.setVisible(false);
projectacc2 ob50=new projectacc2();
ob50.fun();
}
}
catch(Exception po)
{
System.out.println(po);
}
c1=Integer.parseInt(t2.getText());
try
{
if(e5.getSource()==b4)
{
Class.forName("com.mysql.jdbc.Driver"); 
con=DriverManager.getConnection( 
"jdbc:mysql://localhost:3306/bank","root",
"Malathi@123"); 
st=con.createStatement();
rs=st.executeQuery("select CustomerID 
from Details1");
while(rs.next())
{
a1=rs.getInt("CustomerID");
if((a1==c1))
{
r=1;
jf2.setVisible(false);
projectacc5 ob9=new projectacc5();
ob9.fun1(a1);
}
}
if(r!=1)
{
if((t2.getText().equals(" "))||(c1!=a1))
{
JOptionPane.showMessageDialog(jf2,"Cr
eate 
Account","Warning",JOptionPane.WARNI
NG_MESSAGE);
}
}
}
}
catch(Exception we)
{
System.out.println(we);
}
if(e5.getSource()==b3)
{
jf2.setVisible(false);
projectacc4 ob2=new projectacc4();
ob2.cal1();
}
}
}