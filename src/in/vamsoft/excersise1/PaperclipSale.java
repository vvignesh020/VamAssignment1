<<<<<<< HEAD
package in.vamsoft.excersise1;

public class PaperclipSale implements Sellable {
  private String color;
  private double boxPrice;
  private int numBoxes;

  /**
   * creating PaperclipSale as constructor.
   * @param color parameter
   * @param boxPrice parameter
   * @param numBoxes parameter
   */
  public PaperclipSale(String color, double boxPrice, int numBoxes) {
    this.color = color;
    this.boxPrice = boxPrice;
    this.numBoxes = numBoxes;
  }

  public String getColor() {
    return (color);
  }

  public double getBoxPrice() {
    return (boxPrice);
  }


  public int getNumBoxes() {
    return (numBoxes);
  }


  @Override
  public double getCost() {
    return (boxPrice * numBoxes);
  }

  @Override
  public String toString() {
	  return ("PaperclipSale: " + numBoxes + " boxes of " + color + " clips at $" + boxPrice + "/box.");
  }
}
=======
package in.vamsoft.excersise1;
/*
 * @author vignesh
 */
public class PaperclipSale implements Sellable {
  private String color;
  private double boxPrice;
  private int numBoxes;

  public PaperclipSale(String color, double boxPrice, int numBoxes) {
    this.color = color;
    this.boxPrice = boxPrice;
    this.numBoxes = numBoxes;
  }

  public String getColor() {
    return(color);
  }

  public double getBoxPrice() {
    return(boxPrice);
  }


  public int getNumBoxes() {
    return(numBoxes);
  }

  public double getCost() {
    return(boxPrice * numBoxes);
  }


  public String toString() {
    return("PaperclipSale: " + numBoxes + " boxes of " + color + " clips at $" + boxPrice + "/box.");
  }
}
>>>>>>> 35b1b732e68ed3b6596b2e23d9ec90c62220f54e
