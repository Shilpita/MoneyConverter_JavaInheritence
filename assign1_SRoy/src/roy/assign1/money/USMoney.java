package roy.assign1.money;

/**
 * @author Shilpita Roy(W1190513)
 * COEN275 Fall2016 Assign1 Question1 Tester class
 */

public class USMoney {
	private int dollars;
	private int cents;
	
	/**
	 *  default constructor
	 */
	public USMoney(){
		this.dollars = 0;
		this.cents = 0;
	}
	
	/**
	 * constructor initializes dollars and cents
	 * @param dollars
	 * @param cents
	 */
	public USMoney(int dollars, int cents){
			this.dollars = checkInput(dollars);
			int temp = checkInput(cents);
			if(temp > 99){
					this.dollars = this.dollars + (int)centToDollar(temp);
					this.cents   = temp%100;
			}else{
				this.cents = temp;
			}
	}
	
	/*
	//constructor initializes using float
	public USMoney(double amount){
		if(amount >= 0){
			this.dollars = (int)amount;
			this.cents   = (int)((amount - this.dollars)*100);
		}
	}
	*/
	
	/**
	 * setter methods 
	 * @param dollars
	 * @param cents
	 */
	public void setDollars(int dollars){
		this.dollars = checkInput(dollars);
	}
	
	public void setCents(int cents){
		int temp = checkInput(cents);
		if(temp > 99){
				setDollars(getDollars() + (int)centToDollar(temp));
				this.cents   = temp%100;
		}else{
			this.cents = temp;
		}
	}
	
	
	/**
	 *  getter methods
	 * @return int
	 */
	public int getDollars(){
		return this.dollars;
	}
	
	public int getCents(){
		return this.cents;
	}
	
	/**
	 *  check validity of entered input
	 * @param val
	 * @return int
	 */
	private int checkInput(int val){
		if(val < 0 || val > Integer.MAX_VALUE){
			System.out.println("INVALID INPUT: "+ val);
			return 0;
		}
		else
		    return val;		
	}
	
	/**
	 *  Convert cents to dollars
	 * @param cents
	 * @return float
	 */
	private float centToDollar(int cents){
		return (float)cents/100;
	}
	
	/**
	 *  add to dollars and cents.
	 * @param dollars
	 * @param cents
	 */
	public void addTo(int dollars , int cents){
		if(dollars >= 0 && cents >= 0){
			setCents(checkInput(cents) + getCents());
			setDollars(getDollars() + checkInput(dollars));
		}else
			System.out.println("INVALID INPUT: "+ dollars +" dollars and "+ cents+" cents");
			
	}
	
	/**
	 *  add USMoney amount to another USMoney amount
	 * @param m
	 * @return USMoney
	 */
	public USMoney add(USMoney m){
		USMoney m1 = new USMoney();
		//System.out.println(this.cents + m.getCents());
		m1.setCents(this.cents + m.getCents());
		//System.out.println(m1.getCents() +" "+m1.getDollars());
		m1.setDollars(this.dollars + m.getDollars() +m1.getDollars());
		return m1;
	}
	
	@Override
	public String toString() {
		return "$"+ getDollars()+"."+ ((getCents()<10)?("0"+getCents()):getCents());
	}
}
