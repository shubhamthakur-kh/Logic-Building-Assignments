class StringPoolInternQ30{
	public static void main(String args[]){
		String str1 = new String("hello");
		String str2 = str1.intern();
		String str3 = "hello";
		
		System.out.print("is str2 and str3 pointing to the same object ?" );
		System.out.print(str2==str3);
	}
}

/*
is str2 and str3 pointing to the same object ?true
*/