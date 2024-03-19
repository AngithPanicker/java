class ReplaceString {
    public static void main (String[]args){
    String s1="Today  is monday";
    System.out.println("String is:"+s1);
    String s2=s1.replace("is","=");
    System.out.println(s2);
}
}
    
     					output
     			
		mlm@mlm-Vostro-3902:~$ javac ReplaceString.java
		mlm@mlm-Vostro-3902:~$ java ReplaceString
		String is:Today  is monday
		Today  = monday

