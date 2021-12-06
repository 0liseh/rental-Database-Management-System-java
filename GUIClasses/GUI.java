/*
  How 409 project worked
  Client class is made and is constructed, it calls a function
  fucntion makes another class which starts a GUI 
*/
package GUIClasses;
//Other GUIs inherit this class
import javax.swing.*;                           //package for GUIs
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.lang.*;
import java.io.*;

abstract class GUI extends JFrame{
  JFrame frame; 
  JPanel panel;
  JButton logout = new JButton("Logout");
  JButton back = new JButton("Back");
  String loggingOut = "NO";
  protected JComboBox b , b2, tOP, fBox, spotBox; 
  Vector<String> furn = new Vector<String>(2);
  Vector<String> spot = new Vector<String>(4);
  Vector<String> nums = new Vector<String>(11);
  Vector<String> types = new Vector<String>(5); 

  protected Font normalFont = new Font("Courier", Font.PLAIN, 15);
  

  GUI(){
    frame = new JFrame("Property Application");
    panel = new JPanel();
    panel.setLayout(null);
    frame.setContentPane(panel);
    
    frame.setSize(500, 500);
    frame.setLocationRelativeTo(null); // Makes window open in middle of screen
   // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // If window is closed, stop the program
    frame.setResizable(false);
    
    logout.setOpaque(false);
    logout.setBorderPainted(false);
    logout.setBounds(380 , 10, 120, 30);
    logout.setBackground(Color.WHITE);
    logout.setForeground(Color.BLUE);
    logout.setFont(new Font("Courier", Font.PLAIN, 15)); 


    back.setOpaque(false);
    back.setBorderPainted(false);
    back.setBounds(5 , 10, 80, 30);
    back.setBackground(Color.WHITE);
    back.setForeground(Color.BLUE);
    back.setFont(new Font("Courier", Font.PLAIN, 15)); 
  
    back.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        backButtonPressed();
      }
    });

    logout.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        logout();
      }
    });
    types.add("--");
    types.add("Apartment");
    types.add("Attached House");
    types.add("Detached House");
    types.add("Townhouse");
    types.add("Condo");

    nums.add("--");
    for(Integer i = 0; i <  11; i++){
      nums.add(i.toString());
    }
    furn.add("--");
    furn.add("furnished");
    furn.add("unfurnished");
    spot.add("--");
    spot.add("SW");
    spot.add("NW");
    spot.add("SE");
    spot.add("NE");

    tOP = new JComboBox(types);
    b = new JComboBox(nums);
    b2 = new JComboBox(nums);
    fBox = new JComboBox(furn);
    spotBox = new JComboBox(spot);
  }
  public void logout(){
    loggingOut = "YES";

    
  }
  public String getLoggingOut(){
    return loggingOut;
  }

  public void closeWindow(){
    frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
  }

  protected void backButtonPressed(){
   
  }
}
