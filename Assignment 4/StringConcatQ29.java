class StringConcatQ29{
	public static void main(String args[]){
		String str1 = "hello";
		String str2 = "world";
		String str3 = str1 + str2;
		
		System.out.print(" Is " + str3 +" pointing to the same object as "+ str1 + " ? ");
		System.out.print(str3==str1);
	}
}

/*
Is helloworld pointing to the same object as hello ? false
*/