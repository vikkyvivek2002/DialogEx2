import java.awt.*;
import java.awt.event.*;
public class DialogEx2 extends WindowAdapter implements ActionListener
{
Frame frame;
Label label1;
TextField field1;
Button button1, button2, button3;
Dialog d1, d2, d3;

DialogEx2()
{
frame = new Frame("Frame");
button1 = new Button("Open Modal Dialog");


label1 = new Label("Click on the button to open a Modal Dialog");

frame.add(label1);
frame.add(button1);

button1.addActionListener(this);
//frame.pack();

frame.setLayout(new FlowLayout());
frame.setSize(330,250);
frame.setVisible(true);
frame.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
            System.exit(0);
         }        
      }); 
}

public void actionPerformed(ActionEvent ae)
{

if(ae.getActionCommand().equals("Open Modal Dialog"))
{
//Creating a non-modeless blocking Dialog
d1= new Dialog(frame,"Modal Dialog",true);
Label label= new Label("You must close this dialog window to use Frame window",Label.CENTER);
d1.add(label);

d1.addWindowListener(this);
d1.pack();
d1.setLocationRelativeTo(frame);
d1.setLocation(new Point(100,100));
d1.setSize(400,200);
d1.setVisible(true);
}

}

public void windowClosing(WindowEvent we)
{
d1.setVisible(false);
}

public static void main(String...ar)
{
new DialogEx2();
}

}