/**
 * Tester class to test the USMoney program
 */
package roy.assign1.q1;

import roy.assign1.money.USMoney;

/**
 * @author Shilpita Roy(W1190513)
 * COEN275 Fall2016 Assign1 Question1 Tester class
 */
public class USMoneyTester {

	/**
	 * @param args
	 */
//public static void main(String[] args) {
  public void q1TestCase(){
	  
		//Creating instances using default constructor
		System.out.println("Testing object creation using default constructors");
	    USMoney amt1 = new USMoney();
		System.out.println("amt1="+ amt1);
		
		System.out.println("\nTesting setter functions below:- \n");
		//Testing for invalid input.
		System.out.println("Testing INVALID negative inputs for setter functions");
		amt1.setCents(-12);
		amt1.setDollars(-13);
		
		//Test setter methods
		amt1.setCents(250);
		System.out.println("\nSetCents amt1="+ amt1);

		amt1.setDollars(10);
		System.out.println("SetDollars amt1="+ amt1);
		//Test getter methods
		System.out.println("\nTesting getter methods below to print dollars and cents");
		System.out.println("amt1: "+amt1.getDollars()+" dollars and "+amt1.getCents()+" cents.");
		
		//Test addTo method
		System.out.println("\nTesting addTo() using INVALID inputs :");
		amt1.addTo(-12,90);
		amt1.addTo(25, 100);
		System.out.println("\nAfter adding to amt1 using addto(12, 490)");
		System.out.println("amt1="+ amt1);
		//System.out.println("amt1: "+amt1.getDollars()+" dollars and "+amt1.getCents()+" cents.");
		
		//Creating instances using parameterized constructor
		System.out.println("\nTesting object creation using parameterized constructors:-");
		System.out.println("\nTesting creating objects with INVALID negative inputs");
		USMoney amt0 = new USMoney(-15,-80);
		System.out.println("\nTesting parameterized object creation using valid input");
		USMoney amt2 = new USMoney(15,80);
		System.out.println("amt2="+amt2);
		//System.out.println("amt2: "+amt2.getDollars()+" dollars and "+amt2.getCents()+" cents.");
		
		System.out.println("\nAfter adding amt1 "+ amt1 +" to amt2 "+ amt2+" using addto() and getter methods:");
		amt2.addTo(amt1.getDollars(), amt1.getCents());
		System.out.println("amt1="+ amt1);
		System.out.println("amt2="+ amt2);
		
		//Creating instance using add method
		System.out.println("\nAfter adding amt1 "+ amt1 +" to new USMoney instance amt3 using add(13,89):");
		USMoney amt3 = amt1.add(new USMoney(13,89));
		System.out.println("amt1="+ amt1);
		System.out.println("amt3="+ amt3);	
		
		//Creating instance using add method
		System.out.println("\nAfter adding amt2 "+ amt2 +" to new USMoney instance amt4 using add(13,83):");
		USMoney amt4 = amt2.add(new USMoney(13,83));
		System.out.println("amt2="+ amt2);
		System.out.println("amt4="+ amt4);
		
		System.out.println("\nAfter adding amt1 "+ amt1 +" to amt4 "+amt4 +"  using add():");
		System.out.println("amt4="+ amt4.add(amt1));
		
		USMoney amt5 = new USMoney(99,120);
		System.out.println("amt5="+ amt5);
		System.out.println("\nAfter adding 99 dollars and 120 cents to amt5 "+ amt5+" using addto() and getter methods:");
		amt5.addTo(99, 120);
		System.out.println("amt5="+ amt5);
	}

}
