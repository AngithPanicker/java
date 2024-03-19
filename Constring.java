class Constring{
    public static void main (String[]args){
        String s1="Hello";
        String s2="Word";
        String s3=s1.concat(s2);
        System.out.println(s3);
        String s4= "Good"+"Morning";
        System.out.println(s4);

    }
}

				output
				
	mlm@mlm-Vostro-3902:~$ javac Constring.java
	mlm@mlm-Vostro-3902:~$ java constring
	Error: Could not find or load main class constring
	Caused by: java.lang.ClassNotFoundException: constring
	mlm@mlm-Vostro-3902:~$ java Constring
	HelloWord
	GoodMorning
