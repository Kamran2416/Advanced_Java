import java.awt.*;
import java.applet.*;

public class p2_1 extends Applet {
    p2_1() {
        Frame f = new Frame();
        Choice c = new Choice();
        c.add("Maths");
        c.add("Physics");
        c.add("Chemistry");
        Label l1 = new Label("Select the subject you likeṇ");
        f.add(c);
        f.add(l1);
        f.setVisible(true);
        f.setSize(400, 400);
        f.setLayout(new FlowLayout());
    }

    public static void main(String[] args) {
        p2_1 cd = new p2_1();
    }
}
