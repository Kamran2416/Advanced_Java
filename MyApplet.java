import java.awt.*;
import java.applet.*;

/* 
<applet code="MyApplet.class" width="300" height="300"> </applet>
*/

public class MyApplet extends Applet {
    public void init() {
        Frame frame = new Frame();
        CheckboxGroup cbg = new CheckboxGroup();
        Checkbox checkbox1 = new Checkbox("C++");
        Checkbox checkbox2 = new Checkbox("Java");
        Checkbox radioButton1 = new Checkbox("Python", cbg, false);
        Checkbox radioButton2 = new Checkbox("C", cbg, false);
        Button btn = new Button("Click Me");
        checkbox1.setBounds(100, 100, 50, 50);
        checkbox2.setBounds(100, 150, 50, 50);
        radioButton1.setBounds(100, 200, 50, 50);
        radioButton2.setBounds(100, 250, 50, 50);
        btn.setBounds(100, 300, 100, 50);

        frame.add(checkbox1);
        frame.add(checkbox2);
        frame.add(radioButton1);
        frame.add(radioButton2);
        frame.add(btn);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);

    }
}
