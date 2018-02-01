package DTservicesExpml;

public class AdtArrayExp {	
	private void insertEleToPos(int arr1[], int position, int value){
		
		for (int i=arr1.length-1; i>position;i--) {
			arr1[i] = arr1[i-1];
		}
		arr1[position] = value;
		showArray(arr1);
		
	}
	
	private void showArray(int arr1[]){
		System.out.println("Values of Array");
		for (int i=0; i<arr1.length;i++){
			System.out.print(arr1[i]+" ");
		}
	}


	public static void main(String[] args) {
		int arr1[] = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		AdtArrayExp aae = new AdtArrayExp();
		// TODO Auto-generated method stub
		int Index_position = 2;
		   int newValue    = 5;
		   aae.showArray(arr1);
		   aae.insertEleToPos(arr1, Index_position, newValue);

	}

}
