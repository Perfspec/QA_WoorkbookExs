
public class Runner {
	public static void main(String[] args) {
		System.out.println(compare2Value("KubbaChubba"));
		System.out.println(compare2Value("Kowabunga"));
		System.out.println(compareStrings("Kowabunga","Durka"));
		System.out.println(compareStrings("Kowabunga","Kowabunga"));
	}
	
	public static boolean compare2Value(String s) {
		String value = "Kowabunga";
		return value.equals(s);
	}
	
	public static boolean compareStrings(String s, String t) {
		return t.equals(s);
	}

}
