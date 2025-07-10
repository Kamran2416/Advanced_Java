import java.applet.*;
import java.awt.*;
import java.util.*;

public class p1_2 extends Applet {
    p1_2() {
        Frame f = new Frame("Sample Form");
        Label l1 = new Label();
        l1.setText("Enter your name");
        TextField tf = new TextField("abc");
        Label l2 = new Label("Enter your address");
        TextArea tx = new TextArea("", 3, 40);
        Button b = new Button("Submit");
        f.add(l1);
        f.add(tf);
        f.add(l2);
        f.add(tx);
        f.add(b);
        f.setSize(400, 400);
        f.setLayout(new FlowLayout());
        f.setVisible(true);
    }

    public static void main(String[] args) {
        p1_2 newapplet = new p1_2();

    }
}
