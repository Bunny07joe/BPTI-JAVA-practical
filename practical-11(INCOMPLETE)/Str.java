public class Str{
    public static void main(String[] args) {
        String str = "Hello, World!";
        
        // Length of the string
        int length = str.length();
        System.out.println("Length of the string: " + length);
        
        // Character at specific index
        char charAtIndex = str.charAt(7);
        System.out.println("Character at index 7: " + charAtIndex);
        
        // Substring from index 7 to end
        String substring = str.substring(7);
        System.out.println("Substring from index 7 to end: " + substring);
        
        // Substring from index 7 to 12
        String substring2 = str.substring(7, 12);
        System.out.println("Substring from index 7 to 12: " + substring2);
        
        // Index of first occurrence of 'o'
        int indexOfO = str.indexOf('o');
        System.out.println("Index of first occurrence of 'o': " + indexOfO);
        
        // Index of first occurrence of "World"
        int indexOfWorld = str.indexOf("World");
        System.out.println("Index of first occurrence of 'World': " + indexOfWorld);
        
        // Index of last occurrence of 'o'
        int lastIndexOfO = str.lastIndexOf('o');
        System.out.println("Index of last occurrence of 'o': " + lastIndexOfO);
        
        // Check if string starts with "Hello"
        boolean startsWithHello = str.startsWith("Hello");
        System.out.println("String starts with 'Hello': " + startsWithHello);
        
        // Check if string ends with "World!"
        boolean endsWithWorld = str.endsWith("World!");
        System.out.println("String ends with 'World!': " + endsWithWorld);
        
        // Replace 'o' with 'x'
        String replacedString = str.replace('o', 'x');
        System.out.println("String after replacing 'o' with 'x': " + replacedString);
        
        // Convert to lowercase
        String lowerCaseStr = str.toLowerCase();
        System.out.println("String in lowercase: " + lowerCaseStr);
        
        // Convert to uppercase
        String upperCaseStr = str.toUpperCase();
        System.out.println("String in uppercase: " + upperCaseStr);
        
        // Remove leading and trailing whitespaces
        String stringWithWhitespaces = "  Hello, World!   ";
        String trimmedStr = stringWithWhitespaces.trim();
        System.out.println("String after trimming: " + trimmedStr);
        
        // Check if string is empty
        String emptyStr = "";
        boolean isEmpty = emptyStr.isEmpty();
        System.out.println("Is the string empty: " + isEmpty);
    }
}
