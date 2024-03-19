class StarString{
 public static void main(String[]args){
String s1="Good Morning";
System.out.println(s1);
System.out.println("To upper case:"+s1.toUpperCase());
System.out.println("\nTo lower case:"+s1.toLowerCase());
}
}
  				output

	mlm@mlm-Vostro-3902:~$ java StarString
	Error: Could not find or load main class StarString
	Caused by: java.lang.ClassNotFoundException: StarString
	mlm@mlm-Vostro-3902:~$ javac StarString.java
	mlm@mlm-Vostro-3902:~$ java StarString
	Good Morning
	To upper case:GOOD MORNING

	To lower case:good morning

