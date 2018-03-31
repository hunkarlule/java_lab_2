package lule.hunkar.provincesofcanada;
public class Driver {

	public static void main(String[] args) {
		
//		System.out.println("****creating province with default values and printing details with getDetails()****");
		System.out.println("****creating province with default values and printing details with getDetails()****\n");
		Province myProvince = new  Province();
		System.out.println(myProvince.getDetails());
		System.out.println("========================================================\n");
		
		System.out.println("****creating province when specified values (\"Alberta\", \"Edmonton\", 38) are valid and printing details with getDetails()****\n");
		Province myProvince2 = new  Province("Alberta", "Edmonton", 38);
		System.out.println(myProvince2.getDetails());
		System.out.println("========================================================\n");
		
		System.out.println("****creating province when specified values (\"AlbertaX\", \"Edmonton\", 39) are NOT valid and printing details with getDetails()****\n");
		Province myProvince3 = new  Province("AlbertaX", "Edmonton", 39);
		System.out.println(myProvince3.getDetails());
		System.out.println("========================================================\n");
		

		System.out.println("****creating country, printing details with displayAllProvinces()****\n");
		Country myCountry = new Country();
		myCountry.displayAllProvinces();
		System.out.println("========================================================\n");
		System.out.println("****test for howManyHaveThisPopulation(int, int) method****\n");
		System.out.println(myCountry.howManyHaveThisPopulation(2, 7));
		
	}

}
