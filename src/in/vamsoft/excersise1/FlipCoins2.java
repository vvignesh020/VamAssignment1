<<<<<<< HEAD
package in.vamsoft.excersise1;

import javax.swing.JOptionPane;

public class FlipCoins2 {

 /**
  * Creating main method with arguments.
  * @param args LOGIN - login of user PASSWORD - password
  */
  public static void main(String[] args) {
    String numString = JOptionPane.showInputDialog("Number of coin flips:");
    int num = Integer.parseInt(numString); // WARNING: no check for illegal values!
    String coin;
    for (int i = 0;i < num;i++) {
      if (Math.random() < 0.5) {
        coin = "Heads";
      } else {
        coin = "Tails";
      }
      System.out.println(coin);
    }
  }
=======
package in.vamsoft.excersise1;
import javax.swing.*;
/*
 * @author vignesh
 */
public class FlipCoins2 {
  
	public static void main(String[] args) {
    
		String numString =JOptionPane.showInputDialog("Number of coin flips:");
    int num = Integer.parseInt(numString);  
    String coin;
    for(int i=0; i<num; i++) {
      if (Math.random() < 0.5) {
        coin = "Heads";
      } else {
        coin = "Tails";
      }
      System.out.println(coin);
    }
  }
>>>>>>> 35b1b732e68ed3b6596b2e23d9ec90c62220f54e
}