import java.util.Arrays;

public class mxmin{
	public static void main(String[] arg){
		int[] array = new int[] {1,2,3,4,5,6,7,8,9,0};
		System.out.println("MAXIMUM NUMBER IS = " + Arrays.stream(array).max().getAsInt());
		System.out.println("MINIMUM NUMBER IS = " + Arrays.stream(array).min().getAsInt());
	}
}