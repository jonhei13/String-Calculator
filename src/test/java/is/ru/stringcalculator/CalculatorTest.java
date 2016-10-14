package is.ru.stringcalculator;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class CalculatorTest {

	public static void main(String args[]) {
      org.junit.runner.JUnitCore.main("is.ru.stringcalculator.CalculatorTest");
    }

	@Test
	public void testEmptyString() {
		assertEquals(0, Calculator.add(""));
	}

	@Test
	public void testOneNumber() {
		assertEquals(1, Calculator.add("1"));
	}

	@Test
	public void testTwoNumbers() {
		assertEquals(3, Calculator.add("1,2"));
	}	

    	@Test
	public void testMultipleNumbers(){
    		assertEquals(6, Calculator.add("1,2,3"));

	}
	@Test 
	public void testAddNumbers(){
		assertEquals(11, Calculator.add("5,6"));
	} 

	@Test
	public void testAddNumbers1(){
		assertEquals(20, Calculator.add("10,10"));
	}



}

