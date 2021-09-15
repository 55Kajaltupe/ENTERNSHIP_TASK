package swingGUI;
import javax.swing.*;
import java.awt.*; 
 
public class ButtonText { 
  public static void main(String[] args) {
  Frame frame=new Frame("Button Frame");
  Button button = new Button("Submit"); 
  frame.add(button); 
  frame.setLayout(new FlowLayout());
  frame.setSize(200,100);
  frame.setVisible(true);
  frame.addWindowListener(new WindowAdapter(){
  public void windowClosing(WindowEvent e){
  System.exit(0);
  }
  });
  }
}
