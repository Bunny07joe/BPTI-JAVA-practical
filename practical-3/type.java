// all data type in java 
public class type{
	public static void main(String[] arg){
	//  Primitive data types

	byte btypevar = 127; // byte: 8-bit signed integer
	short stypevar =  32767; // short: 16-bit signed integer
	int intergervar = 2147483647; // int: 32-bit signed integer
	long longtypevar =  9223372036854775807L; 
	 /*
		long: 64-bit signed integer
		Note the 'L' suffix for long literals
	 */

	float ftypevar  = 3.14f;
	 /*
		Note the 'f' suffix for float literals
		float: 32-bit floating point
	 */

	double doubleVariable = 3.14159; //64-bit floating point
	char charectertypevar = 'A';// 16-bit Unicode character
	boolean boolenvalue = true; // boolean: true or false
	
	 // Outputting primitive data types
        System.out.println("byteVariable: " + btypevar);
        System.out.println("shortVariable: " + stypevar);
        System.out.println("intVariable: " + intergervar);
        System.out.println("longVariable: " + longtypevar);
        System.out.println("floatVariable: " + ftypevar);
        System.out.println("doubleVariable: " + doubleVariable);
        System.out.println("charVariable: " + charectertypevar);
        System.out.println("booleanVariable: " + boolenvalue);

	

	//  Reference data types
	int[] intarray = new int[]{1,2,3,4,5,6}; //array
	String message = "hello java";
	
	// Outputting reference data types
         // accessing the elements of the specified array
        for (int i = 0; i < intarray.length; i++)
            System.out.println("Element at index " + i
                               + " : " + intarray[i]);
        System.out.println("String: " + message);

	}
}