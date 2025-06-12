import java.awt.*;
class Form extends Frame
{
public static void main(String[] args)
{
Form f = new Form();
f.setSize(800,800);
f.setTitle("Application Form");
f.setLayout(null);
f.setVisible(true);
}
Form()
{
this.setBackground(new Color(245,245,245));
Panel p1 = new Panel();
p1.setLayout(null);
p1.setBackground(Color.RED);
p1.setBounds(0,50,800,100);

Label l0 = new Label("TAKSHASHILA UNIVERSITY");
Label l1 = new Label("(State Private University)");
Label l2 = new Label("Ongur,Tindivanam,Villupuram Dist");


Font f0 = new Font("Arial",Font.BOLD,28);
l0.setFont(f0);
Font f1 = new Font("Arial",Font.BOLD,22);
l1.setFont(f1);
Font f2 = new Font("Arial",Font.BOLD,20);
l2.setFont(f2);

l0.setBounds(180,10,400,30);
l1.setBounds(180,40,400,30);
l2.setBounds(180,70,400,30);

p1.add(l0);
p1.add(l1);
p1.add(l2);
this.add(p1);

Panel p2 = new Panel();
p2.setLayout(null);
p2.setBackground(Color.YELLOW);
p2.setBounds(0,180,800,50);

Label l3 = new Label("APPLICATION FORM 2025");
l3.setFont(f0);
l3.setBounds(200,10,400,30);
p2.add(l3);
this.add(p2);

Color c1 = new Color(255,0,0);
Color c2 = new Color(100,0,0);
Color c3 = new Color(0,0,255);

Label l11 = new Label("ADMISSION NUMBER");
l11.setBounds(50,230,150,25);
l11.setForeground(c3);
this.add(l11);
TextField t1 = new TextField(20);
t1.setBounds(220,230,200,25);
this.add(t1);

Label l12 = new Label("NAME OF CANDINATE");
l12.setBounds(50,260,150,25);
l12.setForeground(c2);
this.add(l12);
TextField t2 = new TextField(20);
t2.setBounds(220,260,200,25);
this.add(t2);

Label l13 = new Label("FATHER'S NAME");
l13.setBounds(50,290,150,25);
l13.setForeground(c1);
this.add(l13);
TextField t3 = new TextField(20);
t3.setBounds(220,290,200,25);
this.add(t3);

Label l14 = new Label("DATE OF BIRTH");
l14.setBounds(50, 320, 150, 25);
l14.setForeground(c3);
this.add(l14);

Choice dd = new Choice();
for(int i=1;i<=31;i++)
{
dd.addItem(""+i);
}
dd.setBounds(220, 320, 50, 30);
this.add(dd);


Choice mm= new Choice();
for(int j=1;j<=12;j++)
{
mm.addItem(""+j);
}
mm.setBounds(280, 320, 70, 25);
this.add(mm);


Choice yy= new Choice();
for(int k=1980;k<=2030;k++)
{
yy.addItem(""+k);
}
yy.setBounds(360, 320, 70, 25);
this.add(yy);


Label l15 = new Label("GENDER");
l15.setForeground(c2);
l15.setBounds(50,370,150,25);
this.add(l15);

CheckboxGroup cg = new CheckboxGroup();
Checkbox cb1 = new Checkbox("MALE",cg,false);
Checkbox cb2 = new Checkbox("FEMALE",cg,false);
cb1.setBounds(220,370,100,30);
cb2.setBounds(320,370,100,30);
this.add(cb1);
this.add(cb2);

Label l16 = new Label("ADDRESS");
l16.setBounds(50,400,150,25);
l16.setForeground(c3);
this.add(l16);

TextArea ta = new TextArea(600,100);
ta.setBounds(220,400,200,100);
this.add(ta);


Label l17 = new Label("NATIONALITY");
l17.setBounds(50,520,150,25);
l17.setForeground(c1);
this.add(l17);

Choice c4 = new Choice();
c4.addItem("SELECT");
c4.addItem("INDIA");
c4.addItem("OTHERS");
c4.setBounds(220,520,150,25);
this.add(c4);


Label l18 = new Label("SELECTED COURSE");
l18.setBounds(50,550,150,25);
this.add(l18);

Checkbox c = new Checkbox();
Checkbox cb3 = new Checkbox("MCA");
Checkbox cb4 = new Checkbox("MSC");
Checkbox cb5 = new Checkbox("BSC");
Checkbox cb6 = new Checkbox("BCA");

cb3.setBounds(220,550,100,30);
cb4.setBounds(220,600,100,30);
cb5.setBounds(220,650,100,30);
cb6.setBounds(220,700,100,30);
this.add(cb3);
this.add(cb4);
this.add(cb5);
this.add(cb6);

}
}
