
public class ArrayIterate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {12, 34, 32, 45, 83};
		int arr2[] = {32, 48, 83};
		
		for (int i=0; i<arr1.length-1; i++) {
			for (int j=0; j<arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					System.out.println("Removed Value" + arr1[i]);
					arr1.length-1;
				}
			}
		}

	}

}
