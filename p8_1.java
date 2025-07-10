import java.awt.*;
import javax.swing.*;

public class p8_1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(400, 400);

        String colHeads[] = { "ID", "Name", "Salary" };

        Object data[][] = {
                { 101, "Amit", 67000 },
                { 102, "Jai", 78000 },
                { 101, "Sachin", 70000 },
        };
        JTable JTableObj = new JTable(data, colHeads);
        frame.add(JTableObj, BorderLayout.CENTER);

    }
}