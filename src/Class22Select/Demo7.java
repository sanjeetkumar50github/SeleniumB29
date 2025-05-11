package Class22Select;

public class Demo7 {

	public static void main(String[] args) {
		String[] all_lan = { "ಕನ್ನಡ", "తెలుగు", "हिन्दी" };// property file, xls,JSON

		for (String lan : all_lan) {
			String xp = "//a[text()='" + lan + "']";
			System.out.println(xp);
		}

	}

}
