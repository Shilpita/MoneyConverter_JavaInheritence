package roy.assign1.salebin;

import roy.assign1.money.USMoney;

/**
 * @author Shilpita Roy(W1190513)
 * COEN275 Fall2016 Assign1 Question1 Tester class
 */

public class SmartBin extends Bin {
	private String label;
	private final USMoney HANDLING_COST = new USMoney(10,0);
	private final static String PREFIX_SMARTBIN="SM";
	
	public SmartBin(){
		super();
		this.label ="NOT FRAGILE"; 
		this.binNumber = this.binNumber.replaceAll(PREFIX_BIN, PREFIX_SMARTBIN); 
		this.items = new ItemType[MAX_ITEM];
	}
	
	/**
	 * Setter and Getter for Labels
	 * @param label
	 * @return String
	 */
	public void setLabel(String label){
		this.label = label; 
	}
	
	public String getLabel(){
		return this.label;
	}
	
	/**
	 *  Method to add all item to smart bin without exceeding MAX_WEIGHT of BIN.
	 *  Mark Smart Bin as "Fragile handle with care" if items fragile
	 *  @param ItemType
	 */
	public void addItem(ItemType item) {
			if(item.getWeight() >=0){
				if(MAX_WEIGHT >= (getWeight() + item.getWeight())){
						if(index < MAX_ITEM){
							items[index++] = item;
						}
						System.out.println("ITEM ADDED TO SMARTBIN:" +item.getItemName());
						if(item.isFragile()) 
							setLabel("FRAGILE- Handle with Care");
				}else
					System.out.println("ALERT: Unable to add item "+ item.getItemName() +".Max weight of Bin exceeds.");
			}		
	}
	
	/**
	 * Method to calculate the price of the smart bin
	 * @return USMoney
	 */
	public USMoney calculatePrice() {
		USMoney totalPrice = new USMoney();
		for(ItemType i : items){
			if(i!= null){
				totalPrice = totalPrice.add(i.getPrice());
				if(i.isFragile())
					totalPrice = totalPrice.add(HANDLING_COST);
			}
		}
		return getNoOfItems() > 0 ? totalPrice.add(BIN_COST): totalPrice;
	}
	
	public String showDetails() {
		return "SMARTBIN DETAIL: "+ getBinNumber()+"\tLabel: "+ getLabel() +"\tCurrentWeight:"+ getWeight()+"lbs\tTotalCost:"+ calculatePrice();
	}

}
