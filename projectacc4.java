import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.sql.*;
import java.sql.*;
class projectacc4 extends projectacc3 
implements ActionListener
{
public void cal1()
{
jf3=new JFrame();
l4=new JLabel("Name ");
l4.setBounds(100,200,200,30);
l4.setFont(f1);
l4.setBackground(Color.BLACK);
l4.setForeground(Color.WHITE); 
l4.setOpaque(true);
jf3.add(l4);
t3=new JTextField();
t3.setBounds(350,200,200,30);
t3.setFont(f1);
t3.setBackground(Color.BLACK);
t3.setForeground(Color.WHITE);
jf3.add(t3);
l5=new JLabel("Fathername ");
l5.setBounds(100,250,200,30);
l5.setFont(f1);
l5.setBackground(Color.BLACK);
l5.setForeground(Color.WHITE);
l5.setOpaque(true);
jf3.add(l5);
t4=new JTextField();
t4.setBounds(350,250,200,30);
t4.setFont(f1);
t4.setBackground(Color.BLACK);
t4.setForeground(Color.WHITE);
jf3.add(t4);
l6=new JLabel("DOB ");
l6.setBounds(100,300,200,30);
l6.setFont(f1);
l6.setBackground(Color.BLACK);
l6.setForeground(Color.WHITE);
l6.setOpaque(true);
jf3.add(l6);
t11=new JTextField();
t11.setBounds(350,300,200,30);
t11.setFont(f1);
t11.setBackground(Color.BLACK);
t11.setForeground(Color.WHITE);
jf3.add(t11);
l9=new JLabel("Phone_no ");
l9.setBounds(100,350,200,30);
l9.setFont(f1);
l9.setBackground(Color.BLACK);
l9.setForeground(Color.WHITE);
l9.setOpaque(true);
jf3.add(l9);
t5=new JTextField();
t5.setBounds(350,350,200,30);
t5.setFont(f1);
t5.setBackground(Color.BLACK);
t5.setForeground(Color.WHITE);
jf3.add(t5);
l7=new JLabel("Address");
l7.setBounds(100,450,200,30);
l7.setFont(f1);
l7.setBackground(Color.BLACK);
l7.setForeground(Color.WHITE);
l7.setOpaque(true);
jf3.add(l7);
w1=new JTextArea();
w1.setBounds(350,450,200,100);
w1.setFont(f1);
w1.setBackground(Color.BLACK);
w1.setForeground(Color.WHITE);
jf3.add(w1);
l8=new JLabel("Gender");
l8.setBounds(100,400,200,30);
l8.setFont(f1);
l8.setBackground(Color.BLACK);
l8.setForeground(Color.WHITE);
l8.setOpaque(true);
jf3.add(l8);
q1=new JRadioButton("MALE");
q2=new JRadioButton("FEMALE");
q1.setBounds(350,400,100,30);
q2.setBounds (500,400,150,30);
q1.setBackground(Color.BLACK);
q1.setForeground(Color.WHITE);
q2.setBackground(Color.BLACK);
q2.setForeground(Color.WHITE);
re=new ButtonGroup();
re.add(q1);
re.add(q2);
jf3.add(q1);
jf3.add(q2);
l10=new JLabel("Aadhar_no");
l10.setBounds(700,200,200,30);
l10.setFont(f1);
l10.setBackground(Color.BLACK);
l10.setForeground(Color.WHITE);
l10.setOpaque(true);
jf3.add(l10);
t6=new JTextField();
t6.setBounds(950,200,200,30);
t6.setFont(f1);
t6.setBackground(Color.BLACK);
t6.setForeground(Color.WHITE);
jf3.add(t6);
l11=new JLabel("Acc_no");
l11.setBounds(700,250,200,30);
l11.setFont(f1);
l11.setBackground(Color.BLACK);
l11.setForeground(Color.WHITE);
l11.setOpaque(true);
jf3.add(l11);
t7=new JTextField();
t7.setBounds(950,250,200,30);
t7.setFont(f1);
t7.setBackground(Color.BLACK);
t7.setForeground(Color.WHITE);
jf3.add(t7);
l12=new JLabel("Balance");
l12.setBounds(700,300,200,30);
l12.setFont(f1);
l12.setBackground(Color.BLACK);
l12.setForeground(Color.WHITE);
l12.setOpaque(true);
jf3.add(l12);
t8=new JTextField();
t8.setBounds(950,300,200,30);
t8.setFont(f1);
t8.setBackground(Color.BLACK);
t8.setForeground(Color.WHITE);
jf3.add(t8);
l13=new JLabel("Pin_no");
l13.setBounds(700,350,200,30);
l13.setFont(f1);
l13.setBackground(Color.BLACK);
l13.setForeground(Color.WHITE);
l13.setOpaque(true);
jf3.add(l13);
t9=new JTextField();
t9.setBounds(950,350,200,30);
t9.setFont(f1);
t9.setBackground(Color.BLACK);
t9.setForeground(Color.WHITE);
jf3.add(t9);
l14=new JLabel("CustomerID");
l14.setBounds(700,400,200,30);
l14.setFont(f1);
l14.setBackground(Color.BLACK);
l14.setForeground(Color.WHITE);
l14.setOpaque(true);
jf3.add(l14);
t10=new JTextField();
t10.setBounds(950,400,200,30);
t10.setFont(f1);
t10.setBackground(Color.BLACK);
t10.setForeground(Color.WHITE);
jf3.add(t10);
b5=new JButton("Submit");
b5.setBounds(800,600,200,30);
b5.setBackground(Color.BLUE);
b5.setForeground(Color.BLACK);
b5.setFont(f1);
jf3.add(b5);
b61=new JButton("BACK");
b61.setBounds(800,650,200,50);
b61.setBackground(Color.ORANGE);
b61.setForeground(Color.BLACK);
b61.setFont(f1);
jf3.add(b61);
b5.addActionListener(this);
b61.addActionListener(this);
JLabel mm=new JLabel(new 
ImageIcon("k22.jpg"));
jf3.getContentPane().add(mm);
jf3.pack();
jf3.setVisible(true);
}
 public void actionPerformed(ActionEvent
e5)
{
try
{
if(e5.getSource()==b61)
{
jf3.setVisible(false);
projectacc3 ob67=new projectacc3();
ob67.cal();
}
m1=t3.getText();
m2=t4.getText();
m3=t11.getText();
m4=w1.getText();
m5=Integer.parseInt(t5.getText());
m6=Integer.parseInt(t6.getText());
m7=Integer.parseInt(t7.getText());
m8=Integer.parseInt(t8.getText());
m9=Integer.parseInt(t9.getText());
m10=Integer.parseInt(t10.getText());
if(q1.isSelected())
{
ff=q1.getText();
System.out.println(ff);
}
else if(q2.isSelected())
{
ff=q2.getText();
System.out.println(ff);
}
if(e5.getSource()==b5)
{
Class.forName("com.mysql.jdbc.Driver"); 
con=DriverManager.getConnection( 
"jdbc:mysql://localhost:3306/bank","root",
"Malathi@123"); 
st=con.createStatement();
System.out.println("name:"+m1+"\n"+"Fa
thername:"+m2+"\n"+"Address:"+m4+"\n
"+"DOB:"+m3);
System.out.println("phone_no:"+m5+"\n"
+"Aadhar_no:"+m6+"\n"+"Acc_no:"+m7
+"\n"+"Balance:"+m8+"\n"+"Pin_no:"+m
9+"\n"+"CustomerID:"+m10); 
ps=con.prepareStatement("insert into 
Details1(Name,Fathername,dob,Address,
Gender,Phone_no,Aadhar_no,Acc_no,Bal
ance,Pin_no,CustomerID)values(?,?,?,?,?,
?,?,?,?,?,?)");
ps.setString(1,m1);
ps.setString(2,m2);
ps.setString(3,m3);
ps.setString(4,m4);
ps.setString(5,ff);
ps.setInt(6,m5);
ps.setInt(7,m6);
ps.setInt(8,m7);
ps.setInt(9,m8);
ps.setInt(10,m9);
ps.setInt(11,m10);
int x=ps.executeUpdate();
if(x>0)
System.out.println("insert");
else
System.out.println("not insert");
}
if(e5.getSource()==b5)
{
JOptionPane.showMessageDialog(jf5,"AC
COUNT 
CREATED","Warning",JOptionPane.WAR
NING_MESSAGE);
}
}
catch(Exception e0)
{
System.out.println(e0);
}
}
}