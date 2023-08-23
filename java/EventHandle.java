import java.awt.*;
import java.awt.event.*;
class EventHandle extends Frame implements ActionListener{
TextField textField;
EventHandle()
{
textField = new TextField();
textField.setBounds(60,50,170,20);
Button button = new Button("Quote");
button.setBounds(90,140,75,40);
Button button1 = new Button("Reset");
button1.setBounds(20,140,75,40);

//1
button.addActionListener(this);
button1.addActionListener(this);

add(button);
add(button1);
add(textField);
setSize(250,250);
setLayout(null);
setVisible(true);
}
//2
public void actionPerformed(ActionEvent e){
textField.setText("");
}
public static void main(String[] args){
new EventHandle();
}
}

