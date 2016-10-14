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
	@Test
	public void TestNewLine(){
		assertEquals(15, Calculator.add("4\n7,4"));
	}
	@Test
	public void TestNewline1(){
		assertEquals(10, Calculator.add("5\n2\n3"));
	}
	@Test
	public void TestMinus(){
		try{
			Calculator.add("-5,-2,2,1,-4");
		}catch(IllegalArgumentException ex){
			if (ex.getMessage().equals("Negatives not allowed: -5,-2,-4")){
				throw ex;
			}
		}
	}




}


