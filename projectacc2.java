import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.sql.*;
import java.sql.*;
class projectacc2 extends projectacc1 
implements ActionListener
{
public void fun()
{
jf1=new JFrame();
l121=new JLabel(" BANK OF INX");
l121.setBounds(500,50,350,60);
l121.setFont(f2);
l121.setBackground(Color.PINK);
l121.setForeground(Color.BLACK);
l121.setOpaque(true);
jf1.add(l121);
l1=new JLabel("User Id ");
l1.setBounds(300,200,200,30);
l1.setFont(f1);
l1.setBackground(Color.WHITE);
l1.setForeground(Color.BLACK);
l1.setOpaque(true);
jf1.add(l1);
t1=new JTextField();
t1.setBounds(550,200,200,30);
t1.setFont(f1);
t1.setBackground(Color.WHITE);
t1.setForeground(Color.BLACK);
jf1.add(t1);
l2=new JLabel("Password");
l2.setBounds(300,250,200,30);
l2.setBounds(300,250,200,30);
l2.setFont(f1);
l2.setBackground(Color.WHITE);
l2.setForeground(Color.BLACK);
l2.setOpaque(true);
jf1.add(l2);
pf=new JPasswordField();
pf.setBounds(550,250,200,30);
pf.setFont(f1);
pf.setBackground(Color.WHITE);
pf.setForeground(Color.BLACK);
jf1.add(pf);
b1=new JButton("LogIn");
b1.setBounds(300,320,100,30);
b1.setBackground(Color.ORANGE);
b1.setForeground(Color.BLACK);
b1.setFont(f1);
jf1.add(b1);
b2=new JButton("Create");
b2.setBounds(530,320,100,30);
b2.setBackground(Color.ORANGE);
b2.setForeground(Color.BLACK);
b2.setFont(f1);
jf1.add(b2);
b1.addActionListener(this);
b2.addActionListener(this);
JLabel mm=new JLabel(new 
ImageIcon("k1.jpg"));
jf1.getContentPane().add(mm);
jf1.pack();
jf1.setVisible(true);
}
public void actionPerformed(ActionEvent 
e)
{
a=t1.getText();
b=pf.getText();
try
{
if(e.getSource()==b1)
{
Class.forName("com.mysql.jdbc.Driver"); 
con=DriverManager.getConnection( 
"jdbc:mysql://localhost:3306/bank","root",
"Malathi@123"); 
st=con.createStatement();
rs=st.executeQuery("select * from 
details");
while(rs.next())
{
c=rs.getString("UserId");
d=rs.getString("password");
if((c.equals(a))&&(d.equals(b)))
{
t=1;
jf1.setVisible(false);
projectacc3 ob=new projectacc3();
ob.cal();
}
}
if(t!=1)
{
if((a.equals(" "))||(b.equals(" 
")))
{
JOptionPane.showMessageDialog(jf1,"fill
the 
box","Warning",JOptionPane.WARNING
_MESSAGE);
}
if((!a.equals(c))&&(!b.equals(d)))
{
JOptionPane.showMessageDialog(jf1,"Cr
eate Your 
Accont!","Warning",JOptionPane.WARNI
NG_MESSAGE);
}
}
}
}
catch(Exception e1)
{
System.out.println(e1);
}
try
{
if(e.getSource()==b2)
{
Class.forName("com.mysql.jdbc.Driver"); 
con=DriverManager.getConnection( 
"jdbc:mysql://localhost:3306/bank","root",
"Malathi@123"); 
if((!a.equals(" "))||(!b.equals(" ")))
{
ps=con.prepareStatement("insert into 
Details(UserId,password)values(?,?)");
ps.setString(1,a);
ps.setString(2,b);
int x=ps.executeUpdate();
if(x>0)
{
JOptionPane.showMessageDialog(jf1,"acc
ount 
created","Warning",JOptionPane.WARNI
NG_MESSAGE);
}
else
{
JOptionPane.showMessageDialog(jf1,"acc
ount is not 
created","Warning",JOptionPane.WARNI
NG_MESSAGE);
}
}
}
}
catch(Exception e2)
{
System.out.println(e2);
}
}
}