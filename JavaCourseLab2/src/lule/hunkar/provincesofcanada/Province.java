package lule.hunkar.provincesofcanada;
/**
 * Province class creates specified province object. It has two constructors one
 * of them creates province object with default values. Other one creates
 * province objects with specified values. It provides method to print the
 * details of a province object as a string.
 * 
 * @author Hunkar Lule
 *
 */
public class Province {

	private static final int DEFAULT_POPULATION_MILLIONS = 4;
	private static final String DEFAULT_PROVINCE = "British Columbia";
	private static final String DEFAULT_CAPITAL = "Victoria";
	private String name;
	private String capital;
	private int populationInMillions;
	private static final int MIN_POPULATION = 4;
	private static final int MAX_POPULATION = 38;

	/**
	 * Constructs a new Model with specified name, capital and population. Checks
	 * all of the specified name, capital and population is valid or not, if all of
	 * them are valid then constructs the Province with these values. Otherwise
	 * constructs the Province with default values.
	 * 
	 * @param name
	 *            name of the Province
	 * @param capital
	 *            capital of the Province
	 * @param populationInMillions
	 *            population of the Province(in millions)
	 */
	Province(String name, String capital, int populationInMillions) {
		this();
		if (isValidProvince(name) && isValidCapitalCity(capital) && isValidPopulation(populationInMillions)) {
			this.name = name;
			this.capital = capital;
			this.populationInMillions = populationInMillions;
		}
	}

	/**
	 * Constructs a new Province with default name, capital and population.
	 */
	Province() {
		this.name = DEFAULT_PROVINCE;
		this.capital = DEFAULT_CAPITAL;
		this.populationInMillions = DEFAULT_POPULATION_MILLIONS;
	}

	private boolean isValidProvince(String province) {
		String[] provinces = { "Ontario", "Quebec", "British Columbia", "Alberta", "Manitoba", "Saskatchewan",
				"Nova Scotia", "New Brunswick", "Newfoundland and Labrador", "Prince Edward Island" };

		int index = 0;
		while (index < provinces.length) {
			if (province == provinces[index]) {
				return true;
			}
			index++;
		}
		return false;
	}

	private boolean isValidCapitalCity(String capital) {
		String[] capitals = { "Toronto", "Quebec", "Victoria", "Edmonton", "Winnipeg", "Regina", "Halifax",
				"Fredericton", "St.John's", "Charlottetown" };

		for (int i = 0; i < capitals.length; i++) {
			if (capitals[i] == capital) {
				return true;
			}
		}
		return false;
	}

	private boolean isValidPopulation(int population) {
		return (population >= MIN_POPULATION && population <= MAX_POPULATION);
	}

	/**
	 * @return the name of the province
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name of the province with specified name argument. First check if
	 * the argument is a valid value or not, then sets its.
	 * 
	 * @param name
	 *            the name to the province
	 */
	public void setName(String name) {
		if (isValidProvince(name)) {
			this.name = name;
		}
	}

	/**
	 * @return the capital of the province
	 */
	public String getCapital() {
		return capital;
	}

	/**
	 * Sets the capital of the province with specified capital argument. First check
	 * if the argument is a valid value or not, then sets its.
	 * 
	 * @param capital
	 *            the capital to the province
	 */
	public void setCapital(String capital) {
		if (isValidCapitalCity(capital)) {
			this.capital = capital;
		}
	}

	/**
	 * @return the population of the province.
	 */
	public int getPopulationInMillions() {
		return populationInMillions;
	}

	/**
	 * Sets the population of the province with the specified population argument.
	 * First check if the argument is a valid value or not, then sets its.
	 * 
	 * @param populationInMillions
	 *            population of province in millions
	 * 
	 */
	public void setPopulationInMillions(int populationInMillions) {
		if (isValidPopulation(populationInMillions)) {
			this.populationInMillions = populationInMillions;
		}
	}

	/**
	 * Builds a string with attributes of object and returns it.
	 * 
	 * @return a String which is formed using onjects arttibutes.
	 */
	public String getDetails() {
		StringBuilder sb = new StringBuilder(50);
		sb.append("The Capital of ");
		sb.append(this.name);
		sb.append(" (pop. " + this.populationInMillions + " million) ");
		sb.append("is " + this.capital + ".");

		return sb.toString();
	}

	@Override
	public String toString() {
		return "Province [name=" + name + ", capital=" + capital + ", population=" + populationInMillions + "]";
	}

}
