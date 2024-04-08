public class Arrmaxmin{
	public static void main(String args[]){
		// creating array initalition with declartion
		int[] arr = new int[]{10,20,30,40,50};

		int max_ele = arr[0];
		int min_ele = arr[0];
		for (int i = 0 ; i < 5; i++){
			if (max_ele > arr[i]){
				max_ele = arr[i];

			}
			if (min_ele < arr[i]){
				max_ele = arr[i];
			}
		}

		System.out.println("maximum element in array is = " + max_ele );
		System.out.println("minimum element in array is = " + min_ele);
	}
}
