class MultipleStringLitQ31{
	public static void main(String args[]){
		String str1 = "java";
		String str2 = "java";
		String str3 = "java";
		
		System.out.print("All strings point to the same object : ");
		System.out.print(str1==str2 || str2==str3 || str1==str3);
	}
}

/*
All strings point to the same object : true
*/