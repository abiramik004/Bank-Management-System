import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import javax.sql.*;
class projectacc5 extends projectacc4 
implements ActionListener
{
public void fun1(int gh)
{
m20=gh;
jf4=new JFrame();
//*********************************
*deposit***************************
*
b6=new JButton("DEPOSIT");
b6.setBounds(200,200,200,80);
b6.setBackground(Color.BLACK);
b6.setForeground(Color.WHITE);
b6.setFont(f1);
b6.addActionListener(this);
jf4.add(b6);
//*********************************
*withdraw*************************
***
b7=new JButton("WITHDRAW");
b7.setBounds(450,200,200,80);
b7.setBackground(Color.BLACK);
b7.setForeground(Color.WHITE);
b7.setFont(f1);
b7.addActionListener(this);
jf4.add(b7);
//*********************************
checkbalance***********************
*****
b8=new JButton("CHECKBALANCE");
b8.setBounds(700,200,200,80);
b8.setBackground(Color.BLACK);
b8.setForeground(Color.WHITE);
b8.setFont(f1);
b8.addActionListener(this);
jf4.add(b8);
//*********************************
about****************************
b9=new JButton("ABOUT");
b9.setBounds(200,300,200,80);
b9.setBackground(Color.BLACK);
b9.setForeground(Color.WHITE);
b9.setFont(f1);
b9.addActionListener(this);
jf4.add(b9);
//*********************************
customer 
info****************************
b10=new JButton("CUSTOMER INFO");
b10.setBounds(450,300,200,80);
b10.setBackground(Color.BLACK);
b10.setForeground(Color.WHITE);
b10.setFont(f1);
b10.addActionListener(this);
jf4.add(b10);
b11=new JButton("ACCOUNT INFO");
b11.setBounds(700,300,200,80);
b11.setBackground(Color.BLACK);
b11.setForeground(Color.WHITE);
b11.setFont(f1);
b11.addActionListener(this);
jf4.add(b11);
b12=new JButton("EXIT");
b12.setBounds(450,550,200,50);
b12.setBackground(Color.DARK_GRAY)
;
b12.setForeground(Color.WHITE);
b12.setFont(f1);
b62=new JButton("BACK");
b62.setBounds(450,600,200,50);
b62.setBackground(Color.BLUE);
b62.setForeground(Color.WHITE);
b62.setFont(f1);
jf4.add(b62);
b12.addActionListener(this);
b62.addActionListener(this);
jf4.add(b12);
JLabel mm=new JLabel(new 
ImageIcon("y7.jpg"));
jf4.getContentPane().add(mm);
jf4.pack();
jf4.setVisible(true);
}
public void actionPerformed(ActionEvent 
e33)
{
try
{
if(e33.getSource()==b62)
{
jf4.setVisible(false);
projectacc3 ob54=new projectacc3();
ob54.cal();
}
}
catch(Exception pp)
{
System.out.println(pp);
}
//*********************************
***deposit*************************
******
if(e33.getSource()==b6)
{
jf4.setVisible(false);
jf5=new JFrame();
l38=new JLabel("CustomerID");
 l38.setBounds(200,150,200,40);
 l38.setFont(f1);
 l38.setBackground(Color.BLACK);
 l38.setForeground(Color.WHITE);
 l38.setOpaque(true);
 jf5.add(l38);
t34=new JTextField();
 t34.setBounds(450,150,200,40);
 t34.setFont(f1);
 t34.setBackground(Color.BLACK);
 t34.setForeground(Color.WHITE);
t34.setText(Integer.toString(m20));
 jf5.add(t34);
l15=new JLabel("Enter pin_no:");
 l15.setBounds(200,200,200,40);
 l15.setFont(f1);
 l15.setBackground(Color.BLACK);
 l15.setForeground(Color.WHITE);
 l15.setOpaque(true);
 jf5.add(l15);
t11=new JTextField();
 t11.setBounds(450,200,200,40);
 t11.setFont(f1);
 t11.setBackground(Color.BLACK);
 t11.setForeground(Color.WHITE);
 jf5.add(t11);
b34=new JButton("Enter");
b34.setBounds(800,200,200,30);
b34.setBackground(Color.BLUE);
b34.setForeground(Color.WHITE);
b34.setFont(f1);
jf5.add(b34);
l16=new JLabel("Acc_no:");
 l16.setBounds(200,250,200,40);
 l16.setFont(f1);
 l16.setBackground(Color.BLACK);
 l16.setForeground(Color.WHITE);
 l16.setOpaque(true);
 jf5.add(l16);
t12=new JTextField();
 t12.setBounds(450,250,200,40);
 t12.setFont(f1);
 t12.setBackground(Color.BLACK);
 t12.setForeground(Color.WHITE);
 jf5.add(t12);
l17=new JLabel("Enter amount");
 l17.setBounds(200,300,200,40);
 l17.setFont(f1);
 l17.setBackground(Color.BLACK);
 l17.setForeground(Color.WHITE);
 l17.setOpaque(true);
 jf5.add(l17);
t13=new JTextField();
 t13.setBounds(450,300,200,40);
 t13.setFont(f1);
 t13.setBackground(Color.BLACK);
 t13.setForeground(Color.WHITE);
 jf5.add(t13);
b13=new JButton("Deposit Amount");
b13.setBounds(700,380,200,50);
b13.setBackground(Color.BLUE);
b13.setForeground(Color.WHITE);
b13.setFont(f1);
jf5.add(b13);
b62=new JButton("BACK");
b62.setBounds(700,480,200,50);
b62.setBackground(Color.BLUE);
b62.setForeground(Color.WHITE);
b62.setFont(f1);
jf5.add(b62);
b13.addActionListener(this);
b62.addActionListener(this);
b34.addActionListener(this);
JLabel ki=new JLabel(new 
ImageIcon("k8.jpg"));
jf5.getContentPane().add(ki);
jf5.pack();
jf5.setVisible(true);
}
//*********************************
***withdraw***********************
********
if(e33.getSource()==b7)
{
jf4.setVisible(false);
jf6=new JFrame();
l39=new JLabel("CustomerID");
 l39.setBounds(200,150,200,40);
 l39.setFont(f1);
 l39.setBackground(Color.BLACK);
 l39.setForeground(Color.WHITE);
 l39.setOpaque(true);
 jf6.add(l39);
t35=new JTextField();
 t35.setBounds(450,150,200,40);
 t35.setFont(f1);
 t35.setBackground(Color.BLACK);
 t35.setForeground(Color.WHITE);
t35.setText(Integer.toString(m20));
 jf6.add(t35);
l18=new JLabel("Enter pin_no:");
 l18.setBounds(200,200,200,40);
 l18.setFont(f1);
 l18.setBackground(Color.BLACK);
 l18.setForeground(Color.WHITE);
 l18.setOpaque(true);
 jf6.add(l18);
t14=new JTextField();
 t14.setBounds(450,200,200,40);
 t14.setFont(f1);
 t14.setBackground(Color.BLACK);
 t14.setForeground(Color.WHITE);
 jf6.add(t14);
b35=new JButton("Enter");
b35.setBounds(700,200,200,30);
b35.setBackground(Color.BLUE);
b35.setForeground(Color.WHITE);
b35.setFont(f1);
jf6.add(b35);
l19=new JLabel("Acc_no:");
 l19.setBounds(200,250,200,40);
 l19.setFont(f1);
 l19.setBackground(Color.BLACK);
 l19.setForeground(Color.WHITE);
 l19.setOpaque(true);
 jf6.add(l19);
t15=new JTextField();
 t15.setBounds(450,250,200,40);
 t15.setFont(f1);
 t15.setBackground(Color.BLACK);
 t15.setForeground(Color.WHITE);
 jf6.add(t15);
l20=new JLabel("Enter Amount :");
 l20.setBounds(200,300,200,40);
 l20.setFont(f1);
 l20.setBackground(Color.BLACK);
 l20.setForeground(Color.WHITE);
 l20.setOpaque(true);
 jf6.add(l20);
t16=new JTextField();
 t16.setBounds(450,300,200,40);
 t16.setFont(f1);
 t16.setBackground(Color.BLACK);
 t16.setForeground(Color.WHITE);
 jf6.add(t16);
b14=new JButton("Withdraw Amount");
b14.setBounds(700,500,200,50);
b14.setBackground(Color.BLUE);
b14.setForeground(Color.WHITE);
b14.setFont(f1);
jf6.add(b14);
b63=new JButton("BACK");
b63.setBounds(700,600,200,50);
b63.setBackground(Color.BLUE);
b63.setForeground(Color.WHITE);
b63.setFont(f1);
jf6.add(b63);
b63.addActionListener(this);
b14.addActionListener(this);
b35.addActionListener(this);
JLabel pu=new JLabel(new 
ImageIcon("u8.jpg"));
jf6.getContentPane().add(pu);
jf6.pack();
jf6.setVisible(true);
}
//*********************************
***checkbalance********************
***********
if(e33.getSource()==b8)
{
jf4.setVisible(false);
jf7=new JFrame();
l21=new JLabel("CustomerID");
 l21.setBounds(150,200,200,40);
 l21.setFont(f1);
 l21.setBackground(Color.BLACK);
 l21.setForeground(Color.WHITE);
 l21.setOpaque(true);
 jf7.add(l21);
t17=new JTextField();
 t17.setBounds(400,200,200,40);
 t17.setFont(f1);
 t17.setBackground(Color.BLACK);
 t17.setForeground(Color.WHITE);
 jf7.add(t17);
b111=new JButton("Enter");
b111.setBounds(750,200,200,30);
b111.setBackground(Color.BLUE);
b111.setForeground(Color.WHITE);
b111.setFont(f1);
jf7.add(b111);
l23=new JLabel("BALANCE:");
 l23.setBounds(150,300,200,40);
 l23.setFont(f1);
 l23.setBackground(Color.BLACK);
 l23.setForeground(Color.WHITE);
 l23.setOpaque(true);
 jf7.add(l23);
t19=new JTextField();
 t19.setBounds(400,300,200,40);
 t19.setFont(f1);
 t19.setBackground(Color.BLACK);
 t19.setForeground(Color.WHITE);
 jf7.add(t19);
b15=new JButton("EXIT");
b15.setBounds(400,450,200,30);
b15.setBackground(Color.BLUE);
b15.setForeground(Color.WHITE);
b15.setFont(f1);
jf7.add(b15);
b64=new JButton("BACK");
b64.setBounds(400,550,200,50);
b64.setBackground(Color.BLUE);
b64.setForeground(Color.WHITE);
b64.setFont(f1);
jf7.add(b64);
b64.addActionListener(this);
b15.addActionListener(this);
b111.addActionListener(this);
JLabel lu=new JLabel(new 
ImageIcon("iu.jpg"));
jf7.getContentPane().add(lu);
jf7.pack();
jf7.setVisible(true);
}
//*********************************
***about**************************
*****
if(e33.getSource()==b9)
{
jf4.setVisible(false);
jf8=new JFrame();
jf8.getContentPane().setBackground(Colo
r.PINK);
jf8.setLayout(null);
jf8.setVisible(true);
w2=new JTextArea();
w2.setBounds(0,40,1000,300);
w2.setText("************************
*********************ABOUT 
US*******************************
***"+"\n"+"Bank of INX a Fortune 500 
company, is an Indian Multinational, 
Public Sector Banking"+"\n"+"and 
Financial services statutory body 
headquartered in Mumbai"+"\n"+"The rich
heritage and legacy of over 200 
years"+"\n"+" accredits INX as the most 
trusted Bank by Indians through 
generations"+"\n"+"INX, the largest 
Indian Bank with 1/4th market share, 
serves over 45 crore 
customers"+"\n"+"through its vast 
network of over 22,000 branches, 62617 
ATMs/ADWMs, 71,968 BC outlets, with 
an undeterred"+"\n"+"focus on innovation,
and customer centricity, which stems from
the core values of the Bank - 
Service"+"\n"+"Transparency, Ethics, 
Politeness and Sustainability"+"\n"+"Bank
of Baroda (UK) Limited is a 
wholly-owned subsidiary of Bank of 
Baroda and registered as a Limited 
Company in England 
&Wales"+"\n"+"Bank of INX Limited was
initially incorporated as INX Operations 
Limited on 
20/06/2017"+"\n"+"subsequently the name
was changed to Bank of INX Limited");
w2.setFont(f1);
w2.setBackground(Color.PINK);
w2.setForeground(Color.BLACK);
jf8.add(w2);
w3=new JTextArea();
w3.setBounds(0,400,1000,300);
w3.setText("Bank of INX Group Present 
day Bank of Baroda is the successor of the
erstwhile"+"\n"+"The Bank of INX 
Limited founded in 1908 in a small town 
by the great visionary the late 
Maharaja"+"\n"+"Sir Sayajirao 
Gaekwad-III. From its humble beginnings,
the Bank has grown, over the years, to 
emerge as an Indian Financial 
Powerhouse"+"\n"+"with a network of 
over 8,192 branches in India across the 
length and breadth of the country and 96 
overseas branches"+"\n"+"foreign offices 
in 18 countries serving a Global customer 
base of over 140 million"+"\n"+"Intune 
with times and in response to the emerging
market requirements"+"\n"+" the Bank has
set up specialized branches dedicated to 
specific Customer segments. Bank has 
also set-up specialised Retail"+"\n"+" 
Corporate and SME Loan factories across 
the country which work on assembly line 
principle to reduce 
turnaround"+"\n"+"time for sanction of 
retail and corporate loans");
w3.setFont(f1);
w3.setBackground(Color.PINK);
w3.setForeground(Color.BLACK);
jf8.add(w3);
b81=new JButton(new 
ImageIcon("s1.jpg"));
b81.setBounds(1100,90,200,200);
b81.setBackground(Color.BLUE);
b81.setForeground(Color.WHITE);
b81.setFont(f1);
jf8.add(b81);
b82=new JButton(new 
ImageIcon("s2.jpg"));
b82.setBounds(1150,300,200,200);
b82.setBackground(Color.BLUE);
b82.setForeground(Color.WHITE);
b82.setFont(f1);
jf8.add(b82);
b70=new JButton("BACK");
b70.setBounds(1200,600,100,50);
b70.setBackground(Color.BLUE);
b70.setForeground(Color.WHITE);
b70.setFont(f1);
jf8.add(b70);
b70.addActionListener(this);
}
if(e33.getSource()==b70)
{
jf8.setVisible(false);
jf4.setVisible(true);
}
//*********************************
***cutomerinfo*********************
**********
if(e33.getSource()==b10)
{
jf4.setVisible(false);
projectacc6 ob23=new projectacc6();
ob23.fun2();
}
//*********************************
***account 
info*******************************
if(e33.getSource()==b11)
{
jf4.setVisible(false);
projectacc7 ob43=new projectacc7();
ob43.cal3();
}
if(e33.getSource()==b12)
{
System.exit(0);
}
//*********************************
Enter 
account****************************
**
try
{
if(e33.getSource()==b62)
{
jf5.setVisible(false);
jf4.setVisible(true);
}
//m17=Integer.parseInt(t11.getText());
Class.forName("com.mysql.jdbc.Driver"); 
con=DriverManager.getConnection( 
"jdbc:mysql://localhost:3306/bank","root",
"Malathi@123");
st=con.createStatement();
if(e33.getSource()==b34)
{
System.out.println(m20);
String sql = "SELECT Acc_no,pin_no 
FROM details1 WHERE CustomerID=?";
 ps=con.prepareStatement(sql);
 ps.setString(1,t34.getText());
rs=ps.executeQuery();
if(rs.next())
{
t11.setText(rs.getString("pin_no"));
t12.setText(rs.getString("Acc_no"));
}
}
}
catch(Exception e68)
{
System.out.println(e68);
}
//*********************************
***dep amount*****************
try
{
if(e33.getSource()==b13)
{
m22=Integer.parseInt(t13.getText());
Class.forName("com.mysql.jdbc.Driver"); 
con=DriverManager.getConnection( 
"jdbc:mysql://localhost:3306/bank","root",
"Malathi@123");
st=con.createStatement();
String sql = "SELECT Balance FROM 
details1 WHERE CustomerID=?";
 ps=con.prepareStatement(sql);
 ps.setString(1,t34.getText());
rs=ps.executeQuery();
if(rs.next())
{
m21=rs.getInt("Balance");
m21=m21+m22;
System.out.println(m21);
JOptionPane.showMessageDialog(jf5,"A
MOUNT 
DEPOSITED","Warning",JOptionPane.W
ARNING_MESSAGE);
}
Class.forName("com.mysql.jdbc.Driver"); 
con=DriverManager.getConnection( 
"jdbc:mysql://localhost:3306/bank","root",
"Malathi@123");
st=con.createStatement();
ps=con.prepareStatement("update details1 
set Balance=? where CustomerID=?");
ps.setInt(1,m21);
ps.setInt(2,m20);
int x=ps.executeUpdate();
if(x>0)
{
System.out.println("Updated");
}
else
{
System.out.println("Not Updated");
}
}
}
catch(Exception e90)
{
System.out.println(e90);
}
//*********************************
***withdraw***********************
*************
try
{
if(e33.getSource()==b63)
{
jf6.setVisible(false);
jf4.setVisible(true);
}
Class.forName("com.mysql.jdbc.Driver"); 
con=DriverManager.getConnection( 
"jdbc:mysql://localhost:3306/bank","root",
"Malathi@123");
st=con.createStatement();
if(e33.getSource()==b35)
{
String sql = "SELECT Acc_no,pin_no 
FROM Details1 WHERE 
CustomerID=?";
 ps=con.prepareStatement(sql);
 ps.setString(1,t35.getText());
rs=ps.executeQuery();
if(rs.next())
{
t14.setText(rs.getString("pin_no"));
t15.setText(rs.getString("Acc_no"));
}
}
}
catch(Exception e69)
{
System.out.println(e69);
}
try
{
if(e33.getSource()==b14)
{
n11=Integer.parseInt(t16.getText());
Class.forName("com.mysql.jdbc.Driver"); 
con=DriverManager.getConnection( 
"jdbc:mysql://localhost:3306/bank","root",
"Malathi@123");
st=con.createStatement();
String sql = "SELECT Balance FROM 
Details1 WHERE CustomerID=?";
 ps=con.prepareStatement(sql);
 ps.setString(1,t35.getText());
rs=ps.executeQuery();
if(rs.next())
{
m21=rs.getInt("Balance");
m21=m21-n11;
System.out.println(m21);
JOptionPane.showMessageDialog(jf6,"A
MOUNT 
WITHDRAWN","Warning",JOptionPane.
WARNING_MESSAGE);
}
Class.forName("com.mysql.jdbc.Driver"); 
con=DriverManager.getConnection( 
"jdbc:mysql://localhost:3306/bank","root",
"Malathi@123");
st=con.createStatement();
ps=con.prepareStatement("update details1 
set Balance=? where CustomerID=?");
ps.setInt(1,m21);
ps.setInt(2,m20);
int x=ps.executeUpdate();
if(x>0)
{
System.out.println("Updated");
}
else
{
System.out.println("Not Updated");
}
}
}
catch(Exception e69)
{
System.out.println(e69);
}
//*********************************
*****check 
balance****************************
*
try
{
if(e33.getSource()==b64)
{
jf7.setVisible(false);
jf4.setVisible(true);
}
Class.forName("com.mysql.jdbc.Driver"); 
con=DriverManager.getConnection( 
"jdbc:mysql://localhost:3306/bank","root",
"Malathi@123");
st=con.createStatement();
if(e33.getSource()==b111)
{
String sql = "SELECT pin_no,Balance 
FROM Details1 WHERE 
CustomerID=?";
 ps=con.prepareStatement(sql);
 ps.setString(1,t17.getText());
rs=ps.executeQuery();
if(rs.next())
{
t19.setText(rs.getString("Balance"));
}
}
}
catch(Exception e699)
{
System.out.println(e699);
}
if(e33.getSource()==b15)
{
jf7.setVisible(false);
}
}
}