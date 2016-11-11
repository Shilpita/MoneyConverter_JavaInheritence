/**
 * Interface to declare methods for BinType
 */
package roy.assign1.salebin;

import roy.assign1.money.USMoney;

/**
 * @author Shilpita Roy(W1190513)
 * COEN275 Fall2016 Assign1 Question1 Tester class
 */

public interface BinType {

	public void addItem(ItemType item);
	public USMoney calculatePrice();
	public double getWeight();
	public int getNoOfItems();
	public String showDetails();
	
}
