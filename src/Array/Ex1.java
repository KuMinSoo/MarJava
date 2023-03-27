package Array;

public class Ex1 {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		int sum = 0;
		int i = 0;
		for (int a : arr) {

			sum += arr[i];
			i++;
		}

		System.out.println("sum=" + sum);

		int arr1[] = { 10, 20, 30, 40, 50 };
		sum = 0;

		for (i = 0; i < arr1.length; i++) {
			sum += arr[i];
		}
		System.out.println("sum=" + sum);

		int[][] arr2 = { { 5, 5, 5, 5, 5 }, { 10, 10, 10, 10, 10 }, { 20, 20, 20, 20, 20 }, { 30, 30, 30, 30, 30 } };
		int total = 0;
		float average = 0;

		int count=0;
		for(i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2[i].length;j++) {
				total+=arr2[i][j];
				count++;
			}
		}
		average=total/(count*1.f);
		
		System.out.println("total=" + total);
		System.out.println("average=" + average);

	}

}
