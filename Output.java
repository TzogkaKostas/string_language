public class Output {
	public static String findLangType(String langName) {return ("Java".startsWith(langName)) ? ((langName.startsWith("Java")) ? ("Static") : ((new StringBuilder("script").reverse().toString().startsWith(new StringBuilder(langName).reverse().toString())) ? ("Dynamic") : ("Unknown"))) : ((new StringBuilder("script").reverse().toString().startsWith(new StringBuilder(langName).reverse().toString())) ? ("Probably Dynamic") : ("Unknown"));}

	public static void main(String[] args) {
		System.out.println(findLangType("Java"));
		System.out.println(findLangType("Javascript"));
		System.out.println(findLangType("Typescript"));
	}
}
