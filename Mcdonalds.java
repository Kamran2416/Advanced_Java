import java.applet.Applet;
import java.awt.*;

/*
     <applet code="Mcdonalds" width="300" height="300">
     
     </applet>
*/
public class Mcdonalds extends Applet {

     public void init() {
          //Button b1 = new Button("Order Now");
          Checkbox c1 = new Checkbox("Pizza");
          Checkbox c2 = new Checkbox("Burger");
          Checkbox c3 = new Checkbox("Fries");
          Checkbox c4 = new Checkbox("Add to cart");

          add(c1);
          add(c2);
          add(c3);
          add(c4);

     }
}
