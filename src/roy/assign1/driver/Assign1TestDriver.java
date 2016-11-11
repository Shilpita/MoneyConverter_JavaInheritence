/**
 * 
 */
package roy.assign1.driver;

import roy.assign1.q1.USMoneyTester;
import roy.assign1.q2.Q2TestCase;

/**
 * @author Shilpita Roy(W1190513)
 * COEN275 Fall2016 Assign1 Question1 and 2 Tester class
 */
public class Assign1TestDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		USMoneyTester test1 = new USMoneyTester();
		Q2TestCase test2 = new Q2TestCase();
		System.out.println("\n******************************** TEST CASES FOR Q1 *************************************\n");
		test1.q1TestCase();
		System.out.println("\n******************************** TEST CASES FOR Q2 *************************************\n");
		test2.q2TestCase();

	}

}
