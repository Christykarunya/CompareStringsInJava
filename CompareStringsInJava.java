package week3.day2;

public class CompareStringsInJava {

	public static void main(String[] args) {
		String str1="I am Learning Java";
		String str2="I am learning java";
		System.out.println("String1: " +str1);
		System.out.println("String2: " +str2);
		System.out.println("'Compared using =='");
		if(str1==str2) {
			System.out.println("equal");
		}
		else {
			System.out.println("Not equal");
		}
		System.out.println("'Compared using .equals'");
		if(str1.equals(str2)) {
			System.out.println("Strings are equal");
		}
		else {
			System.out.println("Strings are not equal");
		}
		System.out.println("'Compare using .equalsIgnoreCase'");
		if(str1.equalsIgnoreCase(str2)) {
			System.out.println("Equal Strings");
		}
		else {
			System.out.println("Not Equal Strings");
		}
	}

}
