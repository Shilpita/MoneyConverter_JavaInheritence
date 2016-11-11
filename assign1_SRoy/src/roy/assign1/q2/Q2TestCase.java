/**
 * Tester class to test the Bin program
 */
package roy.assign1.q2;

import roy.assign1.money.*;
import roy.assign1.salebin.*;

/**
 * @author Shilpita Roy(W1190513)
 * COEN275 Fall2016 Assign1 Question2 Tester class
 */

public class Q2TestCase {
	/**
	 * @param args
	 */
//	public static void main(String[] args) {
	public void q2TestCase(){
	
		SaleItem s = new SaleItem();
		System.out.println("ITEM CREATED USING DEFAULT CONSTRUCTOR:"+s.getDetails());
		
		@SuppressWarnings("unused")
		SaleItem s0 = new SaleItem("Cotton candy",new USMoney(1,99),-10,true);
		
		SaleItem s1 = new SaleItem("Music Box",new USMoney(119,99),100, true);
		SaleItem s2 = new SaleItem("Picture Frame", new USMoney(129,49), 130.0, false);
		SaleItem s3 = new SaleItem("Ice Statue", new USMoney(249,99), 200.0, false);
		SaleItem s4 = new SaleItem("Glass Statue", new USMoney(149,99), 200.0, false);
		SaleItem s5 = new SaleItem("Glassware",new USMoney(200,00),200, true);
		
		System.out.println("ITEM CREATED: " +s1.getDetails());
		System.out.println("ITEM CREATED: " +s2.getDetails());
		System.out.println("ITEM CREATED: " +s3.getDetails());
		System.out.println("ITEM CREATED: " +s4.getDetails());
		System.out.println("ITEM CREATED: " +s5.getDetails());
		
		
		Bin bin1 = new Bin();
		System.out.println("\nBIN CREATED: "+ bin1.showDetails());
		bin1.addItem(s1);
		bin1.addItem(s2);
		bin1.addItem(s3);
		bin1.addItem(s4);
		bin1.addItem(s5);
		
		System.out.println(bin1.showDetails());
	
		SaleItem s6 = new SaleItem("Dell Server", new USMoney(1000,00),100, true);
		SaleItem s7 = new SaleItem("Dell Inspirion", new USMoney(529,49), 150.0, true);
		SaleItem s8 = new SaleItem("Hp Projector", new USMoney(1249,99), 200.0, false);
		SaleItem s9 = new SaleItem("WhiteBoard", new USMoney(149,99), 200.0, false);
		SaleItem s10 = new SaleItem("Glass ware",new USMoney(200,00),200, true);
		
		System.out.println("ITEM CREATED: " +s6.getDetails());
		System.out.println("ITEM CREATED: " +s7.getDetails());
		System.out.println("ITEM CREATED: " +s8.getDetails());
		System.out.println("ITEM CREATED: " +s9.getDetails());
		System.out.println("ITEM CREATED: " +s10.getDetails());
		
		SmartBin bin2 = new SmartBin();
		System.out.println("\nBIN CREATED: "+ bin2.showDetails());
		bin2.addItem(s6);
		bin2.addItem(s7);
		bin2.addItem(s8);
		bin2.addItem(s9);
		bin2.addItem(s10);
		System.out.println(bin2.showDetails());
		
		Bin bin3 = new SmartBin();
		System.out.println("\nBIN CREATED: "+ bin3.showDetails());
		bin3.addItem(s1);
		bin3.addItem(s2);
		bin3.addItem(s3);
		bin3.addItem(s4);
		bin3.addItem(s5);
		System.out.println(bin3.showDetails());
		System.out.println("\nAns j: We are able to add Fragile items to bin3 created with dynamic type SmartBin.");
			
	}
}
