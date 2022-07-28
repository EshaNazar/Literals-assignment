import java.awt.*;
import javax.swing.*;
 
 class MainGUI
{
  public static void main(String args[])
    {
      JFrame frm= new JFrame();
      Container con=frm.getContentPane();
      GridLayout gl= new GridLayout();
      con.setLayout(gl);
      JButton btn1= new JButton("click Here1");
      JButton btn2= new JButton("click Here2");
      con.add(btn1);
      con.add(btn2);
      frm.setVisible(true);
      frm.setSize(400,600);
      frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     }
}
