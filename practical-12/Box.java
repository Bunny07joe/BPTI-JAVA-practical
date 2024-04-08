public class Box{
	public static void  main(String args[]){
		// Declare & intionalized Int value You can choose any Primitive value
		int intvalue = 10;

		// Boxing values using wrapper class Method WrapperClass.ValueOf(value that want Box) 
		Integer intBox = Integer.valueOf(intvalue);
				
		// unboxing value using wrapper class Method Value() use before datatype
		int unbox = intBox.intValue();
		
		System.out.println("Box Value : " + intBox + " -> Unbox Value : " + unbox );
	
		
		 
	}
}