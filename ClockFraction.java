import java.util.*;
public class ClockFraction {

	static List<Double> vals = new ArrayList<Double>();
	
	static public boolean isInArray(List<Double> a, Double key) {
		if(a.contains(key)) return true;
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Create an array to store the unique fractional values
		int count = 0;
		int duplicates = 0; //for debugging
		for(double i = 1.0; i < 13.0; i++) { //traverse through an array index of a 12 hour format
			for(double j = 0; j < 61.0; j++) { //now traverse through an array denoting the minutes
				//compute the fraction
				double temp = i/j;
				//now check for duplicates of that value
				if(isInArray(vals, temp)) {
					duplicates++;
					continue;
				}
				else{
					vals.add(count, temp);
					count++;
				}
				
			}
		}
		System.out.println("count = " + count);
		System.out.println("Duplicates = " + duplicates);
		for(int i = 0; i < 5; i++) {
			System.out.println(vals.get(i));
		}
		
	}

}
