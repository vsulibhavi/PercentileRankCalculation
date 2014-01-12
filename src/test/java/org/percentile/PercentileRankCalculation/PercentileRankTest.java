package org.percentile.PercentileRankCalculation;

import static junit.framework.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith(Parameterized.class)
public class PercentileRankTest {

	List<Double> scores;
	Double score;
	
	public PercentileRankTest(List<Double> scores, Double score) {

		this.scores = scores;
		this.score = score;
	}
	
	@Parameters
	public static Collection<Object[]> getData()
	{
	List<Object[]> inputList = Arrays.asList(new Object[][]{
			{Arrays.asList(new Double[]{50.0, 65.0, 70.0, 72.0, 72.0, 78.0, 
				80.0, 82.0, 84.0, 84.0, 85.0, 86.0, 88.0, 88.0, 
				90.0, 94.0, 96.0, 98.0, 98.0, 99.0}), 84.0}
			});
		
		return inputList;
	}
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	
	
	@Test
	public void testGetPercentileRank() {
		
		assertEquals(45.0,PercentileRank.getPercentileRank(this.scores,this.score));
	
	}

}
