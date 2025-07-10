import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/*
     <applet code="p6" width="300" height="300">
     
     </applet>
*/
public class p6 extends JApplet implements ItemListener{
    JLabel JLabelObj;

    public void init()
    {        
        JComboBox combobox = new JComboBox();
        setLayout(new FlowLayout());
        setSize(400,400);
        combobox.addItem("Solapur");
        combobox.addItem("Pune");
        combobox.addItem("Banglore");
        combobox.addItem("Mumbai");
        combobox.addItemListener(this);
 
        JLabelObj = new JLabel();
    
        add(combobox);
        add(JLabelObj);
    }
 
    public void itemStateChanged(ItemEvent ie)
    {
        String stateName = (String) ie.getItem();
 
        JLabelObj.setText("You are in "+stateName);
    }

}
