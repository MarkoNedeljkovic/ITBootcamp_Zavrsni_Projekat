package utility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class UserInfo {

	private static final String names = "Alexis Broadway Emmy Points Kristi Witek Ronald Lamers Hien Agbayani Andra Avants Corrine Leedy Robby Mcclenton Alycia Rick Christoper Saini Rosario Costanza Melony Raffa Jerica Decaro Wilfred Galasso Virgil Wei Jude Ureno Omar Wight Apolonia Faivre Stacia Merwin Antonette Voliva Cindi Groce Cortez Reinke Bulah Danforth Melaine Seibel Trudi Reedy Woodrow Valls Bertha Denney Nina Barkman Evia Meyers Verona Empson Frederica Mealing Leola Fussell Dante Poissant Melynda Callison Tynisha Klima Norine Vanguilder Quincy Blass Jackson Deloney Judson Chestnut Joselyn Tetzlaff Wei Kupiec Margie Nieman Toi Zentz Audrea Amey Lida Loudon Kyla Hellman Leoma Grenier Ricky Jankowski Lisabeth Cogley Corie Coolidge";
	private static final String[] cities = { "Oakland", "Lubbock", "Austin", "Corpus Christi", "Anchorage", "Cleveland",
			"Honolulu", "Miami", "Rochester", "Kansas City" };
	private static final String[] countries = { "Alabama", "Alaska", "Arizona", "Arkansas", "California", "Connecticut",
			"Delaware", "Florida", "Georgia", "Hawaii", "Idaho", "Illinois", "Indiana", "Iowa", "Kansas", "Kentucky",
			"Louisiana", "Maine", "Maryland", "Massachusetts", "Michigan", "Minnesota", "Mississippi", "Missouri",
			"Montana", "Nebraska", "Nevada", "New Hampshire", "New Jersey", "New Mexico", "New York", "North Carolina",
			"North Dakota", "Ohio", "Oklahoma", "Oregon", "Pennsylvania", "Rhode Island", "South Carolina",
			"South Dakota", "Tennessee", "Texas", "Utah", "Vermont", "Virginia", "Washington", "West Virginia",
			"Wisconsin", "Wyoming" };
	private static final List<String> userNames = new ArrayList<String>(Arrays.asList(names.split(" ")));

	private static final String[] alias = { "Home", "Work", "Office" };

	private static final String[] ext = { "ab", "cd", "ef", "gh", "ij", "kl", "mn", "op", "qr", "st", "uv", "wx",
			"yz" };

	private static final Random rand = new Random();
	private static final StringBuilder sb = new StringBuilder();

	public static int nameSize() {
		return userNames.size();
	}

	public static String getNames(int i) {
		return userNames.get(i);

	}

	public static String passwordGenerator(int i) {
		sb.delete(0, sb.length());
		int num = rand.nextInt(100000);
		String numFormat = String.format("%05d", num);
		sb.append(getNames(i).charAt(0)).append(numFormat);
		return sb.toString();
	}

	public static String emailGenerator(int i) {

		sb.delete(0, sb.length());
		sb.append(getNames(i).toLowerCase()).append(".").append(getNames(i + 1).toLowerCase()).append("@test.")
				.append(ext[rand.nextInt(ext.length)]);
		return sb.toString();
	}

	public static String citieGenerator() {
		return cities[rand.nextInt(cities.length)];
	}

	public static String countryGenerator() {
		sb.delete(0, sb.length());
		sb.append("//option[contains(text(),'").append(countries[rand.nextInt(50)]).append("')]");
		return sb.toString();
	}

	public static String zipCodeGenerator() {
		int num = rand.nextInt(100000);
		String numFormat = String.format("%05d", num);
		return numFormat;

	}

	public static String phoneNumGenerator() {
		int num = rand.nextInt(1000000000);
		String numFormat = String.format("%09d", num);
		return numFormat;
	}

	public static String adressGenerator() {
		sb.delete(0, sb.length());
		String ch = "abcdefghijklmnopqrstuvwxyz";
		String adress = "";
		char[] adressCh = new char[10];

		for (int i = 0; i < adressCh.length; i++) {
			if (i == 0) {
				adressCh[i] = ch.charAt(rand.nextInt(adressCh.length));
				adressCh[i] = Character.toUpperCase(adressCh[0]);
			}
			adressCh[i] = ch.charAt(rand.nextInt(adressCh.length));
		}
		for (int i = 0; i < adressCh.length; i++) {
			adress += adressCh[i];
		}

		sb.append(adress).append(" ").append(rand.nextInt(100));
		return sb.toString();

	}

	public static String aliasGenerator() {
		return alias[rand.nextInt(alias.length)];

	}

}
