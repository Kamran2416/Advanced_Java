import java.awt.*;
import java.applet.*;

public class p2_2 extends Applet {
    p2_2() {
        Frame f = new Frame();
        List l = new List();
        l.setMultipleSelections(true);
        l.add("The times of india");
        l.add("Mumbai Mirror");
        l.add("Economic times");
        f.add(l);
        f.setVisible(true);
        f.setSize(400, 400);
        f.setLayout(new FlowLayout());
    }

    public static void main(String[] args) {
        p2_2 cd = new p2_2();
    }
}
