package org.percentile.PercentileRankCalculation;
import java.util.List;


public class PercentileRank {
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static <T extends Comparable<? super T>> double getPercentileRank(List<T> values, T value ) {
	
		int cl =0;
		int fi =0;
		
		for(T ele : values)
		{
			if(((Comparable)value).compareTo(ele) > 0)
			{
				cl++;
			}
			else if(((Comparable)value).compareTo(ele) ==0)
			{
				fi++;
			}
		
		}
		
		return (cl + ( 0.5 * fi)) / values.size() * 100;
		
	}
	
}
