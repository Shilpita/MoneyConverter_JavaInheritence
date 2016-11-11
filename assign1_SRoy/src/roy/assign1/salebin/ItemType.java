/**
 * Interface to declare methods for ItemType
 */
package roy.assign1.salebin;

import roy.assign1.money.USMoney;

/**
 * @author Shilpita Roy(W1190513)
 * COEN275 Fall2016 Assign1 Question1 Tester class
 */

public interface ItemType {
	   public boolean isFragile();
	   public USMoney getPrice();
	   public double getWeight();
	   public String getDetails();
	   public String getItemName();
}
