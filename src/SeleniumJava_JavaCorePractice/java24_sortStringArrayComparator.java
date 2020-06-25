package SeleniumJava_JavaCorePractice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;

public class java24_sortStringArrayComparator {

	public static void main(String[] args) throws Exception {

		Locale locales[] = Locale.getAvailableLocales();

		System.out.println("Unsorted:");
		displayLocales(locales);

		Comparator<Locale> localeComparator = new Comparator<Locale>() {
			public int compare(Locale locale1, Locale locale2) {
				return locale1.toString().compareTo(locale2.toString());
			}
		};
		Arrays.sort(locales, localeComparator);

		System.out.println("Sorted:");
		displayLocales(locales);
	}

	public static void displayLocales(Locale[] locales) {
		for (Locale locale : locales) {
			System.out.print(locale.toString());
			if (locale != locales[locales.length - 1]) {
				System.out.print(", ");
			}
		}
		System.out.println("\n");
	}
}
