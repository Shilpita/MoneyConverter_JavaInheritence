package roy.assign1.salebin;

import roy.assign1.money.USMoney;

/**
 * @author Shilpita Roy(W1190513)
 * COEN275 Fall2016 Assign1 Question1 Tester class
 */

public class SaleItem implements ItemType{
	
	private String itemName;
	private USMoney price;
	private double weight;
	private boolean fragile;

	/**
	 * default constructor
	 **/
	public SaleItem(){
		this.fragile = false;
		this.itemName= "Not Set";
		this.price = new USMoney();
		this.weight =0;
	};
	
	/**
	 * constructor with parameters
	 * @param itemName
	 * @param price
	 * @param weight
	 * @param fragile
	 **/
	@SuppressWarnings("unused")
	public SaleItem(String itemName, USMoney price , double weight,boolean fragile){
		if(!itemName.isEmpty() || itemName != null)
			this.itemName =itemName;
		else
			System.out.println("ERROR: INVALID ITEM NAME");
		
		this.price = price;
		if(weight >= 0)
			this.weight = weight;
		else
			System.out.println("ERROR: INVALID NEGATIVE WEIGHT. ITEM "+ this.itemName +" NOT CREATED.");
		
		this.fragile = fragile;
	}

	/**
	 **implementing getter methods from interface
	 * @see roy.assign1.salebin.ItemType
	 */
	@Override
	public boolean isFragile() {
		return this.fragile;
	}

	@Override
	public USMoney getPrice() {
		return this.price;
	}

	@Override
	public double getWeight() {
		return this.weight;
	}
	
	public String getItemName() {
		return this.itemName;
	}

	@Override
	public String getDetails() {
		return getItemName() +"\t costs "+ getPrice() ; //+"\t weighs "+getWeight()+" lbs.";
	}


	/**
	 *  setter methods
	 **/
	@SuppressWarnings("unused")
	public void setItemName(String itemName){
		if(!itemName.isEmpty() || itemName != null)
			this.itemName =itemName;
		else
			System.out.println("Invalid ItemName");
	}
	
	public void setWeight(double weight){
		if(weight >= 0)
			this.weight = weight;
		else
			System.out.println("Invalid weight");
	}
	
	public void setFragile(boolean fragile){
		this.fragile = fragile;
	}

}
