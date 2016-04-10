
/*
<html><applet code="euclid.class" width=250 height=800>
</applet></html>	
*/

import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class euclid extends Applet implements ActionListener

{

Button b1;
Label l1;
Label l2;
TextField t1;
TextField t2;
TextArea op;

public void init()
{
setLayout(new FlowLayout(FlowLayout.LEFT,20,50));
op=new TextArea("GCD is .. ");
l1=new Label("Number 1:");
l2=new Label("Number 2:");
b1=new Button("Calculate");
t1=new TextField();
t2=new TextField();

add(l1);
add(t1);
add(l2);
add(t2);
add(b1);
b1.addActionListener(this);
op.setRows(30);
op.setColumns(50);
add(op);
}



int gcd(int a, int b)
{
if(a<0)
a=-a;
if(b<0)
b=-b;

if (a==0)
return b;
if(b==0)
return a;


return gcd(b,a%b);
}


public void actionPerformed(ActionEvent e)
{

int a,b,c;

a=Integer.parseInt(t1.getText());
b=Integer.parseInt(t2.getText());

c=gcd(a,b);

op.insert("" ,1);
op.append(""+c);

}

public static void main(String args[])
{
euclid x = new euclid();
x.setSize(new Dimension(500,500));
x.setVisible(true);
}
}


class myWindowAdapter extends WindowAdapter
{
public void windowClosing(WindowEvent we)
{
  System.exit(0);
}
}

