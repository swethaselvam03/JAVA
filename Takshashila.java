import java.awt.*;
class Takshashila extends Frame
{
public static void main (String [] args)
{
Takshashila f = new Takshashila();
f.setSize (800,600);
f.setTitle ("TAKSHASHILAILA");
f.setLayout (null);
f.setVisible (true);
}
Takshashila()
{
this.setBackground (Color. WHITE);
Panel P1 = new Panel();
P1.setLayout (null);
P1.setBackground (Color. GRAY);
P1.setBounds (50,50,700,120);
Label l0 = new Label ("TAKSHASHILA UNIVERSITY");
Label l1 = new Label ("( State private University )");
Label l2 = new Label (" Ongur, Tindivanam, Villupuram Dist.");
Font f0 = new Font ("Arial", Font.BOLD,20);
l0.setFont (f0);
l1.setFont (f0);
l2.setFont (f0);
l0.setBounds (50,10,400,30);
l1.setBounds (50,40,400,30);
l2.setBounds (50,70,400,30);
P1.add (l0);
P1.add (l1);
P1.add (l2);
this.add (P1);
Panel P2 = new Panel();
P2.setLayout (null);
P2.setBackground (Color. ORANGE);
P2.setBounds (50,180,700,50);
Label l3 = new Label ("STUDENT MARK LIST");
l3.setFont (f0);
l3.setBounds (200,10,400,30);
P2.add (l3);
this.add (P2);
Label l11 = new Label ("ENROLLMENT NO:");
l11.setBounds (50,250,150,25);
this.add (l11);
TextField t1 = new TextField (20);
t1.setBounds (220,250,200,25);
this.add (t1);
Label l12 = new Label();
l12.setBounds (50,280,150,25);
Label l13 = new Label();
l13.setBounds (50,310,150,25);
Label l14 = new Label();
l14.setBounds (50,340,180,25);
Label l15 = new Label();
l15.setBounds (50,370,150,25);
Label l16 = new Label();
l16.setBounds (150,400,150,25);
Label l4 = new Label();
l4.setBounds (220,280,200,25);
Label l5 = new Label();
l5.setBounds (220,310,200,25);
Label l6 = new Label();
l6.setBounds (220,340,170,25);
Label l7 = new Label();
l7.setBounds (220,370,200,25);
Label l8 = new Label();
l8.setBounds (220,400,200,30);
Button b1 = new Button ("OK");
b1.setBounds (300,470,100,30);
}
}