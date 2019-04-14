package ashwin.manur.APCSA.hw.Chapter10;

/**
 * This class implements a vendor that sells one kind
 * of items. A vendor carries out sales transactions.
 */
public class Vendor
{
  // Fields:
  private int vStock;
  private int vPrice;
  private int vDeposit;
  private int vChange;
  private static double totalSales;
  

  /**
   * Constructs a Vendor
   * @param price the price of a single item in cents (int)
   * @param stock number of items to place in stock (int)
   */
   
   public Vendor(int price, int stock){
      vPrice = price;
      vStock = stock;
      vDeposit = 0;
      vChange = 0;
   }

  /**
   * Sets the quantity of items in stock.
   * @param qty number of items to place in stock (int)
   */

   public void setStock(int stock){
      vStock = stock;
   }

  /**
   * Returns the number of items currently in stock.
   * @return number of items currently in stock (int)
   */

   public int getStock(){
      return vStock;
   }

  /**
   * Adds a specified amount (in cents) to the
   * deposited amount.
   * @param number of cents to add to the deposit (int)
   */

   public void addMoney(int cents){
      vDeposit += cents;
   }

  /**
   * Returns the currently deposited amount (in cents).
   * @return number of cents in the current deposit (int)
   */

   public int getDeposit(){
      return vDeposit;
   }

  /**
   * Implements a sale.  If there are items in stock and
   * the deposited amount is greater than or equal to
   * the single item price, then adjusts the stock and
   * calculates and sets change, sets deposit to 0 and
   * returns true; otherwise refunds the whole deposit
   * (moves it into change) and returns false.
   * @return true for a successful sale, false otherwise (boolean)
   */

   public boolean makeSale(){
      if(vStock != 0 && vDeposit >= vPrice){
         vStock--;
         vChange = vDeposit - vPrice;
         vDeposit = 0;
         totalSales += vPrice * .01;
         return true;
      }
      else{
         vChange = vDeposit;
         return false;
      }      
   } 

  /**
   * Returns and zeroes out the amount of change (from
   * the last sale or refund).
   * @return number of cents in the current change (int)
   */

   public int getChange(){
      int temp = vChange;
      vChange = 0;
      return temp;
   }
   
   public static double getTotalSales(){
     double temp = totalSales;
     totalSales = 0;
     return temp;
   }
   
}
