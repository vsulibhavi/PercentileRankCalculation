package org.percentile.PercentileRankCalculation;
import java.util.Collections;
import java.util.List;


public class PercentileRank {

	List<Double> values;
	private Double value;
	
	public PercentileRank(List<Double> values, Double value) {

		this.values = values;
		this.value = value; 
	
	}
	
	
	public double getPercentileRank( ) {
	
		int cl =0;
		int fi =0;
		long roundOfValue = Math.round(value);
		Collections.sort(values);
		
		int i =0;
		for(i=0; i< values.size() ; i++)
		{
			if(roundOfValue > Math.round(values.get(i)))
				cl++;
			else
				break;
		}
		
		while(i< values.size())
		{
			if(roundOfValue == Math.round(values.get(i)))
			{
				fi++;
			}
			else
				break;
			i++;
		}
		
		return (cl + ( 0.5 * fi)) / values.size() * 100;
		
	}


	
}
