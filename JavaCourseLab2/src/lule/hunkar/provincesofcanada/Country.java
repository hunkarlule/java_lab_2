package lule.hunkar.provincesofcanada;
import java.util.Arrays;
/**
 * Country class creates specified Country object. It provides method to print
 * to details of the porvinces which a country object holds. Also it provides a
 * method to count the number of provinces, which has a population between
 * specified minimum and maximum values, for a country object. model object.
 * 
 * @author Hunkar Lule
 *
 */
public class Country {
	private String name;
	private Province[] provinces;

	/**
	 * Constructs a country object. Set the provinces field with an array of
	 * provinces objects.
	 */
	public Country() {
		Province[] provinces = { 
				new Province("Ontario", "Toronto", 13), 
				new Province("Quebec", "Quebec", 8),
				new Province("British Columbia", "Victoria", 4), 
				new Province("Alberta", "Edmonton", 15),
				new Province("Manitoba", "Winnipeg", 8), 
				new Province("Saskatchewan", "Regina", 6),
				new Province("Nova Scotia", "Halifax", 5), 
				new Province("New Brunswick", "Fredericton", 7),
				new Province("Newfoundland and Labrador", "St.John's", 6),
				new Province("Prince Edward Island", "Charlottetown", 8) 
				};
		this.provinces = provinces;
	}

	/**
	 * Display the details of the provinces which Country holds.
	 */
	public void displayAllProvinces() {
		for (Province p : this.provinces) {
			System.out.println(p.getDetails());
		}
	}

	/**
	 * Counts the provinces which have a population between the specified min and
	 * max values for a country. Then returns the count.
	 * 
	 * @param min
	 *            minimum population
	 * @param max
	 *            maximum population
	 * @return number of the provinces which has a population between minimum and
	 *         maximum values
	 */
	public int howManyHaveThisPopulation(int min, int max) {
		int provinceCounter = 0;
		for (Province p : this.provinces) {
			if (p.getPopulationInMillions() >= min && p.getPopulationInMillions() <= max) {
				provinceCounter++;
			}
		}
		return provinceCounter;
	}

	@Override
	public String toString() {
		return "Country[name=" + name + ", provinces=" + Arrays.toString(provinces) + "]";
	}

}
