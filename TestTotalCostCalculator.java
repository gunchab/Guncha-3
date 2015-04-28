import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TestTotalCostCalculator {

	TotalCost tc;
	@Before
	public void setUp() throws Exception {
		 tc = new TotalCost();
	}

	@After
	public void tearDown() throws Exception {
		tc = null;
	}

	@Test
	public void test_ValidAmount_TypeAsNecessary() {
		//Test the totalcostCalculator method with valid amount and type as Necessary.
		int ans = tc.totalCostCalculator(4500, "necessary");
		assertEquals(4545,ans);
	} 
	@Test
	public void test_ValidAmount_TypeAsLuxury() {
		//Test the totalcostCalculator method with valid amount and type as Luxury.
		int ans = tc.totalCostCalculator(4500, "Luxury");
		assertEquals(4905,ans);
	}
	@Test
	public void test_ValidAmount_InvalidType() {
		//Test the totalcostCalculator method with valid amount and type as Luxury.
		int ans = tc.totalCostCalculator(4500, "Invalid");
		assertEquals(0,ans);
	}
	
}
