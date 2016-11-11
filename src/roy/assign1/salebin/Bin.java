package roy.assign1.salebin;

import roy.assign1.money.USMoney;

/**
 * @author Shilpita Roy(W1190513)
 * COEN275 Fall2016 Assign1 Question2 Bin type class
 */

public class Bin implements BinType{
	
    protected String binNumber;
    protected ItemType[] items;
    protected final static String PREFIX_BIN = "BIN";
    protected final double MAX_WEIGHT = 500.0;
	protected static int counter = 0;
	protected final USMoney BIN_COST = new USMoney(100,00);
	protected final int MAX_ITEM = 10;
	protected static int index =0;
	
	public Bin(){
		this.binNumber = PREFIX_BIN+generateBinNumber();
	    this.items = new ItemType[MAX_ITEM];
	}
	/**
	 * Generate unique bin number using incremental counter
	 * @return
	 */
	protected int generateBinNumber(){
		return ++counter ;
	}
	
	/**
	 * Getter method for bin number
	 * @return
	 */
	public String getBinNumber(){
		return this.binNumber;
	}
	
	/**
	 *  Implement methods from interface 
	 *  @see roy.assign1.salebin.BinType
	 **/
	
	/**
	 *  Method to add only non fragile item to bin without exceeding MAX_WEIGHT of BIN
	 *  @param ItemType
	 */
	@Override 
	public void addItem(ItemType item) {
		if(!item.isFragile()){
			if(item.getWeight() >=0){
				if(MAX_WEIGHT >= (getWeight() + item.getWeight())){
						if(index < MAX_ITEM){
							items[index++] = item;
						}
							
						System.out.println("ITEM ADDED TO BIN: " +item.getItemName());
				}else
					System.out.println("ALERT: Unable to add item "+ item.getItemName() +". Max weight of Bin exceeds.");
			}
		}else
			System.out.println("ALERT: Unable to add item. "+item.getItemName()+" is FRAGILE.");	
	}

	/**
	 * Method to calculate the price of the bin
	 * @return USMoney
	 */
	@Override
	public USMoney calculatePrice() {
		USMoney totalPrice = new USMoney();
		for(ItemType i : items){
			if(i!=null)
			 totalPrice = totalPrice.add(i.getPrice());
		}
		return getNoOfItems() > 0 ? totalPrice.add(BIN_COST): totalPrice;
	}

	/**
	 * getter method for weight
	 * @return double
	 */
	@Override
	public double getWeight() {
		double totalWeight =0;
		for(ItemType i : this.items){
			if(i!=null)
			totalWeight+= i.getWeight();
		}
		return totalWeight;
	}

	/**
	 * getter method for number of items added to bin
	 * @return int
	 */
	@Override
	public int getNoOfItems() {
		int i=0;
		while(this.items[i] != null)
			i++;
		return i;
	}

	@Override
	public String showDetails() {
		return "BIN DETAIL:"+ getBinNumber()+"\tCurrentWeight:"+ getWeight()+"lbs\tTotalCost:"+ calculatePrice();
	}

}
