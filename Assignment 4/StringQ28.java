class StringQ28{
	public static void main(String args[]){
		String str1 = new String("hello");
		String str2= new String("hello");
		
		System.out.print("Using == : ");
		System.out.print(str1==str2);
		System.out.print("\nUsing .equals() : ");
		System.out.print(str1.equals(str2));
	}
}

/*
Using == : false
Using .equals() : true
*/