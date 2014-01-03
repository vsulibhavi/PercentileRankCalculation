package org.percentile.PercentileRankCalculation;

import static junit.framework.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

public class PercentileRankTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Test
	public void testGetPercentileRank() {

		List<Double> double1 = Arrays.asList(new Double[]{50.0, 65.0, 70.0, 72.0, 72.0, 78.0, 80.0, 82.0, 84.0, 84.0, 85.0, 86.0, 88.0, 88.0, 90.0, 94.0, 96.0, 98.0, 98.0, 99.0});
		assertEquals(45.0,PercentileRank.getPercentileRank(double1,84.0));
		
	
	}

}
